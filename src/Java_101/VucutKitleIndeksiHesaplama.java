package Java_101;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
         * Formül : Kilo (kg) / Boy(m) * Boy(m)
         */

        double boy, kilo, vucutKutleIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutKutleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vucutKutleIndeksi);
    }
}
