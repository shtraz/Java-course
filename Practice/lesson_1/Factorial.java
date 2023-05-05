// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число для вычисления факториала: ");
        Integer n = iScanner.nextInt();
        int result = factorial(n);
        System.out.printf("Факториал от %d = %d", n, result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
