package ec.edu.espol;

public class Funcion {
    private String id;
    private String pelicula;
    private String horario;
    private SalaCine salaCine;

    public Funcion(String id, String pelicula, String horario, SalaCine salaCine) {
        this.id = id;
        this.pelicula = pelicula;
        this.horario = horario;
        this.salaCine = salaCine;
    }

    public String getId() {
        return id;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public SalaCine getSalaCine() {
        return salaCine;
    }
}
