
import java.math.BigInteger;
import java.util.*;

class Solution {
    //0106
    //3. Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();
        int left = 0, right = left + 1;
        int res = 1;

        HashSet<Character> hs = new HashSet<>();
        hs.add(s.charAt(left));

        while (right < s.length()) {
            if (s.charAt(left) != s.charAt(right) && !hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                res = Math.max(res, right - left + 1);
                right++;
            }
            else {
                left++;
                hs = new HashSet<>();
                hs.add(s.charAt(left));
                right = left + 1;
            }
        }
        return res;
    }


    //0106
    //49. Group Anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        List<List<String>> res = new ArrayList<>();
        //sort by string
        HashMap<String, List> hm = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!hm.containsKey(key)) hm.put(key, new ArrayList());
            hm.get(key).add(s);
        }
        res = new ArrayList(hm.values());
        return res;
    }



    //0109
    //67 Add Binary
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, ans;

        while (y.compareTo(zero) != 0) {
            ans = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = ans;
            y = carry;
        }
        return x.toString(2);
    }

    //0110
    //323. Number of Connected Components in an Undirected Graph
    //1 <= edges.length <= 5000

    public int countComponents(int n, int[][] edges) {
        int num = 0;

        List<Integer>[] adjL = new ArrayList[n];
        for (int i = 0; i < adjL.length; i++) adjL[i] = new ArrayList<>();

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < edges.length; i++) {
            adjL[edges[i][0]].add(edges[i][1]);
            adjL[edges[i][1]].add(edges[i][0]);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                num++;
                dfs(adjL, visited, i);
            }
        }
        return num;
    }

    private void dfs(List<Integer>[] adjL, boolean[] visited, int startNode) {
        visited[startNode] = true;
        for (int i = 0; i < adjL[startNode].size(); i++) {
            if (!visited[adjL[startNode].get(i)]) dfs(adjL, visited, adjL[startNode].get(i));
        }
    }

    //0110
    //547. Number of Provinces
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length; // a total of n cities
        int num = 0;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        List<Integer>[] adjL = new ArrayList[n];
        for (int i = 0; i < adjL.length; i++) adjL[i] = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1  && i != j) adjL[i].add(j);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                num++;
                helperDFS(visited, adjL, i);
            }
        }
        return num;
    }

    private void helperDFS(boolean[] visited, List<Integer>[] adjL, int startNode) {
        visited[startNode] = true;
        for (int i = 0; i < adjL[startNode].size(); i++) {
            if (!visited[adjL[startNode].get(i)]) helperDFS(visited, adjL, adjL[startNode].get(i));
        }
    }


    //0110
    //79 Word Search
//    public boolean exist(char[][] board, String word) {
//        char[] w = word.toCharArray();
//        for (int y=0; y<board.length; y++) {
//            for (int x=0; x<board[y].length; x++) {
//                if (exist(board, y, x, w, 0)) return true;
//            }
//        }
//        return false;
//    }
//
//    private boolean exist(char[][] board, int y, int x, char[] word, int i) {
//        if (i == word.length) return true;
//        if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
//        if (board[y][x] != word[i]) return false;
//        board[y][x] ^= 256;
//        boolean exist = exist(board, y, x+1, word, i+1)
//                || exist(board, y, x-1, word, i+1)
//                || exist(board, y+1, x, word, i+1)
//                || exist(board, y-1, x, word, i+1);
//        board[y][x] ^= 256;
//        return exist;
//    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        char[] c = word.toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helperSearch(board, c, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean helperSearch(char[][] board, char[] c, int i, int j, int idx) {
        int m = board.length;
        int n = board[0].length;

        if (idx == c.length) return true;
        if (i < 0 || i >= m || j < 0 || j >= n) return false;
        if (board[i][j] != c[idx]) return false;
        char tmp = board[i][j];
        board[i][j] = '0';

        boolean left = helperSearch(board, c, i - 1, j, idx + 1);
        boolean right = helperSearch(board, c, i + 1, j, idx + 1);
        boolean up = helperSearch(board, c, i, j - 1, idx + 1);
        boolean down = helperSearch(board, c, i, j + 1, idx + 1);


        board[i][j] = tmp;
        return left || right || up || down;
    }


    //0111
    //212. Word Search II
    private char[][] board;
    private int row;
    private int col;
