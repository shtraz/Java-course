import java.util.*;

public class Iterator_primer {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        // ИТЕРАТОР
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
//            col.remove(); // Нельзя удалять или изменять или 2 раза получать в Foreach
            System.out.println(col.next());
//            col.next(); // Нельзя 2 раза получать в Foreach
        }
    }
}
