package section22;

public enum AdvancedTaskStatusEnum {
    PENDING(3, "The task is pending"), WORKING(1, "The task is currently under working"), DONE(0, "The task is done");

    private int daysBeforeCompletion;
    private String message;

    AdvancedTaskStatusEnum(int daysBeforeCompletion, String message) {
        this.daysBeforeCompletion= daysBeforeCompletion;
        this.message= message;
    }

    public int getDaysBeforeCompletion() {
        return this.daysBeforeCompletion;
    }

    public String getMessage() {
        return this.message;
    }
}
