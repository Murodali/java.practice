
import java.util.Arrays;
import java.util.Scanner;

public class HelloorBye {

    static char letter;
    static char[] str = {'H', 'e', 'l', 'l', 'o','W','o','r','l','d','!'};
    static Scanner input = new Scanner(System.in);
    static int count = 0;
    static int array[] = new int[str.length];


    public static void main(String[] args) {
            letter = input.next(".").charAt(0);


            for(int i = 0; i<str.length; i++){

                if(letter == Character.toUpperCase(str[i]) | letter == str[i] | letter == Character.toLowerCase(str[i]) ){

                    count += 1;
                   array[i] = count;

                }
                else{
                    count = 0;
                    array[i] = count;
                }
            }
            if(Arrays.stream(array).sum() >=1 ){
                System.out.println("Hello");
        }
            else{
                System.out.println("Bye");
            }

        }
}
