package Problems;
public class array4 {
    
    public static void main(String[] args) {        
        
        int x=2;

        int num[]={1,2,2,3,4,7,2,3,2,3};
        int sum=0;

        for (int i=0; i<num.length; i++) {
            if(num[i]==x){
                sum++;
            }
        }

        System.out.println(sum);
    }  

    
}
