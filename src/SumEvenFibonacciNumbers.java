import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int a;
        int b = 0;
        int c = 1;
        int sum = 0;
        int[] array = new int[14];

        n = in.nextInt();

        while(n>=b) { // Finds fibonacci sequence
            a = b;
            b = c;
            c = a + b;

            if (c % 2 == 0)  // Check if it's even
                sum += c;



        }
        System.out.println(sum);

    }

}
