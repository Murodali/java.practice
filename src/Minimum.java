import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one;
        int two;
        int three;

        while(true){
            one = input.nextInt();
            two = input.nextInt();
            three = input.nextInt();

            if(one < two & one< three){
                System.out.println("The least of these three numbers is "+one);
                break;
            }
            else if(two<one & two < three){
                System.out.println("The least of these three numbers is "+two);
                break;
            }
            else if (three < one & three<two){
                System.out.println("The least of these three numbers is "+three);
                break;
            }
            else if(one==two &three==one){
                System.out.println("They are all equal");
                break;
            }
            else if(one==two){
                if(one<three){
                    System.out.println("The least of these three numbers is "+one);
                    break;
                }
                else {
                    System.out.println("The least of these three numbers is "+three);
                    break;
                }
            }
            else if(one == three){
                if(two >one ){
                    System.out.println("The least of these three numbers is "+one);
                    break;
                }
                else {
                    System.out.println("The least of these three numbers is "+ two);
                    break;
                }
            }
            else if(two==three){
                if(two>one){
                    System.out.println("The least of these three numbers is "+one);
                    break;
                }
                else {
                    System.out.println("The least of these three numbers is "+two);
                    break;
                }
            }

        }
    }
}


