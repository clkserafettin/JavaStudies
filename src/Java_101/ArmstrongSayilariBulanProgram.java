package Java_101;

import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        /**
         * Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
         *
         * Armstrong Sayı Nedir ?
         * N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
         * Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         * 1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
         * 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
         * 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
         */

        /**
         Scanner scan = new Scanner(System.in);
         System.out.print("Sayıyı giriniz: ");
         int sayi = scan.nextInt();
         int temp = sayi;
         int basNumber = 0;
         int basValue;
         int basPow;
         int result = 0;

         while(temp != 0)
         {
         temp = temp / 10;
         basNumber++;
         }

         temp = sayi;
         while(temp != 0)
         {
         basValue = temp % 10;
         basPow = 1;
         for(int i = 1; i <= basNumber; i++)
         {
         basPow = basPow * basValue;
         }
         result = result + basPow;
         temp = temp / 10;
         }

         if(result == sayi)
         {
         System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
         }
         else
         {
         System.out.println(sayi + " sayısı bir Armstrong sayı değildir..");
         }
         **/



        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        // Örnek : 1643 = 1 + 6 + 4 + 3 = 14


        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        int basamakSayisi;
        int toplam = 0;

        while (sayi != 0) {
            basamakSayisi = sayi % 10;
            toplam = toplam + basamakSayisi;
            sayi = sayi / 10;
        }
        System.out.println("Toplam: " + toplam);

    }
}
