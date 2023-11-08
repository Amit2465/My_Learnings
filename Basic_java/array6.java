package Basic_java;
import java.util.Arrays;

public class array6 {
    public static void main(String[] args) {
        
        int num[]={1, 2, 3};
        int num3[]= num.clone();// copy num array to num3
        int num4[]= Arrays.copyOf(num,1);// it just copy only the length you give
        num3[0]=0;
        num4[0]=0;
        //int num2[]=num;
        //num2[0]=0;

        System.out.println(num[0]+ " " +num[1]+ " "+ num[2]);
        for(int i=0; i<num3.length; i++){
            System.out.print(num4[i]+ " " );
        }


    }
    
}
