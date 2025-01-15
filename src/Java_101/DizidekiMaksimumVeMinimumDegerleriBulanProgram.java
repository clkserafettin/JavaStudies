package Java_101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiMaksimumVeMinimumDegerleriBulanProgram {
    public static void main(String[] args) {

        /**
         * Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
         * en büyük en yakın sayıyı bulan programı yazınız.
         * Dizi : {15,12,788,1,-1,-778,2,0}
         * Girilen Sayı : 5
         * Girilen sayıdan küçük en yakın sayı : 2
         * Girilen sayıdan büyük en yakın sayı : 12
         */

        Scanner scan = new Scanner(System.in);
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int kucukSayi = 0;
        int buyukSayi = 0;
        for (int i : dizi) {
            if (i < sayi) {
                kucukSayi = i;
            }
        }
        for (int j : dizi) {
            if (j > sayi) {
                buyukSayi = j;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukSayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukSayi);
    }
}
