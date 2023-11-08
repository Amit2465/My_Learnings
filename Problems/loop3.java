package Problems;
import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        
        int sum=0;
        
        while(num>0){
            sum=sum * 10 + num  % 10;
            num/=10;
        }        
        System.out.println("Reversed of a number is:" + sum);
        sc.close();
    }
}
