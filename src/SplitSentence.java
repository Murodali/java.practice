import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            sentence = sentence.replace("\'", "");
            sentence = sentence.replace("/", "");
            sentence = sentence.replace(",", "");
            sentence = sentence.replace("\"", "");
            sentence = sentence.replace(".", "");
            sentence = sentence.replace("’", "");

            String[] wordstring = sentence.split("\\P{Alpha}+");
            for (String words : wordstring) {
                System.out.println(words);
            }

            break;

        }


    }

}


