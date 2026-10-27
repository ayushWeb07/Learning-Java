package section14;

class Divide {
    public static double divide(String n1, String n2) throws NumberFormatException, ArithmeticException {
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);

        return (double) (num1 / num2);
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            System.out.println(Divide.divide("5", "0"));;
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers");
        } catch (ArithmeticException e) {
            System.out.println("Please don't enter 0");
        } catch (Exception e) {
            System.out.println("Something went wrong, try again!");
        }
    }
}
