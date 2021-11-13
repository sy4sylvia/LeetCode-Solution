public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long root = num;
        while (root * root > num) {
            root = (root + num / root) / 2;
        }
        if (root * root == num) return true;
        else return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare v = new ValidPerfectSquare();
        System.out.println(v.isPerfectSquare(4444 * 4445));
    }
}
