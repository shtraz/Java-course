// 1. Нужно сохранить text в связный список.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка
// Цикл пока не введено stop

// asd
// [asd]
// sdf
// [asd,sdf]
// qwe
// [asd,sdf,qwe]
// print~2
// sdf
// [asd,qwe]
// print~2
// qwe
// [asd]

import java.util.Scanner;
import java.util.LinkedList;

public class less_4_LinkedListExample_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean stop = false;
        String line = "";
        String ind = "";
        int i = 0;
        
        while(!stop){
            line = sc.nextLine();
            if (line.equals("stop")) {
                stop = true;
                System.out.println(list);
            }else {
                // if (line.length() > 5 && line.charAt(5) == '~') {
                if (line.length() > 5 && line.substring(0, 6).equals("print~")) {
                    ind = line.substring(6, line.length());
                    i = Integer.parseInt(ind);
                    System.out.println(list.get(i - 1));
                    list.remove(i - 1);
                    System.out.println(list);
                }else {
                    list.add(line);
                    System.out.println(list);
                }
            }
        }
    }
}
