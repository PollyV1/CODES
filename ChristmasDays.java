//Paul Enrico N. Viola ZC21Ar
//CSMC211

import java.io.*;
import java.io.PrintWriter; 

    public class ChristmasDays{
    public static void main(String[] args)
        throws FileNotFoundException {
        PrintWriter t = new PrintWriter("12days.txt"); //open file
    
        for (int day = 1; day <= 12; day++) {//loop for the days
            String D = "null";

        switch (day) {
            case 1:D = "First";
                break;
            case 2:D = "Second";
                break;
            case 3:D = "Third";
                break;
            case 4:D = "Fourth";
                break;
            case 5:D = "Fifth";
                break;
            case 6:D = "Sixth";
                break;
            case 7:D = "Seventh";
                break;
            case 8:D = "Eight";
                break;
            case 9:D = "Ninth";
                break;
            case 10:D = "Tenth";
                break;
            case 11:D = "Eleventh";
                break;
            case 12:D = "Twelfth";
                break;
        }
        
        t.print("On the " + D);//output the day to the file
        t.println(" day of Christmas my true love gave to me");

        switch (day) {//switch case for the gifts
            case 12:
                t.println("Twelve drummers drumming,");
            case 11:
                t.println("Eleven pipers piping,");
            case 10:
                t.println("Ten lords a leaping,");
            case 9:
                t.println("Nine ladies dancing,");
            case 8:
                t.println("Eight maids a milking,");
            case 7:
                t.println("Seven swans a swimming,");
            case 6:
                t.println("Six geese a laying,");
            case 5:
                t.println("Five golden rings,");
            case 4:
                t.println("Four calling birds,");
            case 3:
                t.println("Three French hens,");
            case 2:
                t.println("Two turtle doves, and");
            default:
                t.println("A partridge in a pear tree.");
        }

        t.println();//print a line
        }
        t.close();//close the file
    }
}

//References w3Schools
//Video lectures
//https://www.baeldung.com/java-write-to-file
//https://www.dreamincode.net/forums/topic/419384-writing-twelve-days-of-christmas-using-a-switch-statement/