import java.util.Scanner;
public class SumFibonachi {
    public static void main(String[] args) {
        System.out.println(new SumFibonachi().run());
    }
    public String run() {
        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        int sum = 0;
        for (int i = 0; ; i++) {
            int fib = fibonacci(i);
            if (fib > number)
                break;
            if (fib % 2 == 0)
                sum += fib;
        }
        return Integer.toString(sum);
    }

    private static int fibonacci(int n) {
        if (n < 0 || n > 46)
            throw new IllegalArgumentException();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
