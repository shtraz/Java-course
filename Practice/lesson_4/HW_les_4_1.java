/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<>();
        RandomList(10, 10, myList);
        LinkedList<Integer> newList = ReverseMyList(myList);

        System.out.println(myList.toString());
        System.out.println(newList.toString());
    }

    public static LinkedList<Integer> ReverseMyList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();

        for(int i = list.size(); i > 0; i--) {
            newList.add(list.get(i - 1));
            }

        return newList;
        }

     public static void RandomList(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        
         for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }
}
