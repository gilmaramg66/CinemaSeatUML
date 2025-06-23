package ec.edu.espol;

import java.time.LocalDateTime;

public class Funcion {
    private String pelicula;
    private LocalDateTime hora;

    public Funcion(String pelicula, LocalDateTime hora) {
        this.pelicula = pelicula;
        this.hora     = hora;
    }
    /* ---------- getters & setters ---------- */
    public String getPelicula(){ 
        return pelicula; 
    }
    
    public void   setPelicula(String p){ 
        this.pelicula = p; 
    }

    public LocalDateTime getHora(){
         return hora; 
        }
    public void setHora(LocalDateTime h) { 
        this.hora = h; 
    }

    public double calcularPrecio() {
        return 6.50; 
    }
}
