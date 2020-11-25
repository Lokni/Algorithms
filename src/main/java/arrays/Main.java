package arrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int bigCapacity = 1_000_000;
        MyArrayList<Integer> malForBubble = new MyArrayList<>();
        MyArrayList<Integer> malForSelection = new MyArrayList<>();
        MyArrayList<Integer> malForInsertion = new MyArrayList<>();
        for (int i = 0; i < bigCapacity; i++) {
            malForBubble.add(rand.nextInt(bigCapacity));
            malForSelection.add(rand.nextInt(bigCapacity));
            malForInsertion.add(rand.nextInt(bigCapacity));
        }

        long bubbleSortTime = System.currentTimeMillis();
        malForBubble.bubbleSort();
        System.out.println("Bubble sort: " + (System.currentTimeMillis() - bubbleSortTime));

        long selectionSortTime = System.currentTimeMillis();
        malForSelection.selectionSort();
        System.out.println("Selection sort: " + (System.currentTimeMillis() - selectionSortTime));

        long insertionSortTime = System.currentTimeMillis();
        malForInsertion.insertionSort();
        System.out.println("Insertion sort: " + (System.currentTimeMillis() - insertionSortTime));
    }
}
