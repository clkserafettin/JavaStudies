package Java_101;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        /**
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        int inputValue ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        inputValue = scanner.nextInt();

        for (int i = 1; i <= inputValue; i *= 4) {
            System.out.println("4'ün kuvvetleri : " + i + " ");
        }
        System.out.println("--------------------------------");
        for (int j = 1; j <= inputValue; j *= 5) {
            System.out.println("5'in kuvvetleri : " + j + " ");
        }
    }
}
