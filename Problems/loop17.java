package Problems;

import java.util.Scanner;

public class loop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n number ->");
        int n = sc.nextInt();
        if (n > 1) {
            System.out.println(0);
            System.out.println(1);
        }
        for (int i = 100; i <= n; i++) {
            int temp = i;
            int digit = 0;
            long sum = 0;
            while (temp != 0) {
                digit = temp % 10;
                sum += (digit * digit * digit);
                temp /= 10;
            }

            if (i == sum)
                System.out.println(i);
        }
        sc.close();

    }
}
