//����������� ������� �����������

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
        System.out.printf("������� ������ �����: ");
        Integer firstNumber = iScanner.nextInt();
        logger.info(String.format("������� ������ �����: %d", firstNumber));
        System.out.printf("������� ���� �������� (+, -, *, /): ");
        String operation = iScanner.next();
        logger.info(String.format("������� �������� ����������: %s", operation));
        System.out.printf("������� ������ �����: ");
        Integer secondNumber = iScanner.nextInt();
        logger.info(String.format("������� ������ �����: %d", secondNumber));

        int result;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                logger.info(String.format("������� �����: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case "-":
                result = firstNumber - secondNumber;
                logger.info(String.format("������� �����: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case "*":
                result = firstNumber * secondNumber;
                logger.info(String.format("������� �����: %d %s %d = %d", firstNumber, operation, secondNumber, result));
//                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case "/":
                result = firstNumber / secondNumber;
                logger.info(String.format("������� �����: %d %s %d = %d", firstNumber, operation, secondNumber, result));
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
