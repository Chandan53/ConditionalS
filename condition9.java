package ConditionalS;

public class condition9 {
    public static void main(String args[]){
        // switch synatx
        /* switch(variable){
         * case 1: 
         * case 2:
         * case 3:
         * default:
        } */

        int number=3;
        switch(number){
            case 1 : System.out.println("light onn");
                     break;
            case 2 : System.out.println("light off");
                     break;
            case 3 : System.out.println(" no electricity");
                    break;
            default :
            System.out.println("no electricity in the entir village");
        }
    }
    
}
