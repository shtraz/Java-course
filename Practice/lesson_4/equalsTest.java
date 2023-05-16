package lesson_4;

public class equalsTest {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        System.out.println(a == b);

        String str1 = "1234";
        String str2 = new String("1234");

        System.out.println(str1 == str2); // Сравнивает ссылку
        System.out.println(str1.equals(str2)); // Сравнивает значение в строке
    }
}
