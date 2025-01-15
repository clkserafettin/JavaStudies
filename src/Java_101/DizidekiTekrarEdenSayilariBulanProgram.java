package Java_101;

import java.util.Arrays;

public class DizidekiTekrarEdenSayilariBulanProgram {

    static boolean sinirla(int[] arr, int deger) {
        for (int i : arr) {
            if (i == deger) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] karmaSayilar = {1, 1, 1, 1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 35, 35, 33, 45, 86, 97, 100, 100, 34, 35, 36, 789, 345};//*5*7*32*66
        int[] refDeger = new int[karmaSayilar.length];
        int sayac = 0;
        for (int i = 0; i < karmaSayilar.length; i++) {
            for (int j = 0; j < karmaSayilar.length; j++) {
                if ((i != j) && (karmaSayilar[i] == karmaSayilar[j])) {
                    if (!sinirla(refDeger, karmaSayilar[i])) {
                        refDeger[sayac++] = karmaSayilar[i];
                    }
                    break;
                }
            }
        }
        for (int deger : refDeger) {
            if (deger != 0) {
                System.out.print(deger + " ");
            }
        }
    }
}

