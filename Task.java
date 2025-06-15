public class Task {
    private String title;
    private String description;
    private TaskStatus status;
    private int priority;  // від 1 (найвищий) до 5 (найнижчий)

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = TaskStatus.NEW;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("Task: %s | Priority: %d | Status: %s\nDescription: %s",
                title, priority, status, description);
    }
}
