import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
//        list.add("stribg line"); // Строку уже добавить нельза так как  Integer

        for (Object o : list) {
            System.out.println(o);
            //Проблема извлеченияч данных
        }
    }
}
