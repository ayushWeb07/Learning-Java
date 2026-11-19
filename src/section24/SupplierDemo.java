package section24;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> getCurrentDate= () -> {
            LocalDate ld= LocalDate.now();
            int y= ld.getYear();
            Month m= ld.getMonth();
            int d= ld.getDayOfMonth();

            return String.format("%dth %s %d%n", d, m.name(), y);
        };

        System.out.println(getCurrentDate.get());
    }

    public static String getCurrentDayNameSupplier() {
        Supplier<String> supplier= () -> LocalDate.now().getDayOfWeek().name();
        return supplier.get();
    }

}
