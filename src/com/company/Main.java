package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        System.out.println("Labas. Išmesime tau random skaičius nuo x iki y.");
        System.out.println("Įvesk skaičių x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Įvesk skaičių y");
        int y = sc.nextInt()-x;
        System.out.println("Kiek skaičių reikės?");
        int z = sc.nextInt();
        System.out.println("Išmesime " + (z) + " atsitiktinių skaičių nuo " + (x) + " iki " + (y));

        for (int i = 0; i < z; i++) {
            Random rand = new Random();
            int n = rand.nextInt(y) + x;
            System.out.println(n);
        }
    }
}
