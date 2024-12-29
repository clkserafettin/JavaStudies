package Java_101;

import java.util.Scanner;

public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {
        /**
         * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         * 𝜋 sayısını = 3.14 alınız.
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        final double PI = 3.14;
        double radius, area, angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = input.nextInt();
        System.out.print("Daire diliminin açı ölçüsünü giriniz: ");
        angle = input.nextInt();

        area = (PI * radius * radius * angle) / 360;
        System.out.println("Daire diliminin alanı: " + area);

    }
}
