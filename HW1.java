import java.util.Scanner;
public class HW1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // add a scanner to be able to input an integer
    System.out.println("How old are you? "); // ask their age
    String age = sc.nextLine(); // receive the input
    System.out.println("You are " + age + " years old"); // print out results (:
//can you do some math for me? take these variables and print out the sum of them!
    int num1 = 10;
    int num2 = 37;
    System.out.println("The sum is...");
    System.out.println(num1 + num2) ;//add the numbers together
//?

    }
}
// I learned how to create an input in Java and print it. Along with printing sums, 
// I learned that I cannot add character string to the print,
// otherwise the sum would print as 1037 instead of 47.
