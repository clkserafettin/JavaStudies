package Java_101;

import java.util.Scanner;

public class SayilariBuyuktenKucugeDogruSiralama {
    public static void main(String[] args) {

        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz (a): ");
        a = input.nextInt();

        System.out.print("Lütfen bir sayı daha giriniz (b): ");
        b = input.nextInt();

        System.out.print("Lütfen bir sayı daha giriniz (c): ");
        c = input.nextInt();

        if((a<b) && (a<c)) {
            if(b<c)
                System.out.println("a < b < c");
            else
                System.out.println("a < c < b");
        }else if((b<a) && (b<c)) {
            if(a<c)
                System.out.println("b < a < c");
            else
                System.out.println("b < c < a");
        }else {
            if((b < a))
                System.out.println("c < b < a");
            else
                System.out.println("c < a < b");
        }
    }
}
