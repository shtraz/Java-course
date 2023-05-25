// Класс PriorityQueue
// PriorityQueue – это класс очереди с приоритетами. По умолчанию очередь с приоритетами размещает элементы согласно естественному порядку сортировки 
// используя Comparable. Элементу с наименьшим значением присваивается наибольший приоритет. 
// Если несколько элементов имеют одинаковый наивысший элемент – связь определяется произвольно. 
// Также можно указать специальный порядок размещения, используя Comparator.
// Конструкторы класса PriorityQueue:
// PriorityQueue() - создает очередь с приоритетами начальной емкостью 11, размещающую элементы согласно естественному порядку сортировки (Comparable);
// PriorityQueue(Collection<? extends E> c);
// PriorityQueue(int initialCapacity);
// PriorityQueue(int initialCapacity, Comparator<? super E> comparator);
// PriorityQueue(PriorityQueue<? extends E> c);
// PriorityQueue(SortedSet<? extends E> c).
// Пример 4. Использование класса PriorityQueue

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Киев");
        queue1.offer("Харьков");
        queue1.offer("Львов");
        queue1.offer("Кременчуг");
        queue1.offer("Кременчуг");
        queue1.offer("Ялта");
        System.out.print("Priority queue с Comparable: ");
        
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();

        PriorityQueue<String> queue2
                = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer("Киев");
        queue2.offer("Харьков");
        queue2.offer("Львов");
        queue2.offer("Кременчуг");
        queue2.offer("Кременчуг");
        queue2.offer("Ялта");
        System.out.print("Priority queue с Comparator: ");
        
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
