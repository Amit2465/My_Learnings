package Problems;

public class loop13 {
    public static void main(String[] args) {
        int r=4;
        int c=6;

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if((i+j)%2==0){
                    System.out.print("2");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }    
}
