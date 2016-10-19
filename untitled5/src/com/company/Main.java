package com.company;

public class Main {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55 89

        int cont = 100;
        int a = 1, b = 1;
        System.out.print("0 " + a + " " + b + " ");
        int fibonacci, i = 3;
        while (i < cont) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            System.out.print(fibonacci + " ");
            i ++;
        }
    }
}