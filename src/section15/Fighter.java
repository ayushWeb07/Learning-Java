package section15;

public record Fighter(String name, int wins, int losses) {
    public Fighter {
        if (name == null) {
            throw new IllegalArgumentException("Name must be a valid string");
        }

        if ((wins < 0) || (wins > 100)) {
            throw new IllegalArgumentException("Wins must be in range [0 - 100]");
        }

        if ((losses < 0) || (losses > 100)) {
            throw new IllegalArgumentException("Losses must be in range [0 - 100]");
        }
    }
}
