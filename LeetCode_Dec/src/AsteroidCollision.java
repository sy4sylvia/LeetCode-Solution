//1209
//735 Asteroid Collision

//2 <= asteroids.length

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

//        for (int i = 0; i < asteroids.length; i++) {
//            if (asteroids[i] > 0) {
//                s.push(asteroids[i]);
//            }
//            else {
//                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])) {
//                    s.pop();
//                }
//                if (s.isEmpty() || s.peek()< 0) {
//                    s.push(asteroids[i]);
//                }
//                else if (Math.abs(s.peek()) == Math.abs(asteroids[i])) {
//                    s.pop();
//                }
//            }
//        }

        int i = 0;
        while (i < asteroids.length) {
            if (asteroids[i] > 0) s.push(asteroids[i]);
            else {
                //asteroids[i] < 0
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])) {
                    s.pop();
                }
                if (s.isEmpty() || s.peek() < 0) {
                    s.push(asteroids[i]);
                }
                else if (asteroids[i] + s.peek() == 0) {
                    s.pop();
                }
            }

            //compare current element in stack & incoming asteroid
//            if (s.peek() * asteroids[i] > 0) s.push(asteroids[i]);
//            else if (s.peek() < 0 && asteroids[i] > 0) s.push(asteroids[i]);
//            else {
//                if (Math.abs(s.peek()) < Math.abs(asteroids[i])) {
//                    s.pop();
//                    s.push(asteroids[i]);
//                }
//                if (Math.abs(s.peek()) == Math.abs(asteroids[i])) {
//                    s.pop();
//                }
//            }
            i++;
        }

//        if (s.size() == 1) return new int[] {};


        int[] ans = new int[s.size()];
        for (int j = s.size() - 1; j >= 0; j--) ans[j] = s.pop();
        return ans;
    }

    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        int[] a = {-2,-2,1,-2};
        int[] res = ac.asteroidCollision(a);
        for (int i : res) System.out.println(i);
    }
}
