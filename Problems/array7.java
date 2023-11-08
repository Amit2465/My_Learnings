package Problems;
import java.util.Arrays;
import java.util.Scanner;
public class array7 {

    static void minAndMaxArray(int num[]) {

        int n=num.length;
        Arrays.sort(num);

        System.out.println(num[0] +" , " + num[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int num[]=new int[n];

        System.out.println("Enter the numbers in the array");
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        sc.close();

        minAndMaxArray(num);
    }
}
