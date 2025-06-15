public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Finish report", "Complete the annual report by Friday", 1);
        Task task2 = new Task("Clean desk", "Organize all papers on the desk", 3);
        Task task3 = new Task("Email client", "Send update email to client", 2);

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("\nAll tasks:");
        manager.printTasks(manager.getAllTasks());

        // Змінюємо статус деяких задач
        task1.setStatus(TaskStatus.IN_PROGRESS);
        task3.setStatus(TaskStatus.DONE);

        System.out.println("\nTasks IN_PROGRESS:");
        manager.printTasks(manager.getTasksByStatus(TaskStatus.IN_PROGRESS));

        System.out.println("\nTasks DONE:");
        manager.printTasks(manager.getTasksByStatus(TaskStatus.DONE));
    }
}
