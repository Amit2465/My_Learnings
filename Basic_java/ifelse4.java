package Basic_java;

import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Number is even and Dvisible by 3");
            sc.close();
        }
    }
}
