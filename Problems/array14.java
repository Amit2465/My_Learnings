package Problems;

public class array14 {
    
    public static void reverseArray(int num[]){

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                int temp;
                temp = num[i];
                num[i] = num[j];
                num[j] = temp; 
            }
        }

       for(int i=0; i<num.length; i++){
        System.out.print(num[i] + " ");
       }
    } 

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,};
        reverseArray(num);
        
    }
}
