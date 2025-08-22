//printing binary tree
package apnacollage;

public class Bst {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {// eq-1
        if (root == null) {
            root = new Node(val);//root is object type so val is an int type so we can assint int to obj that why we use new Node
            
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);// this is recurrsive method it will call again and again to eq -1 ,at which case root.dat < val it
            // call insert(root.right,val) when root .left become null it return root
        } else {
            root.right = insert(root.right, val);
        }
        return root;//after every if elase over it works so it go back to it root;it retun statement works how many times function is called
    }

    // ✅ Moved outside
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " "); // used print, 
        inorder(root.right); 
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);//first time is root is passed null should started from main method,so first it passed insert(null,5)
        }//it return 5 so root become 5,when second time call it start form for loop

        inorder(root);
        System.out.println();
    }
}

//✅ Simple trick to remember:
//Check for root == null to see if the node exists
//Check for root.data == x only if you’re sure root is not null

//....................
//| If you want to...                          | Use                                                                               | Why?                                                                                                                                                                                                                                                   |
//| ------------------------------------------ | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
//| **Check if node is missing**               | `root == null` ✅                                                                  | ✅ Use this **whenever you want to know if a node exists or not.** For example, in a tree traversal or insert, you check `if (root == null)` to know if the spot is empty. This is the most common check before inserting a node or stopping recursion. |
//| **Create an empty root**                   | `Node root = null;` ✅                                                             | ✅ This is a **declaration**. You are saying: “I have a variable named `root`, but it doesn't point to any node yet.” You usually do this at the start of your `main()` when the tree is empty.                                                         |
//| **Check node value is null (object only)** | `root.data == null` ✅ (⚠️ only if `data` is an object like `Integer` or `String`) | ✅ This is used when you know the node exists (`root != null`), but you want to check if its **value is not filled yet**. ⚠️ Don't use this when `data` is a primitive like `int`, because `int` can't be `null`.                                       |
//........................
// THE  return root; WRITTEN AFTER ELSE STATMENT HELP IN PASS THE ORIGINAL ROOT VALUE TO MAIN METHOD
/*| Inserted Value | What was returned from bottom to top    |
| -------------- | --------------------------------------- |
| 5              | `Node(5)`                               |
| 1              | `Node(1) → Node(5)`                     |
| 3              | `Node(3) → Node(1) → Node(5)`           |
| 4              | `Node(4) → Node(3) → Node(1) → Node(5)` |
| 2              | `Node(2) → Node(3) → Node(1) → Node(5)` |
| 7              | `Node(7) → Node(5)`                     |
*/
//..................................................

//| If you want to...                          | Use                                                                       | Why?                                                                                                                                                |
//| ------------------------------------------ | ------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
//| **Check if node is missing**               | `head == null` ✅                                                          | ✅ To check if the list is empty, or you’ve reached the end. Just like trees, linked list nodes are objects, so we check if the reference is `null`. |
//| **Create an empty head**                   | `Node head = null;` ✅                                                     | ✅ You do this at the start of your linked list, just like a tree. You're saying: "This list is empty right now."                                    |
//| **Check node value is null (object only)** | `head.data == null` ✅ (⚠️ only for object types like `String`, `Integer`) | ✅ Only valid if `data` is not primitive. If you're using `int data`, this is illegal. If `Integer data`, you can check if value is not yet set.     |

