public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst (int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;

        head = newNode;
    }

    public void addLast (int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL () {
        Node temp = head;

        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //DETECT A CYCLE/LOOP IN A LINKED LIST
    public static boolean isCycle () {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if (slow == fast) {
                return true; //cycle exist
            }
        }

        return false; //cycle doesn't exist
    }
    

    
    //REMOVE THE LOOP/CYCLE IN THE LINKED LIST

    public static void removeCycle() {
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle last.node(prev) = null
        prev.next = null;
    }

    public static void main(String[] args) {
        // LinkedList2 ll = new LinkedList2();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.printLL();

        //Another way to form a linked list

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
