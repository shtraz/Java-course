package lesson_3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class less_3_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(0, 100);
            list1.add(val);
        }
        System.out.printf("Исходный список %s\n", list1);
        int i = 0;

        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Итоговый список %s", list1);
    }
}
