package Java_101;

public class AsalSayılariBulanProgram {
    public static void main(String[] args) {
        /**
         * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         */

        int i;
        int j;
        boolean asalSayi;

        for (i = 2; i <= 100; i++) {
            asalSayi = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalSayi = false;
                    break;
                }
            }

            if (asalSayi) {
                System.out.print(i + " ");
            }
        }
    }
}