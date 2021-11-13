//1027
//412 Fizz Buzz

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) l.add(String.valueOf(i));
            if (i % 3 == 0 && i % 5 == 0) l.add("FizzBuzz");
            if (i % 3 == 0 && i % 5 != 0) l.add("Fizz");
            if (i % 3 != 0 && i % 5 == 0) l.add("Buzz");
        }
        return l;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(15));
    }
}
