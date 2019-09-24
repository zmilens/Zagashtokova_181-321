
package com.company;
import java.util.*;
import com.company.Massiv;

public class laba1{

        public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        Massiv array=new Massiv(9);
        for(int i=0; i<9; i++){
            array.insert(i);
        }
        array.display();
        int n =scanner.nextInt();
        if(array.find(n)){
            System.out.println("число найдено");
        }
        else {
            System.out.println("число не найдено");
        }
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