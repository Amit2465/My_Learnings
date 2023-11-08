package Problems;
import java.util.Scanner;
public class array9 {
    public static int maxProfit(int Prices[]) {
        int n = Prices.length;        
        int max=0;
        boolean noMaxProfit = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int demo = Prices[j]-Prices[i]; 
                if (demo > 0) {
                    if(max<demo)
                    max=demo;
                    noMaxProfit = true;
                }
            }
        }

        if (!noMaxProfit) {
            return 0;
        }            

            return max;        
    }

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int Solution[] = new int[n];
        System.out.println("Enter the numbers in the array: ");
        for (int i = 0; i < n; i++) {
            Solution[i] = sc.nextInt();
        }

        sc.close();
        int maxProfit = maxProfit(Solution);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
