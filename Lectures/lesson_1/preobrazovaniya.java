public class preobrazovaniya {
    public static void main(String[] args) {
        int i = 123;
        double d = i; // Не явное преобразование
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415;
        i = (int) d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415;
        i = (int) d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("12"); // Может принимать от 0 до 255.
        System.out.println(b);
        b = Byte.parseByte("1211"); // Может принимать от 0 до 255.
        System.out.println(b); // Получаем переполнение


    }
}
