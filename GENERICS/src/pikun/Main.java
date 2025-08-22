package pikun;

//Step 1: Define a generic class Box<T>
class Box<T> {  
 private T item;  //  T allows item to hold different types (Integer, String, etc.).

 // Step 2: Constructor initializes 'item'
 public Box(T item) {
     this.item = item;
 }

 // Step 3: Method to return the item
 public T getItem() {
     return item;
 }
}

public class Main {
 public static void main(String[] args) {
     // Step 4: Creating a Box for Integer
     Box<Integer> intBox = new Box<>(10);
     System.out.println("Integer Value: " + intBox.getItem());

     // Step 5: Creating a Box for String
     Box<String> strBox = new Box<>("Hello Generics");
     System.out.println("String Value: " + strBox.getItem());
 }
}


//Step	Code Execution	Explanation
//1	Box<Integer> intBox = new Box<>(10);	Creates an object of Box<Integer>. Here, T becomes Integer.
//2	public Box(T item) { this.item = item; }	Calls the constructor, storing 10 in item.
//3	intBox.getItem();	Calls getItem(), returning 10.
//4	System.out.println("Integer Value: " + intBox.getItem());	Prints: "Integer Value: 10"
//5	Box<String> strBox = new Box<>("Hello Generics");	Creates an object of Box<String>. Here, T becomes String.
//6	public Box(T item) { this.item = item; }	Calls the constructor, storing "Hello Generics" in item.
//7	strBox.getItem();	Calls getItem(), returning "Hello Generics".
//8	System.out.println("String Value: " + strBox.getItem());	Prints: "String Value: Hello Generics"
