public class BuildBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        }
        else{
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder (Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }


    public static Node delete(Node root, int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else {
            //case 1: No child
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2: single child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case 3: both children
            Node IS =  findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        // int[] values = {5, 1, 3, 4, 2, 7};
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};  //Only for delete node code
        Node root = null;
        
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();


        //Search in binary search tree
        // System.out.println(search(root, 5));

        //root = delete(root, 1); //No child case
        // root = delete(root, 10); //single child case

        root = delete(root, 5); // both child case
        System.out.println();

        inOrder(root);
        System.out.println();
    }
}