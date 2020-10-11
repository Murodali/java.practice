public class NumbersTriangle {
    public static void main(String[] args) {
        int row =7;
        int i =1;
        int j;
        while(i<=row){
            j=1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
