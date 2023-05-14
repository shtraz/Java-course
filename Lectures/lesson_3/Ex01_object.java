public class Ex01_object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
//        System.out.println(o.getClass().getName());
        o = 1.2;
        GetType(o);
//        System.out.println(o.getClass().getName());

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2)); // if не обрабатывает данное условие
        System.out.println(Sum(1, 2.0)); // if не обрабатывает данное условие
        System.out.println(Sum(1.2, 2.1));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
