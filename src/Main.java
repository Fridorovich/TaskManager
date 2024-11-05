import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.println("Добро пожаловать в менеджер задач!");
        System.out.println("Список команд: \n1. Print (вывод списка задач) \n2. Add (Добавить задачу)\n3. Status (Поменять статус задачи)\nExit (Завершить программу)");
        while (true) {
            String command = sc.nextLine().trim();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Добавьте описание задаччи: ");
                    String description = sc.nextLine();
                    taskManager.addTask(new Task(description));
                    break;
                case "print":
                    System.out.println("Существующие задачи: ");
                    taskManager.printTasks();
                    break;
                case "status":
                    System.out.println("Введите номер задачи: ");
                    taskManager.changeStatus(sc.nextInt());
                    break;
                case "exit":
                    System.out.println("Завершение программы...");
                    return;
                default:
                    System.out.println("Неправильная команда, попробуйте еще раз...");
                    break;
            }
        }
    }
}