package com.company;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Введите число элементов массива");
         int n = scanner.nextInt();
        Massive a = new Massive(n);
        Massive a2 = new Massive(n);
         for(int i=0; i<n;i++){
             a.insert(random.nextInt(1000));
         }
        for(int i=0; i<n;i++){
            a2.insert(random.nextInt(1000));
        }


        a.display();

        Sort.SelectionSort(a);



        System.out.println();
        System.out.println();

        a2.display();

        Sort.InsertionSort(a2);




        System.out.println();
        System.out.println();
    }
}
