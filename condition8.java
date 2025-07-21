package ConditionalS;
import java.util.*;

public class condition8 {
    public static void main(String args[]){
        // check if a student is pass or fail
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        String result=marks>=33?"Pass":"fail";
        System.out.println(result);
    }
    
}
