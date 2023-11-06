public class MergeSortOnLL {
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

    public Node getMid (Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;  //mergeLL head is -1 so our sorted list start from mergeLL.next so we returned from here
    }

    public Node mergeSort (Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node NewLeft = mergeSort(head);
        Node NewRight = mergeSort(rightHead);

        //merge
        return merge(NewLeft, NewRight);
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

    public static void main(String[] args) {
        MergeSortOnLL ll  = new MergeSortOnLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // ll.addFirst(6);

        ll.printLL();
        head = ll.mergeSort(head);
        ll.printLL();
    }
}
