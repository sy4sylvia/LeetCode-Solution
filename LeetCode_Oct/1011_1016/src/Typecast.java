public class Typecast {
    public static void main(String[] args) {
//        int i = (int) 3.6;
//        System.out.println(i);
//        int k = (int) Math.round(3.6);
//        System.out.println(k);
//
//        System.out.println();
//
//        System.out.println(Integer.toString(k));
//        System.out.println(String.format("%d", i));
//        System.out.println(Integer.valueOf("22"));

//        System.out.println(String.valueOf(3.44444));
//
//        System.out.println(String.valueOf('c'));
//        System.out.println(Character.toString('s'));

        String st = "bar";
        char[] c = st.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
