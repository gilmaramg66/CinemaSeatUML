package ec.edu.espol;

public class Asiento4D extends Asiento {
    public Asiento4D(int fila, int columna) { 
        super(fila, columna, "4D"); 
    }

    @Override public double obtenerPrecio() { 
        return 15.00; 
    }
}