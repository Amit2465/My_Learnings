package Problems;
import java.util.Scanner;
class loop5 {
    public static void main(String[] args) {
        System.out.print("Enter the number for factorial: ");
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        int sum  =1;

        for(int i = 1; i <= factorial; i++) {
            sum*=i;
        }

        System.out.println("Your factorial of " + factorial + "is: "+ sum);
        sc.close();
    }
}