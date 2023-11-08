package Problems;

import java.util.Scanner;

public class array16 {
    
    public static void sortArray(int num[]){
        int n = num.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(num[i]==0){
                count++;
            }
        }

        for(int i = 0; i < n; i++){
            if (i<count){
                num[i] =0;
            }else{
                num[i] =1;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n= sc.nextInt(); 
        int arr[]= new int[n];

        System.out.println("Enter only 0s and 1s: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        sortArray(arr);
    }
}
