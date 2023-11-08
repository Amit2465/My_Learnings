package Problems;

public class array3 {
    public static void main(String[] args) {
        int arr[]= {1,7,3};
        int n=7;

        for(int i=0; i<args.length; i++) {
            if(arr[i]==n){
                System.out.println(arr[i]);
            }else{
                System.out.println(-1);
            }
        }
    }
}
