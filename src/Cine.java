public class Cine {
    /*
     * En esta clase he creado las variables para crear el Cine.
     * */
    private String nombre;
    private int aforo;
    private Sala[] salas;
    /*
    * Aqui creo el Cine con las variables para en el Main crearlo y asignarle valores.
    * */
    public Cine(String nombre, int aforo, Sala[] salas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = salas;
    }
    /*
    * He creado una opción para mostrar la Información sobre las Salas y la relación con el Cine.
    * */
    public void mostrarInformacionSalas() {
        System.out.println("Información de las salas del cine " + nombre + ":");
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumeroSala() + ": " + sala.getPelicula().getTitulo());
        }
    }
    /*
    * Esta opción es para ver el Estado de la Sala en relación con el Cine.
    * */
    public void mostrarEstadoSala(int numeroSala) {
        for (Sala sala : salas) {
            if (sala.getNumeroSala() == numeroSala) {
                sala.mostrarEstadoButacas();
                return;
            }
        }
        System.out.println("La sala especificada no existe.");
    }
    /*
    * Y esta es la opción creada para reservar un Asiento.
    * */
    public boolean reservarAsiento(int numeroSala, int fila, int columna, String email) {
        for (Sala sala : salas) {
            if (sala.getNumeroSala() == numeroSala) {
                return sala.reservarAsiento(fila, columna, email);
            }
        }
        System.out.println("La sala especificada no existe.");
        return false;
    }
}
