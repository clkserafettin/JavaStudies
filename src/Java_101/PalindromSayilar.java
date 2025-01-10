package Java_101;

import com.sun.source.tree.WhileLoopTree;

public class PalindromSayilar {
    static boolean isPalindrom(int number) {
        /**
         * Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
         *
         * Palindrom Sayı Nedir ?
         * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
         * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
         */

        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(2025));
    }
}
