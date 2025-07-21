package ConditionalS;

public class condition7 {
    public static void main(String args[]){
        // ternary operator --> with 3 operand
        // synatx
        // variable = condition? statement1:statement2;
        boolean largest=5>3?true:false;
        System.out.println(largest);

        int smallest=3<4?3:4;
        System.out.println(smallest);

        // even or odd
        String number=(4%2==0)?"even":"odd";
        System.out.println(number);
    }
    
}
