/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.LinkedList;
import java.util.Random;

// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

// Пример:
// [1, 2, 3, 4, 5, 6, 7]
// spisok.enqueue(8)
// [1, 2, 3, 4, 5, 6, 7,8]
// spisok.dequeue
// 1
// [2, 3, 4, 5, 6, 7,8]
// spisok.first()
// 2

public class Main
{
	public static void main(String[] args) {
	LinkedList<Integer> myList = new LinkedList<>();
        RandomList(10, 10, myList);
        System.out.println(myList);

        enqueue(myList, 5);
        System.out.println(myList);
        
        System.out.println(dequeue(myList));
        System.out.println(myList);
        
        System.out.println(first(myList));
        System.out.println(myList);

    }


     public static void RandomList(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }
    
    
    public static void enqueue(LinkedList<Integer> list, int value) {
        list.add(value);
    }


    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }


    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
