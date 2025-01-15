package Java_101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    /**
     * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
     * Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];
        System.out.print("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama : " + Arrays.toString(dizi));
    }
}
