package com.pluralsight;

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
        else{
            System.out.println("Invalid size");
            scanner.close();
            return;
        }

        System.out.print("Enter your age: ");

        double discount = 1.0;

        int age = scanner.nextInt();

        if (age <= 17){
            discount = 0.9;
        }
        else if (age >= 65) {
            discount = 0.8;
        }

        double finalPrice = price * discount;

        System.out.printf("The cost of your sandwich is: $%.2f\n", finalPrice);

        scanner.close();
    }
}
