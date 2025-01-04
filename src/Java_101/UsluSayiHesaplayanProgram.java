package Java_101;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
         */

        int n;
        int k;
        int result = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        n = scanner.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            result = result * n;
        }
        System.out.println("Sonuç : " + result);
    }
}
