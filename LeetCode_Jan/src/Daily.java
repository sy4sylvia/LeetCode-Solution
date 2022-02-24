import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Daily {
    //0118
    // 605. Can Place Flowers

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length && count < n; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; //plant here
                    count++;
                }
            }
        }
        return count == n;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


    //141 Linked List Cycle
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false; //only one node in the list
        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (!nodes.contains(head)) nodes.add(head);
            else return true;
            head = head.next;
        }
        return false;
    }

    //0118
    //142 Linked List Cycle II

    //return the node where the cycle begins. If there is no cycle, return null.
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null; //no cycle
        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (!nodes.contains(head)) nodes.add(head);
            else return head;
            head = head.next;
        }
        return null; //traversed through the ll, no cycle
    }

    //0119
    //875. Koko Eating Bananas

    //TLE
//    public int minEatingSpeed(int[] piles, int h) {
//        Arrays.sort(piles); //[30,11,23,4,20] -> [4, 11, 23, 20, 30]
//
//        int k = piles[piles.length - 1];
//        while (k >= 1) {
//            int total = 0;
//            for (int i = 0; i < piles.length; i++) {
//                total += piles[i] / k;
//                if (piles[i] % k != 0) total++;
//            }
//            if (total > h) break;
//            k--;
//        }
//        return k + 1;
//    }


    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1, right = piles[piles.length - 1];
        while (left < right) {
            int mid = (left + right) / 2;
            int total = 0;
            for (int i = 0; i < piles.length; i++) {
                total += piles[i] / mid;
                if (piles[i] % mid != 0) total++;
            }
            if (total > h) left = mid + 1;
            else right = mid;
        }
        return right;
    }


    //1291. Sequential Digits
    public List<Integer> sequentialDigits(int low, int high) {
        //sliding window
        List<Integer> seq = new ArrayList<>();
        String longest = "123456789";
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        //Iterate: from the length of low to the length of high

        for (int length = lowLength; length < highLength + 1; length++) {
            for (int start = 0; start < 10 - length; start++) {
                String subStr = longest.substring(start, start + length);
                int num = Integer.parseInt(subStr);
                if (num >= low && num <= high) seq.add(num);
            }
        }
        return seq;
    }



    //2133 Check if Every Row and Column Contains All Numbers

    public boolean checkValid(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            HashSet<Integer> hsRow = new HashSet<>();
            HashSet<Integer> hsCol = new HashSet<>();
            //contains all the integers from 1 to n (inclusive).
            for (int col = 0; col < matrix.length; col++) {
                if (!hsRow.add(matrix[row][col]) || !hsCol.add(matrix[row][col])) {
                    return false;
                }//if hashSets don't add cur num, doesnt contain all ints from 1 to n
            }
        }

        for (int col = 0; col < matrix[0].length; col++) {
            HashSet<Integer> hsRow = new HashSet<>();
            HashSet<Integer> hsCol = new HashSet<>();
            //contains all the integers from 1 to n (inclusive).
            for (int row = 0; row < matrix.length; row++) {
                if (!hsRow.add(matrix[row][col]) || !hsCol.add(matrix[row][col])) {
                    return false;
                }//if hashSets don't add cur num, doesnt contain all ints from 1 to n
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Daily d = new Daily();
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}, {3, 2, 1}};
        System.out.println(d.checkValid(matrix));
    }
}
