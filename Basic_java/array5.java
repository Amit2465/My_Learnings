package Basic_java;
import java.util.Scanner;
class array5{

    static void displayArray(int num[]){

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array: ");
        int length = sc.nextInt();
        int num2[]= new int[length];

        System.out.println("Enter the number inside the Array: ");
        for (int i = 0; i < length; i++) {
            num2[i] = sc.nextInt();
        }

        displayArray(num2);
        sc.close();

        //copy the array

        int num3[]=num2;
        System.out.println("This is copy array: "+ num3);
    }
}