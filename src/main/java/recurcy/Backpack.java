package recurcy;

import java.util.Arrays;
import java.util.Random;

public class Backpack {


    private static int backpack(int[] weight, int[] price, int items, int capacity){
        if (items <= 0) {
            return 0;
        } else if (weight[items - 1] > capacity){
            return backpack(weight, price, items - 1, capacity);
        } else {
            return Math.max(backpack(weight, price, items - 1, capacity), price[items - 1] +
                    backpack(weight, price, items - 1, capacity - weight[items - 1]));
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int items = 5;
        int capacity = 20;
        int[] price = new int[items];
        int[] weight = new int[items];

        for (int i = 0; i < items; i++) {
            price[i] = rand.nextInt(items * capacity);
        }
        for (int i = 0; i < items; i++) {
            weight[i] = rand.nextInt(capacity - 5);
        }

        System.out.println("Goods prices is: " + Arrays.toString(price));
        System.out.println("Goods weights is: " + Arrays.toString(weight));
        System.out.println("Better package is: " + backpack(weight, price, items, capacity));

    }


}
