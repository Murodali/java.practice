public class NumbersSquare {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int i = 1;
        int j;

        while(i<=rows){
            j=1;
            while(j<=cols){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
