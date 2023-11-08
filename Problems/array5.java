package Problems;
import java.util.Scanner;

public class array5 {
    static void lastOccurrenceOfArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter the numbers in the array: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find the last occurrence: ");
        int x = sc.nextInt();
        sc.close();

        int lastIndex = -1;

        for (int j = num.length - 1; j >= 0; j--) {
            if (num[j] == x) {
                lastIndex = j;
                break;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + x + " is at index: " + lastIndex);
        } else {
            System.out.println("The number " + x + " is not found in the array.");
        }
    }

    public static void main(String[] args) {
        lastOccurrenceOfArray();
    }
}
