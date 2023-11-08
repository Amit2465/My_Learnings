package Problems;
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOfDigit =0;
        int n;

        while(num>0){
            n=num%10;
            sumOfDigit+=n;
            num=num/10;
        }
        System.out.println("Sum of digits is: " + sumOfDigit);
        sc.close();
    }
}
