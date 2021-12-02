//1118
//461 Hamming Distance

//bit manipulation

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return countOnes(x ^ y);
    }

    private int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance hd = new HammingDistance();
        int x = 4, y = 1;
        System.out.println(hd.countOnes(x ^ y));
    }
}
