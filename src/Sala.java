public class Sala {
    /*
    * En esta clase he creado las variables para crear las Salas.
    * */
    public int numeroSala;
    public Pelicula pelicula;
    public boolean[][] butacas; // Matriz de butacas, true: ocupada, false: libre
    /*
     * Aqui creo la Sala con las variables para en el Main asignarle valores.
     * */
    public Sala(int numeroSala, Pelicula pelicula, int filas, int columnas) {
        this.numeroSala = numeroSala;
        this.pelicula = pelicula;
        this.butacas = new boolean[filas][columnas];
    }
    /*
    * Uso los getters para asignarles valores al numero de Sala y la Pelicula.
    * */
    public int getNumeroSala() {
        return numeroSala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    /*
    * Esto es la variable para mostrar si las Butacas estan Disponibles o están Ocupadas.
    * */
    public void mostrarEstadoButacas() {
        System.out.println("Estado de las butacas de la Sala " + numeroSala + " - Película: " + pelicula.getTitulo());
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
    }
    /*
    * Y ahora creo la opción de reservar un Asiento, y al reservarlo el estado de l abutaca acmbie a Ocupado.
    * */
    public boolean reservarAsiento(int filas, int columnas, String email) {
        if (filas < 0  filas >= butacas.length  columnas < 0 || columnas >= butacas[0].length) {
            System.out.println("La butaca especificada no existe.");
            return false;
        }

        if (butacas[filas][columnas]) {
            System.out.println("La butaca está ocupada.");
            return false;
        }

        butacas[filas][columnas] = true;
        System.out.println("Asiento reservado con éxito para " + email + ".");
        return true;
    }
}
