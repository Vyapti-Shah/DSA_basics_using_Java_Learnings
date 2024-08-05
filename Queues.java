import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        //Queue = FIFO Data Structures. First In First Out (ex: a line of people)
        //      = A collection designed for holding elements prior to processing 
        //      = Linear data structure
        //      = add - enqueue, offer()
        //      = remove - dequeue, poll()
        //      = as Queue is an interface and not a class so the object has to be made with LinkedList

        //Uses of Queue = Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        //              = Printer Queue (Print jobs should be completed in order)
        //              = used in LinkedList, PriorityQueues, Breadth-first search
        
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Dayalal");
        queue.offer("Jayantilal");
        queue.offer("Sanjay");
        queue.offer("Vyapti");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Sanjay"));

        System.out.println(queue.peek());
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
    }
}
