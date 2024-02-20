public class Sala {
    /*
    * En esta clase he creado las variables para crear las Salas.
    * */
    private int numeroSala;
    private Pelicula pelicula;
    private boolean[][] butacas; // Matriz de butacas, true: ocupada, false: libre
    /*
     * Aqui creo la Sala con las variables para en el Main asignarle valores.
     * */
    public Sala(int numeroSala, Pelicula pelicula, int filas, int columnas) {
        this.numeroSala = numeroSala;
        this.pelicula = pelicula;
        this.butacas = new boolean[filas][columnas];
    }
}
