//Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите N число: ");
        Integer maxNumber = iScanner.nextInt();

        for (int i = 2; i < maxNumber; ++i) {
            int count = 0;
            for (int j = 2; j <= i; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count == 1)
                System.out.println(i);
        }
    }
}
