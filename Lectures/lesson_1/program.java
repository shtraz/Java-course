public class program {
    public static void main(String[] args) {
        // System.out.println("Hi Java");
        // int a = 123;
        // a = --a - a--;
        // System.out.println(a);
        // a = a-- - --a;
        // System.out.println(a);

        // Массивы
        // int[] arr = new int[10];
        // System.out.println(arr[3]);
        // arr[3] = 13;
        // System.out.println(arr[3]);

        // arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(arr.length);
        // int[] arrr; // можно так писать?
        // int brr[]; // можно так писать?

        // Многовмерные массивы
        // int[] arr[] = new int[3][5]; // Многомерны массив 3 строки и 5 столбцов
        // for (int[] line : arr) {
        // for (int item : line) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();

        // Двумерные (а точнее массивы массивов) массивы можно так инициировать
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();

        }

        // Преобразования
        byte b = Byte.parseByte("12"); // Может принимать от 0 до 255.
        System.out.println(b);
        byte d = Byte.parseByte("1211"); // Может принимать от 0 до 255.
        System.out.println(d); // Получаем переполнение

    }

}
