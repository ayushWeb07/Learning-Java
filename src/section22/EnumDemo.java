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
    }
}
