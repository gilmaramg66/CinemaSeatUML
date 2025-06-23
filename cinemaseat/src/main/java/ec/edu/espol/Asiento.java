package ec.edu.espol;

public abstract class Asiento {
    protected int fila;
    protected int columna;
    protected String tipo;
    protected EstadoAsiento estado = EstadoAsiento.DISPONIBLE;

    protected Asiento(int fila, int columna, String tipo) {
        this.fila    = fila;
        this.columna = columna;
        this.tipo    = tipo;
    }
    public int getFila(){ 
        return fila;   
    }
    public int  getColumna(){ 
        return columna;
    }
    public String  getTipo(){ 
        return tipo;   
    }
    public EstadoAsiento getEstado() { 
        return estado; 
    }

    public void reservar()  {
        estado = EstadoAsiento.RESERVADO; }

    public void liberar() { 
        estado = EstadoAsiento.DISPONIBLE; 
    }

    public void marcarPendientePago() { 
        estado = EstadoAsiento.PENDIENTE_PAGO; 
    }

    public abstract double obtenerPrecio();
}
