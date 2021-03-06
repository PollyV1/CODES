import java.io.*;
import java.util.*;

public class LineNumberer
{
	public static void main( String args[]) 
		throws FileNotFoundException
	{
		Scanner console = new Scanner( System.in );
		System.out.println( "Input file: " );
		String inputFileName = console.next();
		System.out.println( "Output file: " );
		String outputFileName = console.next();
		FileReader reader = new FileReader( inputFileName );
		Scanner in = new Scanner( reader );
		PrintWriter out = new PrintWriter( outputFileName );
		int lineNumber = 1;
		while( in.hasNextLine() ) {
	    	String line = in.nextLine();
		   out.println( "/* " + lineNumber + " */ " + line );
		   lineNumber++;
		}		
		in.close();
		out.close();	
	}
}
