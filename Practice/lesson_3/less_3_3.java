package lesson_3;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class less_3_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(0, 100);
            myList.add(val);
        }
        System.out.printf("Первоначальный список %s\n", myList);
        int max = max(myList);
        int min = min(myList);

        int sumItems = 0;

        for (int item : myList) {
            sumItems += item;
        }

        float average = (float) sumItems / myList.size();
        System.out.printf("MAX = %s\n", max);
        System.out.printf("MIN = %s\n", min);
        System.out.printf("AVG = %s\n", average);
    }
}
