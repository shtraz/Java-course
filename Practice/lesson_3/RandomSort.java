package lesson_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

// Создать рандомный Arraylist и отсортировать его
public class RandomSort {
    public static void main(String[] args) {
        int arrLength = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        Random rd = new Random();
        int counter = 0;
        while (counter != arrLength) {
            arr.add(rd.nextInt(0, 10));
            counter += 1;
//            arr.stream().distinct();
        }
//        for (int i = 0; i < 10; i++) {
//            arr.add(rd.nextInt(0, 10));
//        }
//        List myUniqueList = arr.stream().distinct().collect(Collectors.toList());
//        System.out.println(myUniqueList);

        System.out.println(arr);
//        Collections.sort(arr); // Вариант сортировки
//        arr.sort(null); // Вариант сортировки
//        arr.sort(Comparator.naturalOrder()); // Сортировка по возрастанию
        arr.sort(Comparator.reverseOrder()); // Сортировка по убыванию
        System.out.println(arr);


        int lowNum = 9;
        int highNum = 27;
        int largerNum = lowNum < highNum ? highNum : lowNum; // Тернарный оператор if else
        System.out.println(largerNum);

    }
}
