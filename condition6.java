package ConditionalS;

public class condition6 {
    public static void main(String args[]){
        // print the largest of 3 number
        int a=3;
        int b=4;
        int c=6;

        if(a>b && a>c){
            System.out.println("a is greater than b & c");
        }
        else if(b>a && b>c){
            System.out.println("b is greater than a & c");
        }
        else{
            // c >a && c> b
            System.out.println("c id greater than a & b");
        }
    }
    
}
