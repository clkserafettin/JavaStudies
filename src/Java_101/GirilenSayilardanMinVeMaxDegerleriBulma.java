package Java_101;

import java.util.Scanner;

public class GirilenSayilardanMinVeMaxDegerleriBulma {
    public static void main(String[] args) {

        /**
         * Java ile klavyeden girilen N tane sayma sayısından
         * en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */

        int n;
        int ilkSayi;
        int enBuyukSayi;
        int enKucukSayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        n = scanner.nextInt();

        System.out.print("1. sayıyı giriniz : ");
        ilkSayi = scanner.nextInt();
        enBuyukSayi = ilkSayi;
        enKucukSayi = ilkSayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }

            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }

        }
        System.out.println("------------------------------");
        System.out.println("En büyük sayı : " + enBuyukSayi);
        System.out.println("En küçük sayı : " + enKucukSayi);
    }

}
