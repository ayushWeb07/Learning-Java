package section13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInt {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader bfr= new BufferedReader(isr);

        System.out.println("Enter a number: ");
        String st= bfr.readLine();

        int n= Integer.parseInt(st);

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        bfr.close();
    }
}
