import java.util.List;
import java.util.*;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
//        list1.remove(1); // java.lang.UnsupportedOperationException  Так просту удалять элементы из Коллекции List.of Нельзя!
        List<Character> list2 = List.copyOf(list1);

        // В классическома варианте можно улалять.
        List<Character> list3 = new ArrayList<>();
        list3.add('S');
        list3.add('e');
        list3.add('r');
        System.out.println(list3);
        list3.remove(1);
        System.out.println(list3);

    }
}
