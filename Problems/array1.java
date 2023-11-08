package Problems;
public class array1 {

    public static void main(String[] args) {
        
        
        int num[]={1,2,3,4,5,6,7,8,9};
        int sum=0;
        

        for (int i = 0; i <num.length; i++) {
            sum+=num[i];                                    
        }

        System.out.println("Sum of array is: "+sum);

    }
}
