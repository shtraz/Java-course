public class switch_operator {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("a");
                break;
            case 10:
                System.out.println("b");
                break;
            default:
                System.out.println("c");
                break;
        }
    }
}
