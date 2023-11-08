package Basic_java;
import java.util.Scanner;
public class array4 {

    void DemoArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();
        int num[] = new int[n];

        //Taking input from the user in array
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        //Print the array
        System.out.println("Your array is: ");
        for(int j = 0; j < n; j++){
            System.out.print(num[j]+ " ");
        }

        sc.close();

    }

    public static void main(String[] args) {
        array4 obj = new array4();
        obj.DemoArray();
    }
    
}
