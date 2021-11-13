import java.util.HashMap;
import java.util.Scanner;

public class gridWords {
    public static String[]  isWordPresent(char[][] letters, String[] words)
    {
        String[]  answer = new String[words.length];
        // Write your code here

        HashMap<Integer, Character> hm = new HashMap<>();


        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            for (int row = 0; row < letters.length; row++) {
                for (int col = 0; col < letters[row].length; col++) {
                    if (letters[row][col] != words[i].charAt(i)) answer[i] = "No";
                    else answer[i] = "Yes";
//                    hm.put(1,char[row][col]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for letters
        int letters_row = in.nextInt();
        int letters_col = in.nextInt();
        char letters[][] = new char[letters_row][letters_col];
        for(int idx = 0; idx < letters_row; idx++)
        {
            for(int jdx = 0; jdx < letters_col; jdx++)
            {
                letters[idx][jdx] = in.next().charAt(0);
            }
        }
        //input for words
        int words_size = in.nextInt();
        String words[] = new String[words_size];
        for(int idx = 0; idx < words_size; idx++)
        {
            words[idx] = in.next();
        }

        String[] result = isWordPresent(letters, words);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}
