package Java_101;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        /**
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
         * Taksimetre açılış ücreti 10 TL'dir.
         */

        int km;
        double perKm = 2.20, totalPrice, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        totalPrice = (km * perKm);
        totalPrice += startPrice;

        totalPrice = (totalPrice < 20) ? 20 : totalPrice;
        System.out.println("Toplam Tutar : " + totalPrice);

    }

}
