package ec.edu.espol;

public class AsientoEstandar extends Asiento {
    
    public AsientoEstandar(int fila, int columna) { 
        super(fila, columna, "Estandar"); 
    }

    @Override public double obtenerPrecio() { 
        return 8.00; 
    }
}
