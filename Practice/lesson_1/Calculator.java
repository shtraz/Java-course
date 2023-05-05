import java.nio.charset.Charset;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Integer firstNumber = iScanner.nextInt();
        System.out.printf("Введите знак операции (+, -, *, /): ");
        String operation = iScanner.next();
        System.out.printf("Введите второе число: ");
        Integer secondNumber = iScanner.nextInt();

        switch (operation) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case "/":
                System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
                break;
        }
    }
}
