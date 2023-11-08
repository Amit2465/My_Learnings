package Problems;
import java.util.Scanner;
public class array15 {

    public static void rotateArray(int num[], int k){

        int core = k%num.length;

        for(int i=0; i<core; i++){
            for(int j=i+1; j<num.length; j++){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;                 
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotation: ");
        int n = sc.nextInt();

        int arr[]= {1,2,3,4};
        sc.close();

        rotateArray(arr, n);
    }    
}
