package Problems;
import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n;
        int sum=0;

        while(num>0){
            n=num%10;
            if(n%2==0){
                sum+=n;
            }else{
                sum-=n;
            }
            num/=10;
        }
        System.out.println("Your Answer of the sequence is: " + sum);
        sc.close();
    }
}
