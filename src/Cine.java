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
}
