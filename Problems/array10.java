package Problems;

public class array10 {

    public int sumOfTripplets(int num[], int target){
        int n = num.length;
        int count = 0;

        if(num.length <3){
            System.out.println("Array length should be more than 3:");
        }
        
        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++){
                for (int k = j+1; k < n; k++){
                    if (num[i]+num[j]+num[k]==target){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        array10 obj = new array10();
        int x=12;
        int input[]={1,4,5,6,3};
        int result =obj.sumOfTripplets(input, x);
        System.out.println(result); 
    }
    
}
