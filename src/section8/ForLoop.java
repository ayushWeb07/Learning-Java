package section8;

public class ForLoop {
    public static void main(String[] args) {
        outerLoop:
        for(int i=1; i<=5; i++) {

            innerLoop:
            for(int j=1; j<=5; j++) {
                if ((i == 3) && (j == 4)) {
                    break outerLoop;
                }

                System.out.printf("i: %d | j: %d %n", i, j);
            }
        }
    }
}
