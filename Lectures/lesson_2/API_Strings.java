import java.util.Locale;

public class API_Strings {
    public static void main(String[] args) {
//        concat(); ����������� �����
        System.out.println("\nconcat(); ����������� �����)");

        String a = "qwe";
        String b = "rty";
        System.out.println(a.concat(b));

//        valueOf(); ����������� Object � ��������� ������������� (������� �� toString)
        System.out.println("\nvalueOf(); ����������� Object � ��������� ������������� (������� �� toString)");

        Integer x = Integer.valueOf(9); // 9
        Double c = Double.valueOf(5); // 9.0
        Float y = Float.valueOf("80"); // 80.0
        Integer z = Integer.valueOf("0011",2); // 3. 0011 - ����� � ������, 2 - ������� ��������� � ������� ���������� �������� ����� 0011

        System.out.println(x);
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);

//        join(); ���������� ����� ����� � ���� � ������ �����������
        System.out.println("\njoin(); ���������� ����� ����� � ���� � ������ �����������");
        System.out.println(String.join("+",a, b));

//        charAt(); ��������� ������� �� �������
        System.out.println("\ncharAt(); ��������� ������� �� �������");
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

//        indexOf(); ������ ������ ��������� ���������
        System.out.println("\nindexOf(); ������ ������ ��������� ���������");
        System.out.println(a.indexOf('e'));
        String hello = "Hello";
        int index1 = hello.indexOf('H');
        int index2 = hello.indexOf('o', 3);
//        int index2 = hello.indexOf('o', 5);
        int index3 = hello.indexOf('W');
        System.out.println("�� ���� ����� 'H' � ������ "+hello+". ������ ������ ����� "+index1 );
        System.out.println("�� ���� ����� 'o' � ������ "+hello+". ������ ������ ����� "+index2 );
        System.out.println("�� ���� ����� 'W' � ������ "+hello+". ������ ������ ����� "+index3 );

//        lastIndexOf(); ��������� ������ ��������� ���������
        System.out.println("\nlastIndexOf(); ��������� ������ ��������� ���������");
        System.out.println(a.lastIndexOf('w'));
        System.out.println(a.lastIndexOf('w', 1));


//        startsWith() / endsWith(); ����������, ���������� / ������������� �� ������ � ���������
        System.out.println("\nstartsWith() / endsWith(); ����������, ���������� / ������������� �� ������ � ���������");
        String Str = new String("����� ���������� �� ProgLang.su");

        System.out.print("������������ ��������: " );
        System.out.println(a.startsWith("q") );

        System.out.print("������������ ��������: " );
        System.out.println(Str.startsWith("ProgLang") );

        System.out.print("������������ ��������: " );
        System.out.println(Str.startsWith("ProgLang", 20) );

        System.out.print("������������ ��������: " );
        System.out.println(Str.endsWith("ProgLang.su") );
        System.out.print("������������ ��������: " );
        System.out.println(Str.endsWith("ProgLang.") );

//        replace(); ������ ����� ��������� �� ������
        System.out.println("\nreplace(); ������ ����� ��������� �� ������");
        String str1 = "In JavaRush, Diego the best, Diego is Java God";
        System.out.println(str1.replace(",", "|"));
        System.out.println(str1.replace("Java", "Rush"));
        System.out.println(str1.replaceFirst("Diego", "Amigo"));
        System.out.println(str1.replace("Diego", "Amigo"));
        System.out.println(str1.replaceAll("Diego", "Amigo"));
        String value = "In JavaRush, Diego the best, Diego is Java God".replaceAll("\\s[a-zA-Z]{5}\\s", " Mike ");
        System.out.println(value);

//      trim(); ������� ��������� � �������� �������
        System.out.println("\ntrim(); ������� ��������� � �������� �������");

        String str = new String("   ����� ���������� �� ProgLang.su   ");
        System.out.print("������������ ��������: ");
        System.out.println(str.trim());

//      substring(); ���������� ���������, ��. ���������
        System.out.println("\nsubstring(); ���������� ���������, ��. ���������");

        System.out.print("������������ ��������: ");
        System.out.println(Str.substring(5));

        System.out.print("������������ ��������: ");
        System.out.println(Str.substring(5, 15));

//      toLowercase() / toUpperCase(); ������� ����� ������ � ������� / ������ ��������
        System.out.println("\ntoLowercase() / toUpperCase(); ������� ����� ������ � ������� / ������ ��������");

        System.out.print("������������ ��������: ");
        System.out.println(Str.toLowerCase());

        System.out.print("������������ ��������: ");
        System.out.println(Str.toLowerCase(Locale.ENGLISH));

        System.out.print("������������ ��������: ");
        System.out.println(Str.toUpperCase());

        System.out.print("������������ ��������: ");
        System.out.println(Str.toUpperCase(Locale.ENGLISH));

//      compareTo(); ���������� 2 ������
        System.out.println("\ncompareTo(); ���������� 2 ������");

        String str11 = "� ���� ������� �������������!";
        String str22 = "� ���� ������� �������������!";
        String str33 = "� ���� ������� ���������!";

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

//      equals(); ���������� ������ � ������ ��������
        System.out.println("\nequals(); ���������� ������ � ������ ��������");

        String Str11 = "����� ���������� �� ProgLang.su";
        String Str22 = "����� ���������� �� ProgLang.su";
        String Str222 = "����� ���������� �� ProgLang.su";
        String Str33 = new String("���� ��� �������� ����������������");
        boolean retVal;

        retVal = Str11.equals(Str22);
        System.out.println("������ Str11 ����� ������ Str222? �����: " + retVal );

        retVal = Str11.equals(Str222);
        System.out.println("������ Str11 ����� ������ Str22? �����: " + retVal );

        retVal = Str11.equals(Str33);
        System.out.println("������ Str11 ����� ������ Str33? �����: " + retVal );

//      equalsIgnoreCase(); ���������� ������ ��� ����� ��������
        System.out.println("\nequalsIgnoreCase(); ���������� ������ ��� ����� ��������");

        retVal = Str11.equalsIgnoreCase(Str22);
        System.out.println("������ Str11 ����� ������ Str222? �����: " + retVal );

        retVal = Str11.equalsIgnoreCase(Str222);
        System.out.println("������ Str11 ����� ������ Str22? �����: " + retVal );

        retVal = Str11.equalsIgnoreCase(Str33);
        System.out.println("������ Str11 ����� ������ Str33? �����: " + retVal );

//      regionMatches(); ���������� ��������� � �������
        System.out.println("\nregionMatches(); ���������� ��������� � �������");
//        ���������
//        ��������� ���������� � ����������:
//
//        toffset � ��������� �������� ���������� � ���� ������;
//        other � ��������� ��������;
//        ooffset � ��������� �������� ���������� � ��������� ���������;
//        len � ���������� �������� ��� ���������;
//        ignoreCase � �������� true, ���� �� ��������� ������� ��� ��������� ��������.
//        ������������ ��������
//        � Java regionMatches() ���������� �������� true, ���� ��������� ���������� ������ ������ ������������� ����������
//        ���������� ���������� ���������; � ��������� ������ �������� false.

        String Str01 = new String("����� ���������� �� ProgLang.su");
        String Str02 = new String("ProgLang");
        String Str03 = new String("PROGLANG");

        System.out.print("������������ ��������: ");
        System.out.println(Str01.regionMatches(20, Str02, 0, 8));

        System.out.print("������������ ��������: ");
        System.out.println(Str01.regionMatches(20, Str03, 0, 8));

        System.out.print("������������ ��������: ");
        System.out.println(Str01.regionMatches(true, 20, Str03, 0, 8));





    }
}
