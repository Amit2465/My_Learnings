package Problems;
import java.util.Scanner;
public class twopointers3 {

    public static int[] squareAndSortArray(int num[]) {
        int n = num.length;
        int squarearr[] = new int[n];
        int left = 0;
        int right = n - 1;
        int k=0;

        while(left <= right) {
            if(Math.abs(num[left]) > Math.abs(num[right])){
                squarearr[k++] = num[left]*num[left];
                left++;
            }else{
                squarearr[k++] = num[right]*num[right];
                right--;
            }
        }

        return squarearr;
    }
    
    static void reverse(int r[]){
        int l = r.length;
        for (int i = 0; i < l; i++){
            for(int j = i+1; j < l; j++){
                int temp = r[i];
                r[i]=r[j];
                r[j]=temp;
            }
        } 

        for(int i = 0; i < l; i++){
            System.out.print(r[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the numbers into array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();

        int result[]= squareAndSortArray(arr);

        reverse(result);
    }
}
