package Problems;

import java.util.Scanner;

public class array6 {

    static boolean sortedArray(int num[]) {
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            if (num[i] > num[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n= sc.nextInt();
        int num[]=new int[n];

        System.out.print("Enter the value in array:"+ " ");
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        sc.close();

        boolean sorted= sortedArray(num);

        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

}
