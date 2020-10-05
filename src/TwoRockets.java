public class TwoRockets {
    public static void main(String[] args) {
        top();
        box();
        text();
        box();
        top();
    }
    public static void top(){
        System.out.println("\n   /\\       /\\\n" +
                           "  /  \\     /  \\\n" +
                           " /    \\   /    \\");
    }
    public static void box(){
        System.out.println("+------+ +------+\n" +
                           "|      | |      |\n" +
                           "|      | |      |\n" +
                           "+------+ +------+");
    }
    public static void text(){
        System.out.println("|  KG  | |  KG  |\n" +
                           "|Soonun| |Soonun| ");
    }

}
