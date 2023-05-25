// Класс LinkedList
// Класс LinkedList реализует интерфейсы сразу два интерфейса - List, Deque. LinkedList – это двусвязный список.

// Конструкторы класса LinkedList:

// LinkedList()
// LinkedList(Collection<? extends Е> с)
// Внутри класса LinkedList существует static inner класс Entry, с помощью которого создаются новые элементы:
// private static class Entry<E>
// {
//     E element;
//     Entry<E> next;
//     Entry<E> prev;

//     Entry(E element, Entry<E> next, Entry<E> prev)
//     {
//         this.element = element;
//         this.next = next;
//         this.prev = prev;
//     }
// }

// Из LinkedList можно организовать стек, очередь, или двойную очередь, со временем доступа O(1).
// На вставку и удаление из середины списка, получение элемента по индексу или значению потребуется линейное время O(n).
// Однако, на добавление и удаление из середины списка, используя ListIterator.add() и ListIterator.remove(), потребуется O(1). 
// Позволяет добавлять любые значения, в том числе и null.

// Пример Использование класса LinkedList

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");
        System.out.println("Содержимое: " + list);

        list.remove("F");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("Содержимое после удаления: " + list);

        String val = list.get(2);
        list.set(2, val + "+");
        System.out.println("Содержимое после изменения: " + list);
    }
}