//    private List<String> res;
    private HashSet<String> hs;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        this.row = board.length;
        this.col = board[0].length;
//        res = new ArrayList<>();
        hs = new HashSet<>();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                for (int arrIdx = 0; arrIdx < words.length; arrIdx++) {
                    if (backtrack(r, c, words[arrIdx], 0)) {
                        if (!hs.contains(words[arrIdx])) hs.add(words[arrIdx]);
                    }
                }
            }
        }
//        res =
        return hs.stream().toList();
    }

    private boolean backtrack(int r, int c, String singleWord, int wordIdx) {
        //1.check bottom case
        if (wordIdx >= singleWord.length()) return true;
        //2. boundaries
        if (r < 0 || r >= row || c < 0 || c >= col || singleWord.charAt(wordIdx) != board[r][c]) return false;

        //3. start backtracking
        board[r][c] = '0';

        boolean left = backtrack(r, c - 1, singleWord, wordIdx + 1);
        boolean right = backtrack(r, c + 1, singleWord, wordIdx + 1);
        boolean up = backtrack(r - 1, c, singleWord, wordIdx + 1);
        boolean down = backtrack(r + 1, c, singleWord, wordIdx + 1);

        boolean tmpRes = left || right || up || down;
        //4. end of current backtracking
        board[r][c] = singleWord.charAt(wordIdx);
        return tmpRes;
    }

    //0111
    //253. Meeting Rooms II
    public int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));

        PriorityQueue<Integer> endTime = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                }
        );
        endTime.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= endTime.peek()) endTime.poll();
            endTime.offer(intervals[i][1]);
        }
        return endTime.size();
    }


    //amazon oa2
    public static List<Integer> commonPrefix(List<String> inputs) {

        List<Integer> listCount = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            String word = inputs.get(i);
            listCount.add(count(word));
        }
        return listCount;
    }

    private static int count(String word) {
        if (word.length() == 1) return 1;
        int sum = 0;

        for (int pivot = 0; pivot < word.length(); pivot++) {
            if (word.charAt(pivot) != word.charAt(0)) continue;
            //letter at pivot == letter at 0
            int curSum = 0;
            int right = pivot;
            int idx = 0;
            while (right < word.length() && idx < word.length() && word.charAt(right) == word.charAt(idx)) {
                right++;
                idx++;
            }
            curSum = right - pivot;
            sum += curSum;
        }

        return sum;
    }

//    private static int count(String word) {
//        if (word.length() == 1) return 1;
//
//        int sum = 0;
//
//        for (int pivot = 0; pivot < word.length() - 1; pivot++) {
//            if (word.charAt(pivot) != word.charAt(0)) continue;
//
//            //letter at pivot == letter at 0
//            int curSum = 0;
//            int right = pivot + 1;
//            int idx = 1;
//            while (right < word.length() && idx < word.length() && word.charAt(right) == word.charAt(idx)) {
//                right++;
//                idx++;
//            }
//            curSum = right - pivot;
////            if (right == word.length() && word.charAt(0) == word.charAt(word.length() - 1)) curSum++;
//            sum += curSum;
//        }
//        if (word.charAt(0) == word.charAt(word.length() - 1)) sum++;
//
//        return sum;
//    }


    //0113
    //498. Diagonal Traverse
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];

//        if (m == 1) {
//            System.arraycopy(mat[0], 0, res, 0, res.length);
//            return res;
//        }
//        if (n == 1) {
//            for (int i = 0; i < res.length; i++) res[i] = mat[i][0];
//            return res;
//        }
        int row = 0, col = 0;

        for (int i = 0; i < res.length; i++) {
            res[i] = mat[row][col];
            if ((row + col) % 2 != 0) { //right up to left bottom
                // l.add(mat[row][col]);
                if (row == m - 1) col++;
                else if (col == 0) row++;
                else {
                    row++;
                    col--;
                }
            }
            else { //left bottom to right up
                if (col == n - 1) row++;
                else if (row == 0) col++;
                else {
                    row--;
                    col++;
                }
            }
        }
        return res;
    }


    //Spiral Matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        int leftBound = 0, topBound = 0, rightBound = n - 1, bottomBound = m - 1;
        while (res.size() < m * n) {
            for (int i = leftBound; i <= rightBound; i++) res.add(matrix[topBound][i]); //go right; 1, 2, 3
            for (int i = topBound + 1; i <= bottomBound; i++) res.add(matrix[i][rightBound]); //go down 6, 9
            if (topBound != bottomBound) {
                for (int i = rightBound - 1; i >= leftBound; i--) res.add(matrix[bottomBound][i]); // go left 8, 7
            }
            if (leftBound != rightBound) {
                for (int i = bottomBound -1; i > topBound; i--) res.add(matrix[i][leftBound]); //go up 4
            }
            leftBound++;
            rightBound--;
            topBound++;
            bottomBound--;
        }
        return res;


