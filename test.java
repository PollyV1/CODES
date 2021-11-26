import java.io.*;
import java.io.PrintWriter;
import java.util.Stack;

public class test {
    public static void main(String [] args) {

        /**
         *  The name of the file and the location of the file.                  
         */
        String fileName = "poem.txt";
        String outputFile = "reversePoem.txt";
        /**
         * This will enter one line at a time
         * FileReader reads text files
         */
            String line = null;
            Stack<String> myStack = new Stack<>();

            try {
                FileReader fileReader = new FileReader(fileName);

                // Always wrap FileReader in BufferedReader.
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                

                while((line = bufferedReader.readLine()) != null) {
                    FileWriter output = new FileWriter(outputFile);
                    BufferedWriter outputWriter = new BufferedWriter(output);
                    outputWriter.write(line);
                    outputWriter.write(myStack.push(line));
                    outputWriter.flush();
                    outputWriter.close();
                }   
            

            /**
             * Closing the file.
             */
                while(!myStack.isEmpty()){
                    System.out.println(myStack.pop());
                }
                bufferedReader.close(); 
            
            }
            /**
             *Telling the program what message to show if the file is not found
             */

            catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
            }
            catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");  
            }
            catch(Exception e) {
                e.getStackTrace();
            }                 
    }
}