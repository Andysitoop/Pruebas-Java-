import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        boolean continuar = true;

        System.out.println("Bienvenido a la Lista de Tareas");

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarTarea(tareas, scanner);
                    break;
                case 2:
                    eliminarTarea(tareas, scanner);
                    break;
                case 3:
                    mostrarTareas(tareas);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo de la lista de tareas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
            }
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Mostrar todas las tareas");
        System.out.println("4. Salir");
        System.out.print("Elige una opción (1-4): ");
    }

    public static void agregarTarea(ArrayList<String> tareas, Scanner scanner) {
        System.out.print("Introduce la nueva tarea: ");
        String tarea = scanner.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea agregada.");
    }

    public static void eliminarTarea(ArrayList<String> tareas, Scanner scanner) {
        System.out.print("Introduce el número de la tarea a eliminar: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

    public static void mostrarTareas(ArrayList<String> tareas) {
        System.out.println("\nLista de Tareas:");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i) + ". " + tareas.get(i));
            }
        }
    }
}
