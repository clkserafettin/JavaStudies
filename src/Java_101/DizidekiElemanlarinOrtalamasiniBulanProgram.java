package Java_101;

import java.util.Scanner;

public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        /**
         *Dizideki elemanların ortalamasını hesaplayan program
         *int[] dizi = {1, 2, 3, 4, 5};
         *         double toplam = 0;
         *         for (int i = 0; i < dizi.length; i++) {
         *             toplam = toplam + dizi[i];
         *         }
         *         double ort = toplam / dizi.length;
         *         System.out.println("Ortalama: " + ort);
         */


        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        // Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        Scanner scanner = new Scanner(System.in);
        System.out.print("Harmonik ortalamasını hesaplamak istediğiniz sayı adedini giriniz : ");
        int n = scanner.nextInt();
        double harmonikSeri = 0;
        for (int i = 1; i <= n; i++) {
            harmonikSeri += 1.0 / i;
        }
        double ort = n / harmonikSeri;
        System.out.println("Ortalama : " + ort);


    }
}
