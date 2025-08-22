// inorder traversal ka matlab hai left-root-right...”,follow this one
package pikun;

public class BST {
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
            root= new Node(val); // <-- constructor is called here,root is object type so val is an int type so we can assint int to obj that why
         //    we use new Node
            return root;
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
            root = insert(root, values[i]);
        }

        inorder(root); 
        System.out.println(); 
    }
}


//FOR MY UNDERSTANDING
//static class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//What does this mean?
//int data; → ye node ke andar ek number store karega (jaise 5, 8, 3...)
//
//Node left; → ye left side ka pointer hai (left child)
//
//Node right; → ye right side ka pointer hai (right child)
//
//🟢 Jab aap ek Node banate ho:
//
//
//Node root = new Node(5);
//Toh ye object memory mein aise dikhega:
//
//	
//	root
//	 |
//	 V
//	+-----------+
//	| data: 5   |
//	| left: null    |
//	| right: null   |
//	+-----------+
//
//	data = 5
//
//left = null (koi left child abhi nahi hai)
//
//right = null (koi right child abhi nahi hai)
//
//Ab aap code mein likhte ho:
//
//root.left = new Node(3);
//Ab kya hota hai?
//
//Ek naya node banta hai jiski value 3 hai.
//
//Us node ka address root.left mein store hota hai.

//root

//+--------+
//| data: 5|
//| left:  ----> +--------+
//| right: null  | data: 3|
//            | left: null |
//            | right: null|
//            +------------+
//
//            
//             Toh "root.left" ka matlab kya hua?
//"root" ek object hai jiske andar ek left variable hai — jo left child node ko point karta hai.
//
//Aapne class mein likha tha:
//
//Node left;
//Toh har node ke paas left naam ka pointer hota hi hai — aapne usko banaya.
//
//🔁 Recap in Simple Hindi:
//Jab aap class Node banate ho, aap uske andar left aur right naam ke variable bana dete ho.
//
//Jab new Node() banate ho, left aur right dono by default null hote hain.
//
//Jab aap root.left = something likhte ho, toh aap us pointer mein naya node ka address bhar rahe ho.
//
//Perfect Sandeep! Here's a simple diagram to explain what happens when you insert nodes into the BST and use root.left and root.right.
//
//Let’s say you run this code:
//
//
//Node root = new Node(5);        // Step 1
//root.left = new Node(3);        // Step 2
//root.right = new Node(8);       // Step 3
//
//🧠 Step-by-step with diagram:
//🟢 Step 1: Node root = new Node(5);

//     root
//      |
//      V
//  +---------+
//  | data: 5 |
//  | left: null  |
//  | right: null |
//  +---------+
//  
//  🟢 Step 2: root.left = new Node(3);
//
//     root
//      |
//      V
//  +---------+
//  | data: 5 |
//  | left: ---------> +---------+
//  | right: null      | data: 3 |
//                     | left: null |
//                     | right: null|
//                     +-----------+
//                     
//             
//   🟢 Step 3: root.right = new Node(8);
//
//     root
//      |
//      V
//  +---------+
//  | data: 5 |
//  | left: ---------> +---------+
//  | right: --------> +---------+
//                     | data: 3 |     | data: 8 |
//                     | left: null   | left: null |
//                     | right: null  | right: null|
//                     +-----------+  +-----------+
//                     
//  ✅ So when you write root.left or root.right:
//You're saying:
//
//“Go inside the root node and access its left or right pointer.”



// HOW DOES THE CODE FROM 14 TO 42 WORKS ARE EXPLAINED BELOW

//🔧 Aapka tree abhi aise hai:
//Sirf 2 number insert hue hain:
//
//
//values[] = {5, 1};
//Isse tree bana hai:
//
//
//    5
//   /
//  1
//Ab hum 3 insert kar rahe hain.
//
//So, call hai:
//

//insert(root = 5, 3);
//a hai:
//🔍 Step-by-step samajhte hain:
//📍 First Call: insert(5, 3)
//
//
//if (root == null) ❌ (root is 5, so not null)
//
//if (root.data > val) → 5 > 3 ✔️
//
//// So we go to the left
//root.left = insert(root.left, 3);
//Yani hum root.left ki taraf ja rahe hain. Aur root.left abhi 1 hai. So ab call hot

//insert(1, 3);
//
//
//📍 Second Call: insert(1, 3)
//
//if (root == null) ❌ (root is 1, so not null)
//
//if (root.data > val) → 1 > 3 ❌
//
//else → go to right
//
//root.right = insert(root.right, 3);
//Ab root.right abhi null hai (kyunki 1 ke right mein kuch bhi nahi hai).
//
//So, ab call hota hai:
//
//
//insert(null, 3);
//📍 Third Call: insert(null, 3)
//
//if (root == null) ✔️ (root is null)
//
//return new Node(3);



// INORDER FUNCTION KA KAM YE HOTA HAI 
//Tree ke elements ko chhote se bada order (sorted order) mein print karna.
//🎯 Sabse pehle ek chhota sa example lete hain:
//Aapka tree hai:
//
//
//    10
//   /  \
//  5    15
//  
//  Step-by-step dry run of inorder(10)
//  📞 Call: inorder(10)

//  1. root = 10, root is not null
//  2. Call → inorder(10.left) → inorder(5)
//  📞 Call: inorder(5)
// 
//  
//  1. root = 5, not null
//  2. Call → inorder(5.left) → null → return
//  3. Print → 5
//  4. Call → inorder(5.right) → null → return
//  ⬅️ Ye call pura ho gaya, return back to inorder(10)
//
//  Back to inorder(10)
//  
//  5 already printed
//  Now: Print → 10
//  Call → inorder(10.right) → inorder(15)
//  📞 Call: inorder(15)
// 
//  1. root = 15, not null
//  2. Call → inorder(15.left) → null → return
//  3. Print → 15
//  4. Call → inorder(15.right) → null → return
//  ✅ Final Output:
// 
//  5 10 15
//  🧠 Ek simple formula yaad rakh lo:
//  Har node pe:
//
//  Pehle uske left jao
//
//  Phir khud ko print karo
//
//  Phir uske right jao
//
//  🏁 Summary:
//  Agar aapke tree me nodes aise insert hue hain ki:
//
// 
//  values[] = {10, 5, 15};
//  Toh inorder() ka output hoga:
//
//  5 10 15
//  Matlab sabse chhota se lekar sabse bada tak print karega.
//
