package Java_101;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
         * Artık Yıl Nedir?
         * Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
         * Artık Yıl Nasıl Hesaplanır?
         * Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
         * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
         * 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
         * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
         * Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
         */

        int year;
        int fourRemainingYears;
        int hundredRemainingYears;
        int fourHundredRemainingYears;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Artık Yıl Hesaplayan Programa Hoş Geldiniz ---");
        System.out.println("--------------------------------------------------");
        System.out.print("Kontrol etmek istediğiniz yılı lütfen giriniz : ");
        year = scanner.nextInt();

        fourRemainingYears = (year % 4);
        hundredRemainingYears = (year % 100);
        fourHundredRemainingYears = (year % 400);

        if (fourHundredRemainingYears == 0 && hundredRemainingYears == 0 && year > 0) {
            System.out.println("Girilen Yıl Değeri : " + year + "\nBu bir 'artık yıldır' ");
        } else if (fourRemainingYears == 0 && !(hundredRemainingYears == 0) && year > 0) {
            System.out.println("Girilen Yıl : " + year + "\nBu bir 'artık yıldır' ");
        } else
            System.out.println("Girilen " + year + " yılı, 'ARTIK YIL DEĞİLDİR!' ");
    }

}


