// inorder traversal ka matlab hai left-root-right...”
package pikun;

public class Bst_2_recurion_mechanisim {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
    	//root is a Node object
    	//Each Node has its own .data, .left, and .right

        if (root == null) {
            root= new Node(val); // <-- constructor is called here
            return root;//mark my word(first time it will return the root to main)
         }

        if (root.data > val) {
            // Left subtree
            root.left = insert(root.left, val);// recursively calling the insert() method 
            //on the left child of the current node (root.left).
        } else {
            // Right subtree
            root.right = insert(root.right, val); 
        }

        return root;
    }

    // Optional: Function to print the BST in Inorder
    public static void inorder(Node root) {
        if (root == null) {
        	return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 8, 2, 7};
        Node root = null;

        for (int i=0;i< values.length;i++) {
            root = insert(root, values[i]);//jab hum peheli bar return kareng to root ka 
            // value set ho jayega
        }

        inorder(root); 
        System.out.println(); 
    }
}
//.........................................
//Step 1: insert(root, 5)
//Initially, root = null hai.
//
//insert(root, 5) call hota hai.
//Ab root mein Node(5) ho gaya.
//
//
//Step 2: insert(root, 1)
//Ab root = Node(5) hai, aur insert(root, 1) call hota hai.
//
//1. Insert Function ka Main Concept:
//Jab aap insert(root.left, 1) karte hain, toh agar root.left null hai, toh uss case mein insert(null, 1) call hota hai.
//
//Jab aap insert(null, 1) call karte ho, toh yeh naya node banaata hai 1 ke saath, aur usse return kar deta hai.
//
//Phir woh return hua node uss parent node ke left child mein assign ho jaata hai.
//
//Example ke saath samajhte hain:
//1st call: insert(root, 1)
//Jab root = Node(5) hai aur val = 1, hum yeh check karte hain ki 5 > 1
//True, toh hum left mein jaana hai, aur root.left = insert(root.left, 1) call karte hain.
//2nd call: insert(root.left, 1)
//Ab root.left null hai, toh hum insert(null, 1) call karte hain.
//Jab root == null hota hai, tab hum new Node(1) banaate hain, jo Node(1) hota hai.
//
//Yeh Node(1) return ho jaata hai, jo root.left mein assign ho jaata hai
//	    5
//	    /
//	   1
//.....
//Key Takeaways:
//root ka value change nahi hota. root hamesha Node(5) hi rehta hai.
//
//##########################################################################
//“If we say root = new Node(1), then doesn’t that overwrite the original root = new Node(5)?"
//
//But that is not what happens, and here’s why — the magic is in recursion and local variables.
//
//Think of each recursive call like its own small box.
//Each time you call insert(...), a new copy of root is created for that specific call.
//
//Let me explain with a step-by-step dry run:
//
//Edit
//Node root = null;
//root = insert(root, 5);
//root = insert(root, 1);
//First call: insert(null, 5)
//
//root == null → return new Node(5)
//So now in main():
//
//
//root = Node(5)
//Second call: insert(root, 1)
//That means: insert(Node(5), 1)
//
//Let’s walk through the call stack.
//
//Level 1: insert(Node(5), 1)
//root.data = 5 > 1
//
//So go left:
//
//
//root.left = insert(root.left, 1);
//// root.left is null
//Level 2: insert(null, 1)
//Now we’re in a new recursive call where the local root == null,
//so:
//
//
//return new Node(1)
//Back to Level 1, it does:
//
//
//root.left = Node(1)
//Final Tree:
//
//main() → root → Node(5)
//                    /
//                  Node(1)
//So Your Question:
//“We did root = new Node(1) — won’t that change root from 5 to 1?”
//
//No, because that assignment happened in Level 2, in its own local copy of root.
//That root was only for root.left.
//
//The original root in main() (i.e., Node(5)) is still safe and unchanged.
//
//In Short:
//Only the root inside the function call changes.
//
//When we return the new node, it's assigned to root.left or root.right of the parent node.
//
//The original root (Node 5) is never overwritten.
//
//Let me know if you'd like a diagram — it'll make this even more crystal clear!

//You said:
//Ok when we add another element how it works then tell me
//

//
//Great, Sandeep! Let's now see how it works when we add a third element, step by step.
//
//Starting array:

//int[] values = {5, 1, 3};
//We already did:
//
//root = insert(null, 5) → Node(5)
//
//root = insert(root, 1) → Added Node(1) to the left of 5

//root = insert(root, 3) → This is our focus now.
//
//Initial Tree before inserting 3:

//    5
//   /
//  1
//Step-by-step recursion for insert(root, 3)
//→ This means insert(Node(5), 3)
//
//Level 1: insert(Node(5), 3)
//root.data = 5 > 3 → Go left
//root.left = insert(root.left, 3)
//→ insert(Node(1), 3)
//
//Level 2: insert(Node(1), 3)
//root.data = 1 < 3 → Go right
//root.right = insert(root.right, 3)
//→ insert(null, 3) (because 1’s right is null)
//
//Level 3: insert(null, 3)
//root == null → return new Node(3)
//
//Now we go back up the recursive chain:
//
//Level 2: root.right = Node(3) → So now Node(1) has right child 3
//
//Level 1: root.left = Node(1) (updated with its new right child)
//
//Final Tree:
//markdown

//      5
//     /
//    1
//     \
//      3
//Important:
//Each call handles its own piece of the tree.
//
//New nodes are only added at null positions.
//
//Existing root in main() (i.e., 5) stays the same — we only update its children as needed.
//
