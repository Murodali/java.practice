import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        String n;
        int n1,n2,sum;
        Scanner in = new Scanner(System.in);
            n = in.next();
            if(n.matches("\\d+")){
                int f = Integer.parseInt(n);
                n1 = f*10+f;
                n2 = f*100+n1;

                sum = f+n1+n2;
                System.out.println(n +" + "+n1+" + " +n2+" = "+sum);

            }
            else{
                System.out.println("error");
            }

    }
}


