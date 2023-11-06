public class LinkedList {

    public static class Node {
        int data;
        Node next; //Here Node is itself a data type/object of class

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; //Refers to the first element of the linked list as head
    public static Node tail; //Refers to the last element of the linked list as tail
    public static int size; //To keep track of size of the Linked List

    public void addFirst (int data) {
        //Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {  // Case when there is no node and we are creating the first node of the list
            head = tail = newNode;
            return;
        }

        //Step 2: new node's next = head
        newNode.next = head; //Link

        //Step 3: head = new node
        head = newNode;
    }

    public void addLast (int data) {
        Node newNode = new Node(data);
        size++;
        
        if (head == null) { //head == null represents that linked list was empty and this is the first node 
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public void addInMiddle(int index, int data) {

        if (index == 0) { // if index is 0 then it should be at first
            addFirst(data);
            return;
        }


        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < index - 1) { //loop will stop at the previous of adding index
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast () {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev = i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Q. REVERSE AN LINKED LIST
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // declare last element head because at last curr element will be null
    }

    //Q. DELETE THE NTH NODE FROM THE END OF THE LINKED LIST
    public void deleteNthFromEnd (int n) {
        //calculate size 
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) { //remove first element
            head = head.next;
            return;
        }

        int i = 1; //first node yha 1 liya hai 0 nhi iska dhyan rkhna
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Q. CHECK IF LINKED LIST IS A PALINDROME
    //slow fast approach (IMP)
    public Node findMid (Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //Slow will be the mid Node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(head);

        //2nd half reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev; //Right half ka head after the loop prev will be at the last node so it will be head
        Node left = head;

        //check 1st and 2nd half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);


        /*ll.addFirst(1); 
        ll.addFirst(2);

        This forms linked list 2->1
        */

        ll.addFirst(2);
        ll.addFirst(1);
        //Linked list at this point is 1->2->null

        ll.addLast(3);
        ll.addLast(4);
        //Linked List at this point is 1->2->3->4->null

        ll.addInMiddle(2, 9);
        ll.printLL();

        // System.out.println(ll.size);


        // REMOVING OPERATION IN THE LINKED LIST

        // System.out.println(ll.removeFirst());
        // ll.printLL();


        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.itrSearch(10));

        // ll.reverse();
        // ll.printLL();


        ll.deleteNthFromEnd(3);
        ll.printLL();
    }
}