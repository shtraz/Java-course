public class StringsOperations {
    public static void main(String[] args) {
        String[] name = {"C", "�", "�", "�", "�", "�"};
        String sk = "������ ��.";
        System.out.println(sk.toLowerCase()); // ������ ��.
        System.out.println(String.join("", name)); // C�����
        System.out.println(String.join(", ", name)); // C, �, �, �, �, �
        System.out.println(String.join("", "C", "�", "�", "�", "�", "�")); // C�����
        System.out.println(String.join(",", "C", "�", "�", "�", "�", "�")); // C,�,�,�,�,�
    }
}
