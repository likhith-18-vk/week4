public class MyClass {
// Static variable count of type int, initialized to zero
static int count = 0;

// Constant variable pi of type double, initialized to 314.15
 final double pi = 314.15;

// Constructor for MyClass
 public MyClass() {
 // Increment the count variable each time an object is created
 count++;
 }
 public static void main(String[] args) {
 // Creating objects of MyClass
 MyClass obj1 = new MyClass();
 MyClass obj2 = new MyClass();
 MyClass obj3 = new MyClass();

 // Print the final value of count and pi
 System.out.println("Final value of count: " + count);
 System.out.println("Value of pi: " + obj1.pi);  // Pi is the same for all objects
 }
}
