package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        if (isPrime(sayi)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

    public static boolean isPrime(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        return isPrimeRecursive(sayi, sayi - 1);
    }

    public static boolean isPrimeRecursive(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return isPrimeRecursive(sayi, bolen - 1);
    }
}