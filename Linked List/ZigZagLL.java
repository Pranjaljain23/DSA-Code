public class ZigZagLL {

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
        //Step 1: Create a new node
        Node newNode = new Node(data);

        if (head == null) {  // Case when there is no node and we are creating the first node of the list
            head = tail = newNode;
            return;
        }

        //Step 2: new node's next = head
        newNode.next = head; //Link

        //Step 3: head = new node
        head = newNode;
    }

    public void printLL() { //O(n)
        Node temp = head;
        
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void zigZag () {
        //find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev; //Kyuki curr to null tk chla gya so prev me last node of ll hoga
        Node nextLeft, nextRight;

        //alternate merging
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();

        // ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}