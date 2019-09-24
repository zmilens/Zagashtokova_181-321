package com.company;

import com.company.Massive;

public class Sort {

    private static long array[];

    public static long[] SelectionSort(Massive arr) {

        long start = System.currentTimeMillis();

        Sort.array = arr.sarr().clone();

        long min;
        int index;
        long swap;

        for (int i = 0; i < array.length; i++) {

            min = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            swap = array[index];
            array[index] = array[i];
            array[i] = swap;
        }

        System.out.println("Время " + (System.currentTimeMillis() - start));
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        return array;
    }

    public static long[] InsertionSort(Massive arr) {

        long start = System.currentTimeMillis();

        Sort.array = arr.sarr().clone();

        long tmp;

        for (int i = 1; i < array.length; i++) {

            tmp = array[i];

            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else break;
            }

            array[j + 1] = tmp;
        }
        System.out.println("Время " + (System.currentTimeMillis() - start));
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        return array;

    }
}