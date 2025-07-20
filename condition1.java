package ConditionalS;
import java.util.*;

public class condition1 {
    public static void main(String args[]){
        // Conditional Statements
        // if else
        // else if
        // ternary operator
        // switch
        Scanner sc=new Scanner (System .in);

        int age= sc.nextInt();
        if( age <18){
            System.out.println(" you cant drive a car");
        }
        else {
            // age > 18
            System.out.println(" you can drive a car");
        }
    }
    
}
