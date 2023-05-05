//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число для вычисления треугольного числа: ");
        Integer n = iScanner.nextInt();

        int result = n * (n + 1) / 2;
        System.out.printf("Треугольное число от %d = %d", n, result);

    }
}
