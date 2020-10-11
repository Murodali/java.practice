import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        while(input.hasNext()){
            number = input.nextInt();
            if(number >=18 & number<=150){
                System.out.println("Old enough!");
            }else if(number <18 & number > 0){
                System.out.println("Too young!");
            }else {
                System.out.println("Incorrect age");}
            break;
            }
        }
    }

