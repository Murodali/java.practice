public class SpacedNumbers {
    public static void main(String[] args) {
        int row = 5;
        int i =0;
        int j;

        while (i<row){
            j=5;
            while(j>=i+1){
                System.out.print(" ");

                j--;
            }
            i++;
            System.out.print(i);
            System.out.println();
        }

    }
}
