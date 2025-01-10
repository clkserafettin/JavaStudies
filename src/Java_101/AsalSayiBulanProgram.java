package Java_101;

import java.util.Scanner;

public class AsalSayiBulanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            if (asalKontrol(sayi, sayi / 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }
    }

    public static boolean asalKontrol(int sayi, int i) {
        if (i == 1) {
            return true;
        } else {
            if (sayi % i == 0) {
                return false; // Eğer sayı i'ye bölünüyorsa asal değildir.
            } else {
                return asalKontrol(sayi, i - 1);
            }
        }
    }
}

/**
 * Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
 * Senaryo
 * Sayı Giriniz : 22
 * 22 sayısı ASAL değildir !
 * Sayı Giriniz : 2
 * 2 sayısı ASALDIR !
 * Sayı Giriniz : 39
 * 39 sayısı ASAL değildir !
 * Sayı Giriniz : 17
 * 17 sayısı ASALDIR !
 */
