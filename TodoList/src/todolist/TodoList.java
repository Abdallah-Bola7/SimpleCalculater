/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

/**
 *
 * @author AhmeD1907
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private static void removeTask() {
        viewTasks();
        System.out.print("Enter the task number to remove: ");
        int taskNumber = scanner.nextInt() - 1;

        if (taskNumber >= 0 && taskNumber < tasks.size()) {
            tasks.remove(taskNumber);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}


