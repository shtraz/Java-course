import java.util.Random;
import java.util.Scanner;

// Вывести максимальное количество 1 в ряду подряд.
public class less_1_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        Integer len_arr = iScanner.nextInt();
        int[] arr = new int[len_arr];//{1, 1, 1, 1, 0, 0, 0, 0, 1, 1};
        Random item = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item.nextInt(0, 2);
            System.out.printf("%d, ", arr[i]);
        }
        int currCount = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currCount++;
            } else {
                if (maxCount < currCount) {
                    maxCount = currCount;
                }
                currCount = 0;
            }
        }
        if (maxCount < currCount) {
            maxCount = currCount;
        }

        System.out.printf("\nmax_count = %d", maxCount);
    }
}
