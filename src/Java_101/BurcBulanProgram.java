package Java_101;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        /**
         * Koç Burcu     : 21 Mart - 20 Nisan
         * Boğa Burcu    : 21 Nisan - 21 Mayıs
         * İkizler Burcu : 22 Mayıs - 22 Haziran
         * Yengeç Burcu  : 23 Haziran - 22 Temmuz
         * Aslan Burcu   : 23 Temmuz - 22 Ağustos
         * Başak Burcu   : 23 Ağustos - 22 Eylül
         * Terazi Burcu  : 23 Eylül - 22 Ekim
         * Akrep Burcu   : 23 Ekim - 21 Kasım
         * Yay Burcu     : 22 Kasım - 21 Aralık
         * Oğlak Burcu   : 22 Aralık - 21 Ocak
         * Kova Burcu    : 22 Ocak - 19 Şubat
         * Balık Burcu   : 20 Şubat - 20 Mart
         */

        int month;
        int day;
        String wrongDay = "Gün değerini hatalı girdiniz!";
        String wrongMonth = "Ay değerini hatalı girdiniz!";

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Doğduğunuz ay: ");
            month = input.nextInt();

            System.out.print("Doğduğunuz gün: ");
            day = input.nextInt();

            if (month == 1) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz Oğlak!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz Kova!");
                else
                    System.err.println(wrongDay);
            } else if (month == 2) {
                if (day > 0 && day < 20)
                    System.out.println("Burcunuz Kova!");
                else if (day >= 20 && day <= 29)
                    System.out.println("Burcunuz Balık!");
                else
                    System.err.println(wrongDay);
            } else if (month == 3) {
                if (day > 0 && day < 21)
                    System.out.println("Burcunuz Balık!");
                else if (day >= 21 && day <= 31)
                    System.out.println("Burcunuz Koç!");
                else
                    System.err.println(wrongDay);
            } else if (month == 4) {
                if (day > 0 && day < 21)
                    System.out.println("Burcunuz Koç!");
                else if (day >= 21 && day <= 30)
                    System.out.println("Burcunuz Boğa!");
                else
                    System.err.println(wrongDay);
            } else if (month == 5) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz Boğa!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz İkizler!");
                else
                    System.err.println(wrongDay);
            } else if (month == 6) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz İkizler!");
                else if (day >= 23 && day <= 30)
                    System.out.println("Burcunuz Yengeç!");
                else
                    System.err.println(wrongDay);
            } else if (month == 7) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz Yengeç!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz Aslan!");
                else
                    System.err.println(wrongDay);
            } else if (month == 8) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz Aslan!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz Başak!");
                else
                    System.err.println(wrongDay);
            } else if (month == 9) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz Başak!");
                else if (day >= 23 && day <= 30)
                    System.out.println("Burcunuz Terazi!");
                else
                    System.err.println(wrongDay);
            } else if (month == 10) {
                if (day > 0 && day < 23)
                    System.out.println("Burcunuz Terazi!");
                else if (day >= 23 && day <= 31)
                    System.out.println("Burcunuz Akrep!");
                else
                    System.err.println(wrongDay);
            } else if (month == 11) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz Akrep!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz Yay!");
                else
                    System.err.println(wrongDay);
            } else if (month == 12) {
                if (day > 0 && day < 22)
                    System.out.println("Burcunuz Yay!");
                else if (day >= 22 && day <= 31)
                    System.out.println("Burcunuz Oğlak!");
                else
                    System.err.println(wrongDay);
            } else
                System.err.println(wrongMonth);

        } catch (InputMismatchException e) {
            System.out.println("Lütfen ay ve günü rakam olarak giriniz!");
        }
    }
}
