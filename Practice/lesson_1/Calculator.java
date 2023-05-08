//Реализовать простой калькулятор
//*дополнительно. К калькулятору из предыдущего дз добавить логирование.
//1 + 3 = 4
//4 + 3 = 7

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Logger logger = getLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Integer firstNumber = iScanner.nextInt();
        logger.info(String.format("Введено первое число: %d", firstNumber));
        System.out.printf("Введите знак операции (+, -, *, /): ");
        String operation = iScanner.next();
        logger.info(String.format("Введена операция вычисления: %s", operation));
        System.out.printf("Введите второе число: ");
        Integer secondNumber = iScanner.nextInt();
        logger.info(String.format("Введено второе число: %d", secondNumber));

        int result;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                logger.info(String.format("Получен ответ: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case "-":
                result = firstNumber - secondNumber;
                logger.info(String.format("Получен ответ: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case "*":
                result = firstNumber * secondNumber;
                logger.info(String.format("Получен ответ: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case "/":
                result = firstNumber / secondNumber;
                logger.info(String.format("Получен ответ: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d / %d = %d", firstNumber, secondNumber, result);
                break;
        }
    }

    private static Logger getLogger() throws IOException {
        Logger logger = Logger.getLogger(Calculator.class.getName());
        File dir = new File("C:/Users/shtraz/IdeaProjects/Java-course/Practice/lesson_1");

        FileHandler fh = new FileHandler(dir + "\\calculatorLog.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        return logger;
    }
}
