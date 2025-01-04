package Java_101;

import java.util.Scanner;

public class TekSayilarinToplaminiHesaplayanProgram {
    public static void main(String[] args) {
        /**
         * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
         * ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        int value;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz : ");
            value = scanner.nextInt();

            if (value % 2 == 1) {
                total += value;
            }
        } while (value > 0);

        System.out.println("Toplam = " + total);
    }
}
