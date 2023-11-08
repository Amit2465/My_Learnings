package Basic_java;

public class array3 {

    void arrayDemo(){
        int num[]={1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        array3 obj = new array3();
        obj.arrayDemo();
    }
    
}
