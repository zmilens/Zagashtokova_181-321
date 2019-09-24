package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner scanner= new Scanner(System.in);

            Massiv array=new Massiv(9);
            for(int i=0; i<9; i++){
                array.insert(i);
            }
            array.display();
            System.out.println("Введите число для поиска в массиве");
            int n =scanner.nextInt();
            if(array.find(n)){
                System.out.println("число найдено");
            }
            else {
                System.out.println("число не найдено");
            }
            System.out.println("Введите число для удаления в массиве");
            n=scanner.nextInt();
            if(array.delete(n)){
                System.out.println("число удалено");
            }
            else {
                System.out.println("число не найдено");
            }
            array.display();
        }
    }

