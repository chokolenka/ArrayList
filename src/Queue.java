import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);// создаем очередь  с int элементами в рандомном порядке
        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(9);
        pq.offer(1);
        System.out.println("Removing elements from the queue:");
        while (!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
        System.out.println("Collection:" + pq);
        System.out.println("Collection's size:" + pq.size());
        System.out.println("\nCollection Using Iterator:");
        Iterator<Integer> iter = pq.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        // способы получения первого элемента очереди:
        System.out.println("Picking the head of the queue:" + pq.peek());//без удаления этого элемента из очереди
        System.out.println("Collection:" + pq);
        System.out.println("Collection's size:" + pq.size());
        System.out.println("Polling the head of the queue:" + pq.poll());//с удалением этого элемента из очереди
        System.out.println("Collection:" + pq);
        System.out.println("Collection's size:" + pq.size());
    }

    // создаем компаратор для сорттировки в порядке уменьшения значений элементов
    static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > 02) {// если первый элемент больше, мы получаем отрицательное значение для уменьшения значений элементов
                return -1;
            }
            if (o1 < 02) {// если первый элемент меньше, мы получаем положительное значение для уменьшения значений элементов
                return 1;
            }
            return 0;// получаем 0, если элементы равны
        }
    };

}
