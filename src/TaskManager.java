import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Agregar tarea\n2. Ver tareas\n3. Marcar como completada\n4. Eliminar tarea\n5. Salir");
            System.out.print("Opción: ");
            int option = readIntOption();

            switch (option) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> completeTask();
                case 4 -> removeTask();
                case 5 -> {
                    System.out.println("¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }


    private int readIntOption() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Ingresa un número.");
            System.out.print("Opción: ");
            scanner.next(); // descartar entrada inválida
        }
        int option = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        return option;
    }

    private void addTask() {
        System.out.print("Descripción de la tarea: ");
        String desc = scanner.nextLine().trim();
        if (desc.isEmpty()) {
            System.out.println("La descripción no puede estar vacía.");
            return;
        }
        tasks.add(new Task(desc));
    }

    private void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    private void completeTask() {
        viewTasks();
        System.out.print("Índice de tarea a completar: ");
        int index = readIntOption();
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void removeTask() {
        viewTasks();
        System.out.print("Índice de tarea a eliminar: ");
        int index = readIntOption();
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}