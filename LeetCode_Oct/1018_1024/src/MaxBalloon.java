public class MaxBalloon {
    public int maxNumberOfBalloons(String text) {
        int[] table = new int[5];
        char[]c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'b') table[0]++;
            if (c[i] == 'a') table[1]++;
            if (c[i] == 'l') table[2]++;
            if (c[i] == 'o') table[3]++;
            if (c[i] == 'n') table[4]++;
        }
        table[2] /= 2;
        table[3] /= 2;
        return Math.min(table[0], Math.min(table[1], Math.min(table[2], Math.min(table[3], table[4]))));
    }
}
