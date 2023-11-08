package Problems;

import java.util.Scanner;

public class array12 {

    public static int maxValue(int num[]) {
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;             
    }


    static int secondMaxValue(int num[]){
        int sm= maxValue(num);

        for(int i=0; i<num.length; i++) {
            if(num[i] == sm) {
                num[i] =Integer.MIN_VALUE;
            }
        }

        int secondMax= secondMaxValue(num);
        return secondMax;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the value in array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        secondMaxValue(arr);
    }

}
