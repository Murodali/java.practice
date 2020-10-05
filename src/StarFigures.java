public class StarFigures {
    public static void main(String[] args) {
        row();
        x();
        System.out.println("");
        row();
        x();
        row();
        System.out.println("");
        column();
        row();
        x();
    }

    public static void row(){
        System.out.println("*****\n" +
                           "*****");
 ;
    }

    public static void x(){
        System.out.println(" * *\n" +
                           "  *\n" +
                           " * *");
    }

    public static void column(){
        System.out.println("  *\n" +
                           "  *\n" +
                           "  *");
    }
}
/*

 *****
 *****
 * *
 *
 * *

 *****
 *****
 * *
 *
 * *
 *****
 *****

 *
 *
 *
 *****
 *****
 * *
 *
 * *
 */