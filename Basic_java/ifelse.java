package Basic_java;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int check = sc.nextInt();

        if (check%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        sc.close();
    }
}
