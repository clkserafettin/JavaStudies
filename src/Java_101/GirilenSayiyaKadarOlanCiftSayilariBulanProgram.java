package Java_101;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
        /**
         * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
         */

        int inputValue;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Girilen Sayıya Kadar Olan Çift Sayıları Bulan Programa Hoş Geldiniz ---");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Sayı Giriniz : ");
        inputValue = scanner.nextInt();

        for (int i = 1; i < inputValue; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
