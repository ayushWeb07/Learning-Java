package section13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderString {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader bfr= new BufferedReader(isr);

        System.out.println("Enter anything: ");
        String st= bfr.readLine();

        System.out.println("You entered: " + st);

        bfr.close();
    }
}
