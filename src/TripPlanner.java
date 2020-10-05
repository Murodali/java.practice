import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TripPlanner {

    static Scanner input = new Scanner(System.in);
    //static String name;
    //static String location;
    static int days;
    static int moneyUsd;
    static String currencyDest;
    static float curencyRate;
    static int daysTohrs;
    static int daysToMns;
    static int daysToSecs;
    static float moneyUsdPerday;
    static float currencyConversion;
    static float currencyPerDay;

    static int time;
    static int midnighttime;
    static int noontime;


    static int kmsqr;
    static float milessqr;



    public static void main(String[] args) {

        //greeting();
        //timeTravelBudget();
        //timeDifference();
        countryArea();

    }
/*
    public static void greeting(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name:");
        TripPlanner.name = input.nextLine();
        System.out.println("Nice to meet you "+ name +", where are you traveling to? ");
        TripPlanner.location = input.nextLine();
        System.out.println("Great! "+ location + " sounds like a great trip");
        System.out.println("***********");
    }

    public static void timeTravelBudget(){
        System.out.println("How many days are you going to spend traveling?");
        TripPlanner.days = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip:");
        TripPlanner.moneyUsd = input.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        TripPlanner.currencyDest = input.next();

        System.out.println("How many "+ currencyDest+" are there in 1 USD?");

        TripPlanner.curencyRate= input.nextFloat();
        System.out.println();

        
        daysTohrs = days*24;
        daysToMns = daysTohrs*60;
        daysToSecs = daysToMns*60;

        moneyUsdPerday= (float)moneyUsd/days;
        currencyConversion= (float)moneyUsd * curencyRate;
        currencyPerDay = currencyConversion/days;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);


        System.out.println("If you are traveling for "+days+" days that is same as "+daysTohrs+ " hours or " + daysToMns+ " minutes or " + daysToSecs+ " seconds.");
        System.out.println("If you are going to spend $"+moneyUsd+" USD that means per day you can spend up to $"+df.format(moneyUsdPerday)+" USD");
        System.out.println("Your total budget in "+ currencyDest+" is "+ currencyConversion+" "+ currencyDest+", which per day is "+df.format(currencyPerDay)+" "+ currencyDest);
        System.out.println("***********");





    }

    public static void timeDifference(){
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        TripPlanner.time = input.nextInt();

        midnighttime = 0;
        noontime =0;
        if(time<=12 && time >=0){
            midnighttime = time;
            noontime = 12+time;

        }
        else if(time < 0 && time >-13){
            midnighttime = 24+ time;
            noontime = 12 + time;
        }


        System.out.println("That means that when it is midnight at home it will be "+ midnighttime+ ":00 in your travel destination and when it's noon at home it will be "+noontime+":00");
        System.out.println("***********");
    }
*/
    public static void countryArea(){

        System.out.println("What is square area of your destination country in km2?");
        TripPlanner.kmsqr = input.nextInt();
        milessqr = kmsqr*0.38610215854245F;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("In miles2 that is "+ df.format(milessqr));
        System.out.println("***********");


    }

}
