// Интерфейс Queue расширяет Collection и объявляет поведение очередей, которые представляют собой список с дисциплиной "первый вошел, первый вышел" (FIFO). 
// Существуют разные типы очередей, в которых порядок основан на некотором критерии. Очереди не могут хранить значения null.

// Методы интерфейса Queue:
// Е element() - возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.
// Е remove() - удаляет элемент из головы очереди, возвращая его. Инициирует исключение NoSuchElementException, если очередь пуста.
// Е peek() - возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.
// Е роll() - возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
// boolean offer(Е оbj) - пытается добавить оbj в очередь. Возвращает true, если оbj добавлен, и false в противном случае.
// Пример 1. Методы offer(), peek(), poll() интерфейса Queue
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        System.out.println(queue.peek());
        System.out.println(queue);

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}
