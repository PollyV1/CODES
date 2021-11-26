import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class grocerycls {
    String[] pCode;
    String[] pPrice;
    private String code;
    private float qty;
    private float price;
    String outputFileName = "pricelist.txt";
    int n;
    
    public void setCodeQty() 
    throws IOException {
    File file1 = new File(outputFileName);
    if(file1.exists()){
        FileReader reader = new FileReader(outputFileName);
        Scanner in = new Scanner(reader);
        abstract class call{
            public abstract void setCodeQty();
        }
    }
        Scanner console = new Scanner( System.in ); //scanner file
		System.out.println( "Enter Product Code and Quantity " ); // print input text
		code = console.nextLine(); // user input code
        qty = console.nextFloat();   //user input qty 
        Scanner s2 = new Scanner(System.in);

        pCode
        pCode = new String[code];
        for(int i = 0; i < p; i++  ){
            pPrice[i] = console.nextInt();
        }
        PrintWriter out = new PrintWriter(new FileWriter(outputFileName, true));
        out.println(code); // to print in the pricelist.txt 
        out.println(qty); // to print in the pricelist.txt 
        out.close(); //close the printwriter
    }
}
