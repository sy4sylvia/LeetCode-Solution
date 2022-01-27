//Explore Card: RecursionII

public class DivideAndConquer {
    public int[] sortArray(int[] nums) {
        //top-down merge sort: recursion
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, right);
    }

    private void merge(int[] nums, int left, int right) {

        int mid = left + (right - left) / 2;
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1;

        for (int idx = 0; idx < tmp.length; idx++) {
            if (i > mid) tmp[idx] = nums[j++];
            else if (j > right) tmp[idx] = nums[i++];
            else {
                if (nums[i] <= nums[j]) tmp[idx] = nums[i++];
                else tmp[idx] = nums[j++];
            }
        }
        System.arraycopy(tmp, 0, nums, left, right - left + 1);
        
    }

    private void mergeSort2(int[] nums) { //divide
        for (int size = 1; size < nums.length; size *= 2) {
            for (int start = 0; start < nums.length - size; start += 2 * size) {
                int mid = start + size - 1;
                int end = Math.min(start + 2 * size - 1, nums.length - 1);
                merge2(nums, start, mid, end);
            }
        }
    }
    private void merge2(int[] nums, int left, int mid, int right) { //conquer
        int[] tmp = new int[right - left + 1];
        int tmpLeft = left, rightMid = mid + 1;
        int idx = 0;
        while (tmpLeft <= mid || rightMid <= right) {
            if (tmpLeft > mid || rightMid <= right && nums[tmpLeft] > nums[rightMid]) {
                tmp[idx++] = nums[rightMid++];
            }
            else tmp[idx++] = nums[tmpLeft++];
        }
        System.arraycopy(tmp, 0, nums, left, right - left + 1);


    }



    //Quick Sort Template
    public void quickSort(int [] lst) {
        /* Sorts an array in the ascending order in O(n log n) time */
        int n = lst.length;
        qSort(lst, 0, n - 1);
    }

    private void qSort(int [] lst, int lo, int hi) {
        if (lo < hi) {
            int p = partition(lst, lo, hi);
            qSort(lst, lo, p - 1);
            qSort(lst, p + 1, hi);
        }
    }

    private int partition(int [] lst, int lo, int hi) {
    /*
      Picks the last element hi as a pivot
      and returns the index of pivot value in the sorted array */
        int pivot = lst[hi];
        int i = lo;
        for (int j = lo; j < hi; ++j) {
            if (lst[j] < pivot) {
                int tmp = lst[i];
                lst[i] = lst[j];
                lst[j] = tmp;
                i++;
            }
        }
        int tmp = lst[i];
        lst[i] = lst[hi];
        lst[hi] = tmp;
        return i;
    }

}



