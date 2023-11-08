package Basic_java;
import java.util.Scanner;
public class input2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of two numbers is: " + (num1 + num2));
        sc.close();
    }
}
