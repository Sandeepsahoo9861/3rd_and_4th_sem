package pikun;

public class Bst_1_without_static_method {

    // Non-static inner class
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Root of the BST
    Node root = null;

    // Instance method (not static anymore)
    public Node insert(Node root, int val) {
        if (root == null) {
        	root = new Node(val);
        	return root;
 
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal
    public void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        Bst_1_without_static_method tree = new Bst_1_without_static_method(); // Create BST object
        int[] values = {5, 1, 3, 8, 2, 7};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        tree.inorder(tree.root);
        System.out.println();
    }
}
 
//....................................
//✅ 1. Why static class Node?
//It allows creating Node without needing a BST object.
//
//Useful when Node doesn’t depend on outer class (BST).
//
//Cleaner and simpler for tree building.
//
//❌ What happens if you remove static?
//You must create a BST object to create a Node.
//
//You can't use Node in a static method directly.
//
//More complicated structure.

//............
//✅ Final Conclusion (What to Remember):
//
//Static Node	               Non-static Node
//Simple usage	               Extra steps needed
//Ideal for trees   	       Only if inner class needs outer instance
//Works in static methods	   Needs non-static context