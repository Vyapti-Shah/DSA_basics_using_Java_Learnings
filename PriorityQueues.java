import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        //Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with lower priorities
        Queue<Double> quene = new PriorityQueue<>();

        quene.offer(8.7);
        quene.offer(8.0);
        quene.offer(9.3);
        quene.offer(6.5);
        quene.offer(7.0);
        while (!quene.isEmpty()) {
            System.out.println(quene.poll());
        }

        System.out.println();

        Queue<Double> que = new PriorityQueue<>(Collections.reverseOrder());
        que.offer(8.7);
        que.offer(8.0);
        que.offer(9.3);
        que.offer(6.5);
        que.offer(7.0);
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

        System.out.println();

        Queue<String> q = new PriorityQueue<>();
        q.offer("B");
        q.offer("C");
        q.offer("A");
        q.offer("F");
        q.offer("D");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
