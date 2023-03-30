public class concatenate {
    public static void main(String[] args) {
        String s = "qwe";
        int a = 123;
        String q = s + a;
        System.out.println(q); // В итоге получаем 4 строки.
                               // 1. s = qwe
                               // 2. Неявное преобразование a в string
                               // 3. q = s + a
                               // 4. q
    }
}
