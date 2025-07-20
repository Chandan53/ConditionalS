package ConditionalS;
import java.util.*;


public class condition4 {
    public static void main(String args[]){
        // else if 
        // in if condition all the condition we check if  it is true or false
        // where as in eles if if the above condition is true then we skip the other condition
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age >=18){
            System.out.println("adult");
        }
        else if(age<=10){
            System.out.println("children👼");
        }
        else{
            System.out.println("growing age 11 to 17");
        }

    }
    
}
