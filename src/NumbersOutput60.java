public class NumbersOutput60 {
    public static void main(String[] args) {
        for(int c = 1; c < 7; c++) {
            for (int l = 1; l <= 9; l++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int c = 1; c < 7; c++) {
            for (int num = 1; num < 10; num++) {
                System.out.print(num);
                if (num == 9){
                    System.out.print(0);
                }
            }
        }
    }
}
