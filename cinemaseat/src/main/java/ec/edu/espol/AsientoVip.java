package ec.edu.espol;

public class AsientoVip extends Asiento {
    public AsientoVip(int fila, int columna) { super(fila, columna, "VIP"); }
    @Override public double obtenerPrecio()  { return 12.00; }
}
