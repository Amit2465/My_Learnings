package Basic_java;
import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age<12){
            System.out.println("Child");
        }else if(age>=12 && age <=18){
            System.out.println("Teenager");
        }else{
            System.out.println("Adult");
        }

        sc.close();
    }
}
