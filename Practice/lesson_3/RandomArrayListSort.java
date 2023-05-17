package lesson_3;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class RandomArrayListSort {
    public static void main(String[] args) {
        int flag = 10;
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < flag; i++) {
            arr.add(rd.nextInt(0, 10)); // ДОБАВЛЯЕТ В КОНЕЦ МАССИВА
        }
        arr.add(0, rd.nextInt(100, 150)); // ДОБАВЛЯЕТ по индексу
        System.out.println(arr);
//        arr.sort(null);
//        Collections.sort(arr);
//        arr.sort(Comparator.reverseOrder());
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

    }

}
