//Paul Enrico N. Viola ZC21Ar
//CSMC211

import java.io.*;
import java.util.*;

public class MyPoem{
	public static void main( String args[]) 
		throws IOException{
		String inputFileName = "poem.txt";//file to read from
		String outputFileName = "reversePoem.txt";//file where to print
		FileWriter output = new FileWriter(outputFileName);//Create the output file
		FileReader reader = new FileReader( inputFileName );// read the input file
		Scanner in = new Scanner( reader ); //scan the file
		PrintWriter out = new PrintWriter( log ); //printwriter variable
        Stack<String> line = new Stack<String>(); // creating a stack for the output
		while( in.hasNextLine() ) { // while there is input from the intput file, it will continue
	    	line.push(in.nextLine()); // to push elemnts in the stack
		}		
		in.close();// close the stack
		while(!line.isEmpty()) {//while line stack is not empty it will print the stack
            out.println(line.pop()); //line pop so that it will be reveresed in order
        }
		out.close(); //close the printwriter
		output.close();	// close the file writer
	}
}
