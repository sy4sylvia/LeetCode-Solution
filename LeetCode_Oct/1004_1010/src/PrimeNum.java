import java.util.Arrays;
import java.util.Scanner;
//cisco OA Prime and Composite
public class PrimeNum {
    public static String[]  isPrimeNumber(int[] elements)
    {
        String[]  answer = new String[elements.length];
        // Write your code here
        for (int i = 0; i < elements.length; i++) {
            answer[i] = "Prime";
            for (int k = 2; k <= (elements[i] / 2); k++) {
                if (elements[i] % k == 0) {
                    answer[i] = "Composite";
                    break;
                }

            }
        }
        for (String a: answer) System.out.print(a + "  ");


        return answer;
    }



    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for elements
        int elements_size = in.nextInt();
        int elements[] = new int[elements_size];
        for(int idx = 0; idx < elements_size; idx++)
        {
            elements[idx] = in.nextInt();
        }

        String[] result = isPrimeNumber(elements);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}
