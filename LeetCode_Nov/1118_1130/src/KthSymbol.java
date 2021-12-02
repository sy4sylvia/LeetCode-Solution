//1120
//779. K-th Symbol in Grammar

public class KthSymbol {
    public int kthGrammar(int n, int k) {
        int elements = (int) Math.pow(2, n - 1);
        if (elements == 1) return 0;
        int mid = elements / 2;
        if (k <= mid) return kthGrammar(n - 1, k);
        else return 1 ^ kthGrammar(n - 1, k - elements / 2);

    }

    public static void main(String[] args) {
        KthSymbol ks = new KthSymbol();
        System.out.println(ks.kthGrammar(2, 1));
    }
//    Integer.toBinaryString()
}
