import java.util.ArrayList;

public class todolist {

    // List to hold tasks
    private ArrayList<task> tasks;

    // Method to add a task to the list
    // This method initializes the tasks list if it is null
    // and adds the task to the list
    public void addTask(task task){
        if (tasks == null)
            tasks = new ArrayList<>();
    }

    // Method to remove a task from the list
    // This method checks if the task exists in the list 
    // before removing it
    public void removeTask(task task){
        if (tasks != null){
            tasks.remove(task);
        }
    }

    // Method to mark a task as completed
    // This method checks if the task exists in the list 
    // before marking it as completed
    public void markTaskCompleted(task task) {
        if (tasks != null && tasks.contains(task)) {
            task.markCompleted();
        }
    }

    // Method to view all tasks
    // This method returns the list of tasks if it exists
    public ArrayList<task> viewTasks() {
        if (tasks != null) {
            return tasks;
        } else {
            return new ArrayList<>(); 
            // Return an empty list if no tasks exist
        }
        }
    }


