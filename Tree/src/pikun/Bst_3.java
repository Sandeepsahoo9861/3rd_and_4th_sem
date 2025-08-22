// inorder traversal ka matlab hai left-root-right...”
package pikun;

public class Bst_3 {
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
            return root;//mark my words ,peheli bar sirf ye root ko main function ko retun karega
        }

        if (root.data > val) {
            // Left subtree
           //❌ Nahi, hum root > val nahi likh sakte.
        	//✅ Humein root.data > val hi likhna padta hai.
        	//root ek Node object hai.becase root ka type hai: Node → matlab yeh ek object hai.
        //ex-public static Node insert(Node root, int val)
        	//val ek int hai.
        	
        	//we cant teke root as int becaude
//        	Kyunki root poori ek node ko represent karta hai, sirf uske number (data) ko nahi.
//
//        	root ke andar:
//
//        	data (int)
//
//        	left (Node)
//
//        	right (Node)
//
//        	Ye 3 cheezein hoti hain.

//      	Agar tum root ko int bana doge, toh tum sirf ek number pass kar paoge, poora tree ka structure nahi.
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
        Node root = null; //Node is a class (i.e., an object), and objects can be null in Java.

        for (int i=0;i< values.length;i++) {
            root = insert(root, values[i]);//peheli bar jab ye cal karega ye root retun hoga
        }

        inorder(root); 
        System.out.println(); 
    }
}

//in line no 23 mein jo return likha hai taki wo har ek update ke bad wo aa jaye root pe matlab top 
//position or ye line hamesa run hota if and else ke bad
//Jab hum insert() ko recursively call karte hain, to har level ka return root ensure karta hai ki pehle waale 
//node (parent) ka left ya right properly update ho jaye.

//Aur finally, sab kuch insert hone ke baad original root (Node 5) wapas mil jaata hai
//if chale ya else, dono ke baad ek hi line hoti hai: return root;
//
//Toh agar base case se return nahi hua, to ye return root; hamesha run karega.
//
//Sochne ka tareeka:
//Kya koi bhi condition return root; ke pehle function ko return karwa rahi hai?
//
//Agar haan → to return root; nahi chalega (base case).
//
//Agar nahi → to return root; hamesha chalega (recursive case).
//..............................
//So the thing coming inside the Node is:
//The int value (7) — it goes into the .data field.
//
//Left and right are automatically null until you link children.
//
//🌳 Think of it like a box:
//pgsql
//Copy
//Edit
//     +--------+
//     | data: 7|   <- your integer value goes here
//     | left: -|   <- will point to another Node later
//     | right:-|   <- will point to another Node later
//     +--------+
//Only data gets filled at first.
//left and right are empty (null) — they’ll be filled later as you insert more nodes.
//...............
//🎯 Question:
//"What happens after calling the constructor? How does data become val? How is it set in root?"
//
//🔢 Step-by-Step:
//✅ Step 1: You write:
//
//Node root = new Node(7);
//✅ Step 2: This calls the constructor:
//
//Node(int data) {
//    this.data = data;
//}
//data = 7 (you passed it)
//
//this.data = 7 → Matlab: Node ke andar ka data field ab 7 ban gaya.
//
//✅ Step 3: Java banata hai ek naya Node object:
//Ye object kuch aisa dikhega:
//
//
//+---------------------+
//| data  = 7           |
//| left  = null        |
//| right = null        |
//+---------------------+
//✅ Step 4: That object is returned and assigned to root
//Now:
//
//root ---> (points to that object)
//📌 Final Result:
//root ab ek Node ko point kar raha hai, jisme:
//
//.data = 7
//
//.left = null
//
//.right = null
//
//
//After the Node object is created and returned, it gets assigned to root
//Since this Node object contains the .left and .right fields (both of which
//are null by default), you can use root.right just like any other field of the Node.
