import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (input.hasNext()) {
            String num = input.next();



            if (num.length() == 5) {

                for (int i = 0; i < num.length(); i++) {
                    System.out.println(num.charAt(i));
                }
            } else if (num.length() > 5) {
                System.out.println("Number is too long!");
                break;
            } else {
                System.out.println("Number is too short");
                break;
            }
        }
    }

}
