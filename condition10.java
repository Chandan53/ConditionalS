package ConditionalS;
import java.util.*;

public class condition10 {
    public static void main(String args[]){
        // calculator
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;

            case '/':
            System.out.println(a/b);
            break;

            case '%':
            System.out.println(a%b);
            break;

            case '*':
            System.out.println(a*b);
            break;

            default:
            System.out.println(" no operator");

        }

    }
    
}
