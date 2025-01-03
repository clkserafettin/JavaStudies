package Java_101;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        /**
         * Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
         *
         * Çin Zodyağı nedir?
         * 4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
         * Çin Zodyağı nasıl hesaplanır?
         * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
         * Doğum Tarihi %12 = 0 ➜ Maymun
         * Doğum Tarihi %12 = 1 ➜ Horoz
         * Doğum Tarihi %12 = 2 ➜ Köpek
         * Doğum Tarihi %12 = 3 ➜ Domuz
         * Doğum Tarihi %12 = 4 ➜ Fare
         * Doğum Tarihi %12 = 5 ➜ Öküz
         * Doğum Tarihi %12 = 6 ➜ Kaplan
         * Doğum Tarihi %12 = 7 ➜ Tavşan
         * Doğum Tarihi %12 = 8 ➜ Ejderha
         * Doğum Tarihi %12 = 9 ➜ Yılan
         * Doğum Tarihi %12 = 10 ➜ At
         * Doğum Tarihi %12 = 11 ➜ Koyun
         */

        Scanner scanner = new Scanner(System.in);

        int birthYear;
        int mod;
        String chineseZodiac;

        try {
            System.out.print("Doğum yılınızı giriniz : ");
            birthYear = scanner.nextInt();

            if (birthYear < 0)
                throw new Exception();

            mod = birthYear % 12;

            switch (mod) {
                case 0:
                    chineseZodiac = "Maymun";
                    break;
                case 1:
                    chineseZodiac = "Horoz";
                    break;
                case 2:
                    chineseZodiac = "Köpek";
                    break;
                case 3:
                    chineseZodiac = "Domuz";
                    break;
                case 4:
                    chineseZodiac = "Fare";
                    break;
                case 5:
                    chineseZodiac = "Öküz";
                    break;
                case 6:
                    chineseZodiac = "Kaplan";
                    break;
                case 7:
                    chineseZodiac = "Tavşan";
                    break;
                case 8:
                    chineseZodiac = "Ejderha";
                    break;
                case 9:
                    chineseZodiac = "Yılan";
                    break;
                case 10:
                    chineseZodiac = "At";
                    break;
                case 11:
                    chineseZodiac = "Koyun";
                    break;
                default:
                    System.out.println(chineseZodiac = "none");
            }
            System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiac);
        } catch (Exception e) {
            System.err.println("Hatalı değer girdiniz!");
        } finally {
            scanner.close();
        }
    }
}
