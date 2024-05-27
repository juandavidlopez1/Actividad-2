import java.util.ArrayList;
import java.util.Scanner;

public class GestorJugadores {
    private ArrayList<Jugador> jugadores;
    private Scanner scanner;

    public GestorJugadores() {
        jugadores = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarJugador() {
        System.out.println("Ingrese el nombre del jugador:");
        String nombre = scanner.nextLine();
        jugadores.add(new Jugador(nombre));
        listarJugadores();
    }

    public void eliminarJugador() {
        System.out.println("Ingrese el ID del jugador a eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        jugadores.removeIf(jugador -> jugador.getId() == id);
        listarJugadores();
    }

    public void buscarJugador() {
        System.out.println("Ingrese el ID del jugador a buscar:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                System.out.println(jugador);
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    public void editarJugador() {
        System.out.println("Ingrese el ID del jugador a editar:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                System.out.println("Ingrese el nuevo nombre:");
                jugador.setNombre(scanner.nextLine());
                listarJugadores();
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    public void listarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Agregar jugador\n2. Eliminar jugador\n3. Buscar jugador\n4. Editar jugador\n5. Listar jugadores\n6. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            switch (opcion) {
                case 1:
                    agregarJugador();
                    break;
                case 2:
                    eliminarJugador();
                    break;
                case 3:
                    buscarJugador();
                    break;
                case 4:
                    editarJugador();
                    break;
                case 5:
                    listarJugadores();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void main(String[] args) {
        new GestorJugadores().iniciar();
    }
}
