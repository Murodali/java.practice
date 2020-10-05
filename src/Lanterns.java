public class Lanterns {
    public static void main(String[] args) {
        triangle();
        blank();
        triangle();
        row();
        fullLine();
        triangle();
        blank();
        miniLine();
        row();
        row();
        miniLine();
        miniLine();

    }

    public static void triangle(){
        System.out.println("    *****\n" +
                           "  *********\n" +
                           "*************");
    }

    public static void blank(){
        System.out.println("");

    }
    public static void row(){
        System.out.println("* | | | | | *");
    }
    public static void fullLine(){
        System.out.println("*************");
    }
    public static void miniLine(){
        System.out.println("    *****");
    }
}
