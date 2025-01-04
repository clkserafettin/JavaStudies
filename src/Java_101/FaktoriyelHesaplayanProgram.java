package Java_101;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        /**
         * Java ile faktöriyel hesaplayan program yazıyoruz.
         */

        int value;
        int total = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyel sayısını giriniz : ");
        value = scanner.nextInt();

        for (int i = 1; i <= value; i++) {
            total = total * i;
        }
        System.out.println(value + "! Faköriyel : " + total);
    }
}
