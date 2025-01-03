package Java_101;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        /**
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
         * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
         * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
         *
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
         * Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scanner = new Scanner(System.in);

        int age;
        int type;
        double distance;
        double price;
        double discounted = 0;

        do {
            System.out.print("Gideceğiniz mesafeyi giriniz (KM) : ");
            distance = scanner.nextFloat();
            if (distance <= 0) System.out.println("Hatalı Veri Girdiniz!");
        } while (distance <= 0);

        do {
            System.out.print("Yaşınızı giriniz : ");
            age = scanner.nextInt();
            if (age <= 0) System.out.println("Hatalı Veri Girdiniz!");
        } while (age <= 0);

        do {
            System.out.println("Yolculuk tipini seçiniz : \n1)Tek Yön\n2)Gidiş-Dönüş");
            type = scanner.nextInt();
            if (type != 1 && type != 2) System.out.println("Hatalı Veri Girdiniz!");
        } while (type != 1 && type != 2);

        price = distance * 1 / 10;

        if (age < 12) discounted = price * 1 / 2;
        if (12 <= age && age <= 24) discounted = price * 1 / 10;
        if (65 <= age) discounted = price * 3 / 10;
        price = price - discounted;
        if (type == 2) {
            price = price * 8 / 10;
            price *= 2;
        }
        System.out.printf("Toplam Tutar : " + price + " TL");
    }
}