import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo{
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Queue element removed :"+queue.remove());
        System.out.println("Queue element peeked :"+queue.peek());
        System.out.println("Queue size :"+queue.size());
    }
}