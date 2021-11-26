import java.io.IOException;

public class grocerymain {
    public static void main(String[] args) 
    throws IOException {
        System.out.println("Enter 0 0 to quite and compute total.");
        System.out.println("_____________________________________");
        grocerycls grocery = new grocerycls();
        grocery.setCodeQty();
    }
}
