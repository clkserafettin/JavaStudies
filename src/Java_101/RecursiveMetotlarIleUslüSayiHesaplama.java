package Java_101;

import java.util.Scanner;

public class RecursiveMetotlarIleUslüSayiHesaplama {

    static int us(int a, int b) {
        int sonuc = 1;

        for (int i = 1; i <= b; i++) {
            sonuc = sonuc * a;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int taban;
        int us;
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz : ");
        taban = scan.nextInt();

        System.out.print("Üssü giriniz : ");
        us = scan.nextInt();

        System.out.println("Sonuç : " + us(taban, us));
    }
}

/**
 * Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
 * Senaryo
 * Taban değeri giriniz :2 Üs değerini giriniz : 0
 * Sonuç : 1
 * Taban değeri giriniz : 2
 * Üs değerini giriniz : 3
 * Sonuç : 8
 * Taban değeri giriniz : 5
 * Üs değerini giriniz : 3
 * Sonuç : 125
 */