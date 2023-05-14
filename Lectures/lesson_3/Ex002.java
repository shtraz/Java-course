import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       //ArrayList list = new ArrayList();
       list.add(2809);
//       list.add("asdad");


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
