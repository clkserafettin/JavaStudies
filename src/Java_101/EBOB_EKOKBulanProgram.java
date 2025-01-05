package Java_101;

import java.util.Scanner;

public class EBOB_EKOKBulanProgram {
    public static void main(String[] args) {
        /**
         * Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
         *  EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en
         *         büyük ortak böleni, kısaca EBOB‘u denir.
         * EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en
         *        küçük ortak katı, kısaca EKOK‘u denir.
         */

        int number1;
        int number2;
        int smallNumber;
        int bigNumber;
        int ebob = 0;
        int ekok = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        number1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        number2 = scanner.nextInt();

        if (number1 < number2) {
            smallNumber = number1;
            bigNumber = number2;
        } else {
            smallNumber = number2;
            bigNumber = number1;
        }

        for (int i = 1; i <= smallNumber; i++) {
            if (smallNumber % i == 0 && bigNumber % i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB : " + ebob);

        for (int i = 1; i <= smallNumber * bigNumber; i++) {
            if (i % smallNumber == 0 && i % bigNumber == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK: " + ekok);
    }
}
