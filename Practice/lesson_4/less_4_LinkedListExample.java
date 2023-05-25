// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class less_4_LinkedListExample {
    public static void main (String[] args) {
        
        // long time1 = System.nanoTime();
        long curtime1 = System.currentTimeMillis();
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        Integer arrSize = 100000;
        
        for (int i = 0; i < arrSize; i++){
            arr1.add(0, i); // Ставим в начало списка тем самым сдвигая индексы остальных
        }
        // System.out.println(arr1);
        
        // time1 = System.nanoTime() - time1;
        curtime1 = System.currentTimeMillis() - curtime1;
        // System.out.printf("NanoTime ArrayList: %,9.3f ms\n", time1 / 1_000_000.0);
        System.out.println("currentTimeMillis ArrayList: " + curtime1);
        
        
        // long time2 = System.nanoTime();
        long curtime2 = System.currentTimeMillis();
        LinkedList<Integer> arr2 = new LinkedList<>();

        for (int i = 0; i < arrSize; i++){
            arr2.add(0, i); // Ставим в начало списка тем самым сдвигая индексы остальных. LinkedList в разы быстрее в таком случае.
        }
        // System.out.println(arr2);
        
        // time1 = System.nanoTime() - time2;
        curtime2 = System.currentTimeMillis() - curtime2;
        // System.out.printf("NanoTime LinkedList: %,9.3f ms\n", time2 / 1_000_000.0);
        System.out.println("currentTimeMillis LinkedList: " + curtime2);
    }
}
