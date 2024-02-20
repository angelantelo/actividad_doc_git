import java.util.Scanner;
public class Main {
        /*
        * Primero en el Main he creado lo necesario para crear 2 pelis, 2 salas y un Cine.
        * */
        public static void main(String[]args){
            Pelicula pelicula1 = new Pelicula("Los Simpson", 120);
            Pelicula pelicula2 = new Pelicula("Los minions 4", 90);

            Sala sala1 = new Sala(1, pelicula1, 5, 5);
            Sala sala2 = new Sala(2, pelicula2, 4, 6);

            Cine cine = new Cine("Cine Coslada", 100, new Sala[]{sala1, sala2});
            Scanner scanner = new Scanner(System.in);
    }
    /*
    * Esto es el while con las opciones para que aparezca en el Main.
    */
    while (true) {
        System.out.println("Menú:");
        System.out.println("1. Ver información de las salas");
        System.out.println("2. Ver estado de una sala");
        System.out.println("3. Reservar un asiento");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                cine.mostrarInformacionSalas();
                break;
            case 2:
                System.out.println("Ingrese el número de la sala:");
                int numeroSala = scanner.nextInt();
                cine.mostrarEstadoSala(numeroSala);
                break;
            case 3:
                System.out.println("Ingrese el número de la sala:");
                numeroSala = scanner.nextInt();
                System.out.println("Ingrese la fila del asiento:");
                int fila = scanner.nextInt();
                System.out.println("Ingrese la columna del asiento:");
                int columna = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese su email:");
                String email = scanner.nextLine();
                cine.reservarAsiento(numeroSala, fila, columna, email);
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }

}