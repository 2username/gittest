package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double KilometersTo10Liters; // Один километров на газу?
        double HowMuchToPass; // Километров на 10 литрах

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько литров газа в баллоне?");
        double TheAmountOfGas = sc.nextInt(); //сколько газа

        System.out.println("Какой требуемый расход?");
        double RequiredFlow = sc.nextInt(); // требуемый расход

        System.out.println("Введите на сколько километров считаем расход");
        double HowManyKilometers = sc.nextInt(); // на сколько километров
        sc.close();


        KilometersTo10Liters = HowManyKilometers / RequiredFlow;
        HowMuchToPass = TheAmountOfGas * KilometersTo10Liters;

        System.out.println("Надо проехать " + HowMuchToPass + " километров чтобы получить расход " + RequiredFlow + " газа на " + HowManyKilometers + " км");

    }
}
