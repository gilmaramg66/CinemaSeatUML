package ec.edu.espol;

import java.time.LocalDateTime;
import java.util.List;

public class Boleto {
    private final LocalDateTime fechaCompra;
    private final Usuario usuario;
    private final Funcion funcion;
    private final List<Asiento> asientos;

    public Boleto(LocalDateTime fechaCompra,
                  Usuario usuario,
                  Funcion funcion,
                  List<Asiento> asientos) {
        this.fechaCompra = fechaCompra;
        this.usuario     = usuario;
        this.funcion     = funcion;
        this.asientos    = List.copyOf(asientos);
    }

    /* ---------- getters  ---------- */
    public LocalDateTime getFechaCompra() { 
        return fechaCompra; 
    }
    public Usuario getUsuario(){ 
        return usuario;     
    }
    public Funcion getFuncion(){ 
        return funcion;     
    }
    public List<Asiento> getAsientos()    { return asientos;    }

    
    public double obtenerPrecio() {
        return asientos.stream()
                       .mapToDouble(Asiento::obtenerPrecio)
                       .sum();
    }
}