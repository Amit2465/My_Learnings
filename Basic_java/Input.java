package Basic_java;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter your name: ");
        //String name= sc.next();
        System.out.print("Enter your address: ");
        String Address= sc.nextLine();
        //System.out.print("Enter your age: ");
        //int age = sc.nextInt();
        //System.out.println(name);
        System.out.println(Address);
        //System.out.println(age);
        sc.close();
    }
}
