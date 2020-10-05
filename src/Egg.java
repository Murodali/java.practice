public class Egg {
    public static void main(String[] args) {
        top();
        middle();
        center();
        bottom();
    }
    public static void top(){
        System.out.println("  _______");
    }
    public static void middle(){
        System.out.println(" /       \\\n" +
                           "/         \\");
    }

    public static void center(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void bottom(){
        System.out.println("\\         /\n" +
                           " \\_______/");
    }
}
