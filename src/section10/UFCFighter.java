package section10;

public class UFCFighter extends Fighter {
    private String division;

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division= division;
    }

    public void printDetails() {
        System.out.printf("%nName: %s%nDivision: %s%nWins: %d%nLosses: %d%n", this.getName(), this.getDivision(), this.getWins(), this.getLosses());
    }
}
