package lesson_2;

//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcddaaa.
//a4b3cd2a3
public class less2_2ZipString {
    static String zipStr(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count != 1) res.append(count);
                count = 1;
                res.append(str.charAt(i));
            }
        }
        if (count != 1) res.append(count);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.print(zipStr("aaaabbbcddaaa"));
    }
}
