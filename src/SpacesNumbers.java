public class SpacesNumbers {
    public static void main(String[] args) {
        for(int l = 1; l <= 5; l++){
            for(int num = 1; num <= (-1 * l + 5); num++){
                System.out.print(" ");
            }
            for (int end = 1; end <= l; end++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
