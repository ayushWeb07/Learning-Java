package section8;

public class SwitchExpression {
    public static void main(String[] args) {
        int dayNum= 121;

        String dayType= switch (dayNum) {
            case 1, 7 -> {
                System.out.println("Its a weekend baby!");
                yield "Weekend";
            }

            case 2, 3, 4, 5, 6 -> {
                System.out.println("Its a weekday baby, grind hard!");
                yield "Weekday";
            }

            default -> {
                System.out.println("Invalid input baby");
                yield "Invalid input";
            }
        };

        System.out.println(dayType);
    }
}
