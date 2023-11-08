package Problems;

public class array2 {

    public static void main(String[] args) {
        
        int num[] = {12,11,34,23,22};
        int max=num[0];

        for(int i=1; i<num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
        }

        System.out.println("Max value in array is: "+max);
    }
    
}
