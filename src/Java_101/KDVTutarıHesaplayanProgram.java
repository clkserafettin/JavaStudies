package Java_101;

import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18,  kdvOran2 = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        if (tutar > 0 && tutar < 1000){
            kdvTutar = tutar * kdvOran1;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran1);
            System.out.println("KDV tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);
        } else if (tutar > 1000) {
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran2);
            System.out.println("KDV tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);

        }
    }
}
