import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Added new task: " + task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    public void printTasks(List<Task> taskList) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            taskList.forEach(t -> System.out.println(t + "\n"));
        }
    }
}
