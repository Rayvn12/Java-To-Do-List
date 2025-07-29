public class task {

    // Task description
    public String description;

    // Boolean indicating if the task is completed
    public boolean isCompleted;

    // Constructor to initialize task with a description
    public task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    // Marked the task as completed method
    public void markCompleted() {
        this.isCompleted = true;
    }
}