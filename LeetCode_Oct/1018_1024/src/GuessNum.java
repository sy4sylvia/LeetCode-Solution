//1022
//374 Guess Number Higher or Lower


public class GuessNum {
    private int guess(int n) {
        int pick = 101;
        if (n > pick) return -1;
        else if (n == pick) return 0;
        else return 1;
    }
    //opposite description...

    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            if (res == 0) return mid;
            else if (res == 1) start = mid + 1;
            else if (res == -1) end = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        GuessNum gn = new GuessNum();
        System.out.println(gn.guessNumber(100));
    }
}
