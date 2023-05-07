package lesson_2;

//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).

public class less2_3Palindrom {
    static boolean palindrom(String str) {
        int i1 = 0;
        int i2 = str.length() - 1;
        while (i2 > i1) {
            if (str.charAt(i1) != str.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrom("2123456543212"));
    }
}

