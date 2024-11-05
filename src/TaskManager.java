import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List <Task> tasks = new ArrayList<>();

    public void printTasks (){
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }
        for (Task task: tasks) {
            System.out.println("Task created at " + task.getCreatedTime());
            System.out.println("Task Description: " + task.getDescription());
            System.out.println("Task status: " + ((task.getIsCompleted()) ? "Completed" : "In progress"));
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

}
