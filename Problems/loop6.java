package Problems;
import java.util.Scanner;

class loop6{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the power of the number: ");
        int power = sc.nextInt();
        int sum=1;

        for(int i = 0; i <power; i++) {
            sum*=num;
        }
        System.out.println("Your answer is:" + sum);
        sc.close();

    }
} 