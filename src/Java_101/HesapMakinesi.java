package Java_101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1;
        int n2;
        int choose;

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + ( n1 / n2));
                break;
            default:
                System.err.println("Yanlış seçim yaptınız!");
        }
    }
}