//        for (int i = 0; i < m * n; i++) {
//            if (leftBound != rightBound && upBound != bottomBound) {
//
//            res.add(matrix[row][col]);
//            if (count == 1) { //go right
//                if (col != rightBound) col++;
//                else { //reach right boundary
//                    count++; //count = 2;
//                    rightBound--;
//                }
//            }
//            if (count == 2) { //go down
//                if (row != bottomBound) row++;
//                else {
//                    count++; //reach the bottom
//                    bottomBound--;
//                }
//            }
//            if (count == 3) { //go left
//                if (col != leftBound) col--;
//                else {
//                    count++;
//                    leftBound++;
//                }
//            }
//            if (count == 4) { // go up
//                if (row != upBound) row--;
//                else {
//                    count++;
//                    upBound++;
//                }
//            }
//            if (count > 4) count -= 4;
//        }

    }

    //0113
    //Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        //base case, 1st level:
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);

        for (int curLevel = 1; curLevel < numRows; curLevel++) {
            List<Integer> level = new ArrayList<>();
            List<Integer> prevLevel = pascal.get(curLevel - 1);
            level.add(1); //1st ele;

            for (int j = 1; j < curLevel; j++) {
                level.add(prevLevel.get(j - 1) + prevLevel.get(j));
            }
            level.add(1); //last ele

            pascal.add(level);
        }
        return pascal;
    }

    //28. Implement strStr()
    public int strStr(String haystack, String needle) {

        if (haystack.length() == 0 && needle.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) break;
            //at index i of haystack, no need to search the rest of haystack

            for (int j = 0; j < needle.length(); j++) {

                if (i + j >= haystack.length()) return -1;

                if (needle.charAt(j) != haystack.charAt(i + j)) break;

                if (j == needle.length() - 1) return i;
                //exact solution has been found, traversed through needle
            }
        }
        return -1;

    }


    //452. Minimum Number of Arrows to Burst Balloons

    public int findMinArrowShots(int[][] points) {

//        Arrays.sort(points, Comparator.comparing(o -> o[1]));
//
//        int arrow = 1;
//        int end = points[0][1];
//        for (int i = 1; i < points.length; i++) {
//            if (points[i][0] > end) {
//                arrow++;
//                end = points[i][1];
//            }
//        }
//        return arrow;

        int arrow = 1;
        Arrays.sort(points, Comparator.comparing(o -> o[1]));
        PriorityQueue<Integer> endPQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        endPQ.offer(points[0][1]);

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > endPQ.peek()) {
                endPQ.poll();
                endPQ.offer(points[i][1]);
                arrow++;
            }

        }
        return arrow;
    }

    //14. Longest Common Prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
//        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());
        //strs = ["flower","flow","flight"] -> ["flow", "flower","flight"]


        for (int i = 0; i < strs[0].length(); i++) {
            for (int idx = 1; idx < strs.length; idx++) {
                if (strs[0].charAt(i) != strs[idx].charAt(i)) return strs[0].substring(0, i);
            }

//            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) sb.append(strs[0].charAt(i));
//            else break;
        }
        return strs[0];
    }

    //0114
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        int left = 0, right = 0;
        int curSum = 0;
        while (left <= right && right < nums.length) {
            curSum += nums[right];
            while (curSum >= target) {
                min = Math.min(min, right - left + 1);
                curSum -= nums[left++];
            }
            right++;
        }

        if (min == Integer.MAX_VALUE) return 0;
        else return min;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String haystack = "hello", needle = "o";

        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(s.minSubArrayLen(target, nums));
    }
}