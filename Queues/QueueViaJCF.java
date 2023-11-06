import java.util.*;

public class QueueViaJCF {
    public static void main(String[] args) {
        //Queue can also be implimented by ArrayDeque

        //Read about Queue with LinkedList vs ArrayDeque implimentation   -->READ ABOUT IT
        //They have somewhat difference in memory(cache)


        //This is done using Linked List of Java Collection Framework
        // Queue<Integer> q = new LinkedList<>(); 

        Queue<Integer> q = new ArrayDeque<>();


        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
