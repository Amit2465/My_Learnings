package Problems;
import java.util.Scanner;

public class loop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        long sum = 0;
        boolean flag = false;
        System.out.println("Enter numbers (positive, negative, or zero). Enter a negative number to stop:");
        
        int count = 0; // Number of positive numbers entered
        int maxCount = 5; // Change this to the desired number of inputs
        
        while (count < maxCount) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0) {
                    flag = true;
                    break;
                }
                
                sum += num;
                count++; // Increment the count of positive numbers
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the invalid input
            }
        }
        
        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println("Sum of the first " + maxCount + " positive numbers: " + sum);
        }
        
        sc.close();
    }
}
