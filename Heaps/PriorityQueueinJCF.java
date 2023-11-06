// import java.util.Collections;
import java.util.PriorityQueue;


class PriorityQueueinJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //For reversing the Priority Queue

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}