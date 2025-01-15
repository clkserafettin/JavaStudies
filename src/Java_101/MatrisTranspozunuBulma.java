package Java_101;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {

        /**
         *Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
         * Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının
         * yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin
         * transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
         * Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
         * Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
         * Senaryo
         * Matris :
         * 2    3    4
         * 5    6    4
         * Transpoze :
         * 2    5
         * 3    6
         * 4    4
         */

        int[][] matris = {{2, 3, 4},
                         {5, 6, 4}};
        int[][] transpozeMatris = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                transpozeMatris[i][j] = matris[j][i];
            }
        }

        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[i].length; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}

