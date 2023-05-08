//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class bubbleSort {
    public static void main(String[] args) throws IOException {
        Logger logger = getLogger();
        int[] arr = new int[]{5, 4, 3, 2, 1};
        logger.info(Arrays.toString(arr));
        int buf;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
                logger.info(Arrays.toString(arr));
            }
        }
    }

    private static Logger getLogger() throws IOException {
        Logger logger = Logger.getLogger(bubbleSort.class.getName());
        File dir = new File("C:/Users/shtraz/IdeaProjects/Java-course/Practice/lesson_2");

        FileHandler fh = new FileHandler(dir + "\\log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        return logger;
    }
}