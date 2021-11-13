//1022
//278 First Bad Version
public class FirstBadVersion {
    private boolean isBadVersion(int version){
        return true;
    }


    //time limit exceeded
//    public int firstBadVersion(int n) {
//        while (n > 0) {
//            if (isBadVersion(n)) n--;
//            else return n + 1;
//        }
//        return 1;
//    }


    //still time limit exceeded
//    public int firstBadVersion(int n) {
//        int start = 1, end = n;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (!isBadVersion(mid)) start = mid + 1;
//            else end = mid - 1;
//        }
//        return start;
//    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }


}
