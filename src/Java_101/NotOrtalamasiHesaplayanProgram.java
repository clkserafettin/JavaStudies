package Java_101;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();


        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        int sonuc =toplam/6;
        System.out.println("Ortalamanız : " + sonuc);

        String mesaj = sonuc >= 60 ? "Geçti" : "Kaldı";
        System.out.println("Geçme Durumu : " + mesaj);

    }
}
