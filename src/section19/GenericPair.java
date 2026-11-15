package section19;

public class GenericPair<T, U> {
    private T first;
    private U second;

    public GenericPair(T first, U second) {
        this.first= first;
        this.second= second;
    }

    public void setFirst(T first) {
        this.first= first;
    }

    public void setSecond(U second) {
        this.second= second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }
}

class GenericPairMain {
    public static void main(String[] args) {
        GenericPair<String, Integer> p= new GenericPair<>("Virat", 18);
        System.out.printf("%s | %d%n", p.getFirst(), p.getSecond());

        p.setFirst("Jordan");
        p.setSecond(23);
        System.out.printf("%s | %d%n", p.getFirst(), p.getSecond());
    }
}