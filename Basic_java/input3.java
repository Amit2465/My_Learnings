package Basic_java;
import java.util.Scanner;
public class input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charater: ");
        char ch = sc.next().charAt(0);
                
        System.out.println(ch);

        
        sc.close();  

    }
}
