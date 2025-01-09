package Java_101;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        /**
         * Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
         * sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
         * ifadelerini ekrana yazan programı Java dilinde yazınız.
         *
         * Mükemmel Sayı Nedir ?
         * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
         * kendisine eşit olan sayıya mükemmel sayı denir.
         */

        int sayi;
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
