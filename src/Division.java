import java.util.Scanner;
public class Division {

    static Scanner input = new Scanner(System.in);
    static int dividend;
    static int divisor;
    static int quotient;

    public static void main(String[] args) {
        while(true){
            System.out.println("Enter dividend:");
            dividend = input.nextInt();
            System.out.println("Enter the divisor:");
            divisor = input.nextInt();

            if(divisor == 0 ){
                System.out.println("Incorrect input!");
                break;
            }
            else{
                quotient= dividend/divisor;
                System.out.println("Quotient is: "+ quotient);

            }
        }
    }


}
