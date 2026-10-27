package section14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderException {
    public static void main(String[] args) {
        try(BufferedReader bfr= new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your dream bike: ");
            String st= bfr.readLine();
            System.out.println("Dream bike: " + st);
        } catch (IOException ex) {
            System.out.println("Error: something went wrong while talking the input");
            ex.printStackTrace();
        }
    }
}
