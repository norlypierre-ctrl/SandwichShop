package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class SwShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sandwich size (1 = regular, 2 = Large): ");

        int size = scanner.nextInt();

        double price = 0;

        if (size == 1) {
            price = 5.45;
        }
        else if (size == 2) {
            price = 8.95;
        }

        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        if (age <= 17){
            price *= 0.90;
        }
        else if (age >= 65) {
            price *= 0.80;
        }

        System.out.printf("The cost of your sandwich is: $%.2f\n", price);

        scanner.close();
    }
}
