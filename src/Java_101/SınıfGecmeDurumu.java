package Java_101;

import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double math;
        double physics;
        double chemistry;
        double turkish;
        double music;
        double counter = 0;
        double total = 0.0, average;

        System.out.print("Matematik notunuzu giriniz : ");
        math = input.nextDouble();
        if (math <= 100 && math >= 0) {
            total += math;
            counter++;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        physics = input.nextDouble();
        if (physics <= 100 && physics >= 0) {
            total += physics;
            counter++;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        chemistry = input.nextDouble();
        if (chemistry <= 100 && chemistry >= 0) {
            total += chemistry;
            counter++;
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = input.nextDouble();
        if (turkish <= 100 && turkish >= 0) {
            total += turkish;
            counter++;
        }

        System.out.print("Müzik notunuzu giriniz : ");
        music = input.nextDouble();
        if (music <= 100 && music >= 0) {
            total += music;
            counter++;
        }

        average = total / counter;
        System.out.println("Ortalamanız : " + average);

        String message = average <= 55 ? "Sınıfta kaldınız!" : "Tebrikler! Sınıfı geçtiniz.";
        System.out.println(message);

        input.close();
    }
}
