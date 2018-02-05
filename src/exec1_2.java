package com.TestSoft;

import java.util.Scanner;

public class exec1_2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int k = input();
        findDividers(k);
    }
    public static int input(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void findDividers(int number){
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.print(" " + i);
            }
        }
    }
}
