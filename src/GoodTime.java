import java.util.Scanner;

public class GoodTime {

    static int number;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while(input.hasNext()) {

            number = input.nextInt();

            if (number < 0 | number > 24) {
                System.out.println("Not acceptable time");
                break;
            }

            else if (number >= 0 & number <= 5) {
                System.out.println("Good night!");
            } else if (number < 10 & number > 6) {
                System.out.println("Good morning!");
            } else if (number < 20 & number >=10) {
                System.out.println("Good day!");
            } else if( number >= 20 & number <= 24){
                System.out.println("Good evening!");
            }
        }
    }

}
