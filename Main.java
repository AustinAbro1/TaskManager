package com.mycompany.taskmanager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean running = true;
        
        System.out.println("Welcome to Task Manager!");
        
        while (running){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // to consume the newline left by nextInt()
            
            switch(choice){
                case 1 -> {
                    System.out.println("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.println("Is The Task Important? (Y/N): ");
                    String response = scanner.nextLine();
                    
                    boolean important = manager.isTaskImportant(response);
                    
                    if (important) {
                        System.out.println("Enter Priority Level: ");
                        int priority = scanner.nextInt();
                        scanner.nextLine();  // consume newline
                        ImportantTask importantTask = new ImportantTask(name, priority);
                        manager.addTask(name); // Adding to TaskManager
                        System.out.println("Important task added!");
                    } else {
                        manager.addTask(name); // Regular task
                        System.out.println("Task added!");
                    }
                }
                case 2 -> manager.viewTasks();
                case 3 -> {
                    System.out.println("Enter task number to mark as done: ");
                    int num = scanner.nextInt();
                    manager.markDone(num - 1);  // Task numbers are 1-based
                }
                case 4 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        
        scanner.close(); // Close scanner at the end
    }
}
