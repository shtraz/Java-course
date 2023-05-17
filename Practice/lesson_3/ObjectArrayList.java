package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>(Arrays.asList(100, "aaa", 1, "qwe", 2.0,
                true, false, 21 / 2, 21 / 2.0, "^^", 100, 123, 543534));
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
