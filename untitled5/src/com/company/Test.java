package com.company;


public class Test {
    public static void main(String[] args) {
        int size = 10;
        char[][] greaph = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size-1){
                    greaph [i] [j] = '#';
                }
                else {
                    greaph[i] [j]= ' ';
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(greaph[i][j]);
            }
            System.out.println();
        }
    }
}

