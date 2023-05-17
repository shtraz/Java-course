package lesson_3;

import java.util.ArrayList;
import java.util.Random;

public class PlanetsRandomCount {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // Очищает Терминал от лишнего

        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        Random rd = new Random();
        ArrayList<String> plnList = new ArrayList<>();
        int flag = 10000;
        for (int i = 0; i < flag; i++) {
            plnList.add(planets[rd.nextInt(planets.length)]);

        }
//        System.out.println(plnList);
        int count = 0;

        long time1 = System.nanoTime();
        for (String el : planets) {
            for (String el2 : plnList) {
                if (el2.equals(el)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.printf("%s: %d \n", el, count);
            }
            count = 0;
        }

        time1 = System.nanoTime() - time1;
        System.out.printf("\nElapsed %,9.3f ms\n", time1 / 1_000_000.0);

        System.out.println("==========================================");
        System.out.println();

        long time2 = System.nanoTime();
        count = 1;
        plnList.sort(null);
        for (int i = 1; i < plnList.size(); i++) {
            if (plnList.get(i).equals(plnList.get(i - 1))) {
                count++;
            } else {
                System.out.printf("%s: %d \n", plnList.get(i - 1), count);
                count = 1;
            }
        }
        System.out.printf("%s: %d \n", plnList.get(plnList.size() - 1), count);

        time2 = System.nanoTime() - time2;
        System.out.printf("\nElapsed %,9.3f ms\n", time2 / 1_000_000.0);

        System.out.println("==========================================");
        System.out.println();

        long time3 = System.nanoTime();
        count = 1;
        for (int i = 0; i < plnList.size(); i++) {
            for (int j = i + 1; j < plnList.size(); j++) {
                if (plnList.get(i).equals(plnList.get(j))) {
                    count++;
                    plnList.remove(j);
                    j--;
                }
            }
//            plnList
        }

        time3 = System.nanoTime() - time3;
        System.out.printf("\nElapsed %,9.3f ms\n", time3 / 1_000_000.0);
//        System.out.println("result : "+
//                Arrays.stream(new String[]{planets[rd.nextInt(planets.length)]})
//                        .collect(groupingBy(Function.identity(),counting())));
    }
}
