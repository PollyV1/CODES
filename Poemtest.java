import java.io.*;
import java.util.*;

public class LineNumberer{
	public static void main( String args[]) 
		throws IOException{
		String inputFileName = "poem.txt";
		String outputFileName = "reversePoem.txt";
		FileWriter output = new FileWriter(outputFileName);
		FileReader reader = new FileReader( inputFileName );
		Scanner in = new Scanner( reader );
		PrintWriter out = new PrintWriter( outputFileName );
        Stack<String> line = new Stack<String>();
		while( in.hasNextLine() ) {
	    	line.push(in.nextLine());
		}		
		in.close();
		while(!line.isEmpty()) {
            out.println(line.pop());
        }
		out.close();
		output.close();	
	}
}
