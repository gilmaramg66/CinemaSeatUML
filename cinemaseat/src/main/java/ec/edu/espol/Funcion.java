package ec.edu.espol;

import java.time.LocalDateTime;

public class Funcion {
    private String pelicula;
    private LocalDateTime hora;

    public Funcion(String pelicula, LocalDateTime hora) {
        this.pelicula = pelicula;
        this.hora     = hora;
    }
}
