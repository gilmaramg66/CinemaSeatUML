package ec.edu.espol;

import java.util.List;

public class SalaCine {
    List<Asiento> asientos;
    List<Funcion> funciones;

    public SalaCine(List<Asiento> asientos, List<Funcion> funciones) {
        this.asientos = asientos;
        this.funciones = funciones;
    }

    public void addFuncion(Funcion funcion) {
        this.funciones.add(funcion);
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void deleteFuncion(Funcion funcion) {
        this.funciones.remove(funcion);
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public List<Asiento> getAsientosDisponibles() {
        return asientos.stream()
                .filter(asiento -> asiento.getEstado() == estadoAsiento.DISPONIBLE)
                .toList();
    }
}
