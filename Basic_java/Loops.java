package Basic_java;
import java.util.Scanner;
public class Loops {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int start=1;
    while(start<=num){
        System.out.println(start);
        start++;
    }
    sc.close();
    
   }
}
