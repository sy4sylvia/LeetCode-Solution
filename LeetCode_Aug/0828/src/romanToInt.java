//13
public class romanToInt {
    public int romanToInt(String s){
        int totalValue = 0;
        char[] ch = s.toCharArray();
        int[] numeric = new int[ch.length];
        for(int i = 0; i < ch.length; i++){
            numeric[i] = conversion(ch[i]);
        }
        for(int a = 0; a < (ch.length - 1); a++){
            if(numeric[a] < numeric[a + 1]){
                totalValue = totalValue - numeric[a];
            }
            else
            {
                totalValue = totalValue + numeric[a];
            }
//            totalValue = totalValue + numeric[(ch.length - 1)];
        }
        totalValue += numeric[ch.length - 1];

        return totalValue;
    }


    private int conversion(char c){
        int value = 1;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
    }

    public static void main(String[] args) {
        romanToInt rm = new romanToInt();
        String a = "MCMXCIV";
        System.out.println(rm.romanToInt(a));
    }

}
