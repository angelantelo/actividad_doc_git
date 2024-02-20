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


}