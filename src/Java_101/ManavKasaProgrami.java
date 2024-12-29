package Java_101;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /**
         * Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         * Meyveler ve KG Fiyatları
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */

        double armutKg, armutFiyat = 2.14,
               elmaKg, elmaFiyat = 3.67,
               domatesKg, domatesFiyat = 1.11,
               muzKg, muzFiyat = 0.95,
               patlicanKg, patlicanFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanKg = input.nextDouble();

        double toplamTutar = (armutFiyat * armutKg)
                            + (elmaFiyat * elmaKg)
                            + (domatesFiyat * domatesKg)
                            + (muzFiyat * muzKg)
                            + (patlicanFiyat * patlicanKg);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
