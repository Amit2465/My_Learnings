package Problems;

public class array13 {

    static int firstRepeating(int num[]){
        boolean notRepeating = false;
        int firstRepeat= -1;
        
        outerloop:
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    firstRepeat=num[i];
                    notRepeating=true;
                    break outerloop;
                }
            }
        }

        if(!notRepeating){
            return -1;
        }

        return firstRepeat;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,7,7};
        int result=firstRepeating(arr); 
        System.out.println(result);
    }
}
