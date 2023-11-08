package Problems;
import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numberOfDigit= 0;


        while(num>0){
            num=num/10;
            numberOfDigit++;

        }
        System.out.println("Number of digits is: " + numberOfDigit);
        sc.close();
        
    }
    
}
