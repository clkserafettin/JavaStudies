package Java_101;

public class RecursiveIleFibonacciSerisiBulanProgram {

    /**
     * Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
     * f(n) = f(n-1)+f(n-2)
     */

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
