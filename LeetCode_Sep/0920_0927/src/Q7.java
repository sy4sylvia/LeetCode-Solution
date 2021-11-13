public class Q7 {
    public final static void main(String[] args) {
        double d = 10.0 / -0;
        if(d == Double.POSITIVE_INFINITY)
            System.out.println("Positive infinity");
        else
            System.out.println("Negative infinity");
    }
}
