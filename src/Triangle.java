import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one;
        int two;
        int three;
        while (true){
            one =input.nextInt();
            two = input.nextInt();
            three = input.nextInt();
            if(one == 90 & two==90 || one==90 && three == 90 || two==90 & three==90){
                System.out.println("It is not a valid triangle");
                break;
            }
            else if((one+two+three) !=180){
                System.out.println("It is not a valid triangle.");
                break;
            }
            else{
                System.out.println("It is a valid triangle.");
                break;
            }

        }
    }
}
