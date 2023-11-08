package Problems;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if (ch == 'a' && ch <= 'z') {
            System.out.println("1");
        } else if (ch == 'A' && ch <= 'Z') {
            System.out.println("-1");
        }else if (ch!='a' && ch != 'z' && ch != 'A' && ch != 'Z') {
            System.out.println("0");
        }

        sc.close();
    }
}
