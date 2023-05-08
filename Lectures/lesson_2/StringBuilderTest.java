public class StringBuilderTest {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
////        Простое создание миллиона знаков +
//        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
//            str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
//        System.out.println(sb);

    }
}
