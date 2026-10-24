package section9;

public class Fighter {
    private int wins;
    private int losses;
    private String name;

    Fighter() {
        this.wins= 0;
        this.losses= 0;
        this.name= "";
    }

    public void setWins(int wins) {
        this.wins= wins;
    }

    public void setLosses(int losses) {
        this.losses= losses;
    }

    public void setName(String name) {
        this.name= name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public String getName() {
        return this.name;
    }
}
