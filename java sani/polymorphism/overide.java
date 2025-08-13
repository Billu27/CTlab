package polymorphism;
import java.util.Scanner;
public class overide {
  public static void main(String[] args) {
    String name;
    // A obj1 = new A();
    // obj1.greeting();

    // B obj2 = new B();
    // obj2.greeting();

    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter your name : ");
    name = sc.nextLine();

    System.out.println("Your name is : "+name);
  }
}
