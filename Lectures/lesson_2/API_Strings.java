import java.util.Locale;

public class API_Strings {
    public static void main(String[] args) {
//        concat(); Объединение строк
        System.out.println("\nconcat(); Объединение строк)");

        String a = "qwe";
        String b = "rty";
        System.out.println(a.concat(b));

//        valueOf(); Преобразует Object в строковое представление (завязан на toString)
        System.out.println("\nvalueOf(); Преобразует Object в строковое представление (завязан на toString)");

        Integer x = Integer.valueOf(9); // 9
        Double c = Double.valueOf(5); // 9.0
        Float y = Float.valueOf("80"); // 80.0
        Integer z = Integer.valueOf("0011",2); // 3. 0011 - число в строке, 2 - система счисления в которой изначально записано число 0011

        System.out.println(x);
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);

//        join(); Объединяет набор строк в одну с учетом разделителя
        System.out.println("\njoin(); Объединяет набор строк в одну с учетом разделителя");
        System.out.println(String.join("+",a, b));

//        charAt(); Получение символа по индексу
        System.out.println("\ncharAt(); Получение символа по индексу");
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

//        indexOf(); Первый индекс вхождения подстроки
        System.out.println("\nindexOf(); Первый индекс вхождения подстроки");
        System.out.println(a.indexOf('e'));
        String hello = "Hello";
        int index1 = hello.indexOf('H');
        int index2 = hello.indexOf('o', 3);
//        int index2 = hello.indexOf('o', 5);
        int index3 = hello.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы "+index1 );
        System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы "+index2 );
        System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы "+index3 );

//        lastIndexOf(); Последний индекс вхождения подстроки
        System.out.println("\nlastIndexOf(); Последний индекс вхождения подстроки");
        System.out.println(a.lastIndexOf('w'));
        System.out.println(a.lastIndexOf('w', 1));


//        startsWith() / endsWith(); Определяет, начинается / заканчивается ли строка с подстроки
        System.out.println("\nstartsWith() / endsWith(); Определяет, начинается / заканчивается ли строка с подстроки");
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: " );
        System.out.println(a.startsWith("q") );

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.startsWith("ProgLang") );

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.startsWith("ProgLang", 20) );

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.endsWith("ProgLang.su") );
        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.endsWith("ProgLang.") );

//        replace(); Замена одной подстроки на другую
        System.out.println("\nreplace(); Замена одной подстроки на другую");
        String str1 = "In JavaRush, Diego the best, Diego is Java God";
        System.out.println(str1.replace(",", "|"));
        System.out.println(str1.replace("Java", "Rush"));
        System.out.println(str1.replaceFirst("Diego", "Amigo"));
        System.out.println(str1.replace("Diego", "Amigo"));
        System.out.println(str1.replaceAll("Diego", "Amigo"));
        String value = "In JavaRush, Diego the best, Diego is Java God".replaceAll("\\s[a-zA-Z]{5}\\s", " Mike ");
        System.out.println(value);

//      trim(); Удаляет начальные и конечные пробелы
        System.out.println("\ntrim(); Удаляет начальные и конечные пробелы");

        String str = new String("   Добро пожаловать на ProgLang.su   ");
        System.out.print("Возвращаемое значение: ");
        System.out.println(str.trim());

//      substring(); Возвращает подстроку, см. аргументы
        System.out.println("\nsubstring(); Возвращает подстроку, см. аргументы");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5, 15));

//      toLowercase() / toUpperCase(); Возврат новой строки в верхнем / нижнем регистре
        System.out.println("\ntoLowercase() / toUpperCase(); Возврат новой строки в верхнем / нижнем регистре");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase(Locale.ENGLISH));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toUpperCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toUpperCase(Locale.ENGLISH));

//      compareTo(); Сравнивает 2 строки
        System.out.println("\ncompareTo(); Сравнивает 2 строки");

        String str11 = "Я буду хорошим программистом!";
        String str22 = "Я буду хорошим программистом!";
        String str33 = "Я буду хорошим дворником!";

        int result = str11.compareTo(str22);
        System.out.println(result);

        result = str22.compareTo(str33);
        System.out.println(result);

        result = str33.compareTo(str11);
        System.out.println(result);
        System.out.println();

        Integer xx = 5;
        System.out.println(xx.compareTo(3));
        System.out.println(xx.compareTo(5));
        System.out.println(xx.compareTo(8));

//      equals(); Сравнивает строки с учетом регистра
        System.out.println("\nequals(); Сравнивает строки с учетом регистра");

        String Str11 = "Добро пожаловать на ProgLang.su";
        String Str22 = "ДОБРО пожаловать на ProgLang.su";
        String Str222 = "Добро пожаловать на ProgLang.su";
        String Str33 = new String("Сайт для изучения программирования");
        boolean retVal;

        retVal = Str11.equals(Str22);
        System.out.println("Строка Str11 равна строке Str222? Ответ: " + retVal );

        retVal = Str11.equals(Str222);
        System.out.println("Строка Str11 равна строке Str22? Ответ: " + retVal );

        retVal = Str11.equals(Str33);
        System.out.println("Строка Str11 равна строке Str33? Ответ: " + retVal );

//      equalsIgnoreCase(); Сравнивает строки без учета регистра
        System.out.println("\nequalsIgnoreCase(); Сравнивает строки без учета регистра");

        retVal = Str11.equalsIgnoreCase(Str22);
        System.out.println("Строка Str11 равна строке Str222? Ответ: " + retVal );

        retVal = Str11.equalsIgnoreCase(Str222);
        System.out.println("Строка Str11 равна строке Str22? Ответ: " + retVal );

        retVal = Str11.equalsIgnoreCase(Str33);
        System.out.println("Строка Str11 равна строке Str33? Ответ: " + retVal );

//      regionMatches(); Сравнивает подстроки в строках
        System.out.println("\nregionMatches(); Сравнивает подстроки в строках");
//        Параметры
//        Подробная информация о параметрах:
//
//        toffset – начальное смещение субобласти в этой строке;
//        other – строковый аргумент;
//        ooffset – начальное смещение субобласти в строковом аргументе;
//        len – количество символов для сравнения;
//        ignoreCase – значение true, если не учитывать регистр при сравнении символов.
//        Возвращаемое значение
//        В Java regionMatches() возвращает значение true, если указанная субобласть данной строки соответствует субобласти
//        указанного строкового аргумента; в противном случае значение false.

        String Str01 = new String("Добро пожаловать на ProgLang.su");
        String Str02 = new String("ProgLang");
        String Str03 = new String("PROGLANG");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str01.regionMatches(20, Str02, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str01.regionMatches(20, Str03, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str01.regionMatches(true, 20, Str03, 0, 8));





    }
}
