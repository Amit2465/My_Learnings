package Problems;
import java.util.Scanner;
public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
