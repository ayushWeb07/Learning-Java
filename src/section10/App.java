package section10;

public class App {
    public static void main(String[] args) {
        UFCFighter uf= new UFCFighter();

        uf.setName("Conor");
        uf.setLosses(6);
        uf.setWins(22);
        uf.setDivision("Lightweight");

        uf.printDetails();

        // overloading demo
        Maths m= new Maths(12, 5);
        m.show("hey", "world");
        m.show("hey", "world", "!");
        m.show(10, "hey");
        m.show("hi", 15);
    }
}
