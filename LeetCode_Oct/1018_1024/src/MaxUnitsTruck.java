//1025
//1710 Maximum units on a Truck

import java.util.Arrays;

public class MaxUnitsTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] table = new int[1001];
        for (int[] b : boxTypes) table[b[1]] += b[0];
            //add up boxTypes[x][0] into table, with index being boxTypes[x][1]
        int sum = 0;
        for (int i = 1000; i >= 0; i--) {
            if (table[i] == 0) continue;
            if (truckSize < table[i]) {
                sum += truckSize * i;
                break;
            }
            truckSize -= table[i];
            sum += table[i] * i;

        }
        return sum;
    }

    public static void main(String[] args) {
        MaxUnitsTruck mut = new MaxUnitsTruck();
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        System.out.println(mut.maximumUnits(boxTypes, truckSize));
    }
}
