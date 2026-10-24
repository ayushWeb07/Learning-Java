package section9;

import static com.ayush.ConstantUtilities.*;

public class App {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(PI);

        // create the fighter object
        Fighter f= new Fighter();
        f.setName("Islam");
        f.setWins(28);
        f.setLosses(1);

        System.out.printf("Name: %s%nWins: %d%nLosses: %d%n", f.getName(), f.getWins(), f.getLosses());
    }
}
