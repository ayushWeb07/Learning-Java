package section22;

public class EnumDemo {
    public static void main(String[] args) {

        TaskStatusEnum taskStatusEnum= TaskStatusEnum.WORKING;

        // switch case
        switch (taskStatusEnum) {
            case TaskStatusEnum.DONE -> {
                System.out.println("Task is done...");
            }

            case TaskStatusEnum.PENDING -> {
                System.out.println("Task is still pending...");
            }

            case TaskStatusEnum.WORKING -> {
                System.out.println("Task is currently under working...");
            }
        }

        System.out.println();

        // print the values
        for (TaskStatusEnum t: TaskStatusEnum.values()) {
            String name= t.name();
            int ord= t.ordinal();

            System.out.printf("%s -> %d%n", name, ord);
        }

        // print the values of advanced task status enum
        System.out.println();

        for (AdvancedTaskStatusEnum advancedTaskStatusEnum: AdvancedTaskStatusEnum.values()) {
            String name= advancedTaskStatusEnum.name();
            int ord= advancedTaskStatusEnum.ordinal();
            int daysBeforeCompletion= advancedTaskStatusEnum.getDaysBeforeCompletion();
            String message= advancedTaskStatusEnum.getMessage();

            System.out.printf("%s | %d | %d | %s%n", name, ord, daysBeforeCompletion, message);
        }
    }
}
