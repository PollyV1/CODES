//Paul Enrico N. Viola ZC21Ar
//CSMC211

import java.io.*;
import java.util.*;

public class MyChat{
	public static void main( String args[]) 
		throws IOException{
        Scanner console = new Scanner( System.in ); //scanner file
		System.out.println( "Input text: " ); // print input text
		String inputText = console.nextLine(); // var for the input
        String outputFileName = "chat.txt";//filename for the file where to print
		PrintWriter out = new PrintWriter(new FileWriter(outputFileName, true)); //printwriter and filewriter variable to create the output file and to write in the file
    	out.println(inputText); // to print in the chat.txt 
        out.close(); //close the printwriter
	}
}
