
import java.util.Scanner;


public class Grader {

    static Scanner input = new Scanner(System.in);

    static int number;


    public static void main(String[] args) {


        while (input.hasNext()){
            number = input.nextInt();
            if (number >= 0 && number < 50){
                System.out.println("Failed");
            }
            else if(number >=50 && number <=100){
                System.out.println("Passed");
            }

            else{
                System.out.println("Incorrect grade!");
                break;
            }
        }

    }
}


