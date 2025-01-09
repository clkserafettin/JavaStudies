package Java_101;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        /**
         * basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
         * yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         */

        int basamakSayisi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        basamakSayisi = scanner.nextInt();

        for (int i = 0; i <= basamakSayisi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * (basamakSayisi - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
