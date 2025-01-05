package Java_101;

import java.util.Scanner;

public class YildizlarİleUcgenYapimi {
    public static void main(String[] args) {


        /**
         * Java'da döngüler kullanılarak yıldızlar ile üçgen yapınız.
         *
         Scanner scanner = new Scanner(System.in);
         System.out.print("Satır sayısını giriniz : ");
         int inputValue = scanner.nextInt();

         for(int i = 0; i <= inputValue; i++)
         {
         for(int j = 0; j <= inputValue - i; j++)
         {
         System.out.print(" ");
         }
         for(int k = 1; k <= 2 * i + 1; k++)
         {
         System.out.print("*");
         }
         System.out.println(" ");
         }
         */

        // Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        int inputValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        inputValue = scanner.nextInt();

        for (int i = 0; i <= inputValue; i++) {
            for (int j = 0; j <= inputValue - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = inputValue - 1; i >= 0; i--) {
            for (int j = 0; j <= inputValue - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
