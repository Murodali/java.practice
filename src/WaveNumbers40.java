public class WaveNumbers40 {
    public static void main(String[] args) {
        for(int l = 1; l < 41; l++){
            System.out.print("-");
        }
        System.out.println();
        for(int l2 = 1; l2 < 11; l2++){
            System.out.print("_-^-");
        }
        System.out.println();
        for(int l3 = 1; l3 <= 2; l3++){
            for(int num = 1; num <= 9; num++){
                System.out.print(num + "" + num);
                if (num == 9){
                    System.out.print(0 + "" + 0);
                }
            }
        }
        System.out.println();
        for(int l = 1; l < 41; l++){
            System.out.print("-");
        }
    }

}
