//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.
//6
//a b
//ababab

import java.util.Scanner;

public class less2_1GenerateString {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите четное число > 0: ");
        Integer n = iScanner.nextInt();
        String c1 = "a";
        String c2 = "b";
        extracted(n, c1, c2);
        System.out.print(palindrom("12345654321"));
    }

    private static void extracted(Integer n, String c1, String c2) {
        StringBuilder result = new StringBuilder();

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                result.append(c1 + c2);
            }
        } else {
            result.append("Введено нечетное число!");
        }
        System.out.println(result);
    }

    private static boolean palindrom(String str) {
        int length = str.length();
        for (int i = 0; i < (length / 2); i++) {
// Сравниваем символы попарно
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
