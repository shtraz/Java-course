package lesson_2;

public class Palindrom {
    static boolean isPalindrom(String str) {
//        String temp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom("ДоВод"));
    }
}
