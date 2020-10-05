import java.util.Scanner;

public class OddorEven {

    static int number;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        while(input.hasNextInt()){
            number = input.nextInt();

        if(number  == 0){
                System.out.println("0 is not odd nor even");
                break;
            }
            else if (number % 2 == 1 | number % 2 == -1){
                System.out.println("This number is odd");
            }
            else if(number % 2 == 0){
                System.out.println("This number is odd");
            }


        }
    }

}
