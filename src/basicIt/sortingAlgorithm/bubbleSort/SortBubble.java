package basicIt.sortingAlgorithm.bubbleSort;

import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {

        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);

        }
        System.out.println("это наш не отсортированный масив" + Arrays.toString(mas));

        int tmp;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    statusSort = false;
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                }
            }
        }
        System.out.println("это уже наш сортированный массив" + Arrays.toString(mas));
    }
}

