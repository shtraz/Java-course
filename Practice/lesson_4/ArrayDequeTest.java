// Интерфейс Deque
// Интерфейс Deque появился в Java 6. Он расширяет Queue и описывает поведение двунаправленной очереди.
// Двунаправленная очередь может функционировать как стандартная очередь FIFO либо как стек LIFO.

// Методы интерфейса Deque:
// void addFirst(Е obj)  - добавляет obj в голову двунаправленной очереди. Возбуждает исключение IllegalStateException, если в очереди ограниченной емкости нет места.
// void addLast(Е obj) - добавляет obj в хвост двунаправленной очереди. Возбуждает исключение IllegalStateException, если в очереди ограниченной емкости нет места.
// Е getFirst() - возвращает первый элемент двунаправленной очереди. Объект из очереди не удаляется. В случае пустой двунаправленной очереди возбуждает исключение NoSuchElementException.
// Е getLast() - возвращает последний элемент двунаправленной очереди. Объект из очереди не удаляется. В случае пустой двунаправленной очереди возбуждает исключения NoSuchElementException.
// boolean offerFirst(Е obj) - пытается добавить obj в голову двунаправленной очереди. Возвращает true, если obj добавлен, и false в противном случае. Таким образом, этот метод возвращает false при попытке добавить obj в полную двунаправленную очередь ограниченной емкости.
// boolean offerLast(E obj) - пытается добавить obj в хвост двунаправленной очереди. Возвращает true, если obj добавлен, и false в против ном случае.
// Е рор() - возвращает элемент, находящийся в голове двунаправленной очереди, одновременно удаляя его из очереди. Возбуждает исключение NoSuchElementException, если очередь пуста.
// void push(Е obj) - добавляет элемент в голову двунаправленной очереди. Если в очереди фиксированного объема нет места, возбуждает исключение IllegalStateException.
// Е peekFirst() - возвращает элемент, находящийся в голове двунаправленной очереди. Возвращает null, если очередь пуста. Объект из очереди не удаляется.
// Е peekLast() - возвращает элемент, находящийся в хвосте двунаправленной очереди. Возвращает null, если очередь пуста. Объект из очереди не удаляется.
// Е pollFirst() - возвращает элемент, находящийся в голове двунаправленной очереди, одновременно удаляя его из очереди. Возвращает null, если очередь пуста.
// Е pollLast() - возвращает элемент, находящийся в хвосте двунаправленной очереди, одновременно удаляя его из очереди. Возвращает null, если очередь пуста.
// Е removeLast() - возвращает элемент, находящийся в конце двунаправленной очереди, удаляя его в процессе. Возбуждает исключение NoSuchElementException, если очередь пуста.
// Е removeFirst() - возвращает элемент, находящийся в голове двунаправленной очереди, одновременно удаляя его из очереди. Возбуждает исключение NoSuchElementException, если очередь пуста.
// boolean removeLastOccurrence(Object obj) - удаляет последнее вхождение obj из двунаправленной очереди. Возвращает true в случае успеха и false если очередь не содержала obj.
// boolean removeFirstOccurrence(Object obj) - удаляет первое вхождение obj из двунаправленной очереди. Возвращает true в случае успеха и false, если очередь не содержала obj.

// Класс ArrayDeque
// ArrayDeque создает двунаправленную очередь.

// Конструкторы класса ArrayDeque:
// ArrayDeque() - создает пустую двунаправленную очередь с вместимостью 16 элементов.
// ArrayDeque(Collection<? extends E> c) - создает двунаправленную очередь из элементов коллекции c в том порядке, в котором они возвращаются итератором коллекции c.
// ArrayDeque(int numElements) - создает пустую двунаправленную очередь с вместимостью numElements.
// Пример 2. Использование класса ArrayDeque

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}

