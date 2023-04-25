import java.util.Arrays;

public class less_1_3 {
    // Дан массив nums = [3, 2, 4, 3, 2, 5, 3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    // Таким образом, первые несколько (или все) элементы массива должны быть отличны от заданного, а остальные - равны ему.
    // [2, 4, 2, 5, 3, 3, 3]
    public static void main(String[] args) {
        final int val = 3;
        int[] arr = new int[]{3, 3, 3, 3, 2, 3, 3, 4, 3, 2, 5, 3, 3, 3, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == val) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = val;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
