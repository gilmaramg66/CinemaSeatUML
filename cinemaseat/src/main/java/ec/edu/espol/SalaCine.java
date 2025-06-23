package ec.edu.espol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaCine {
    private final String id;
    private final List<Asiento> asientos  = new ArrayList<>();
    private final List<Funcion> funciones = new ArrayList<>();

    public SalaCine(String id) { this.id = id; }

    /* ---------- getters ---------- */
    public String            getId()        { return id; }
    public List<Asiento>     getAsientos()  { return Collections.unmodifiableList(asientos); }
    public List<Funcion>     getFunciones() { return Collections.unmodifiableList(funciones); }

    /* ---------- lógica ---------- */
    public Asiento obtenerAsiento(String asientoId) {
        return asientos.stream()
                .filter(a -> (a.fila + "" + a.columna).equalsIgnoreCase(asientoId))
                .findFirst()
                .orElse(null);
    }

    public List<Asiento> obtenerAsientosDisponibles() {
        return asientos.stream().filter(Asiento::estaDisponible).toList();
    }

    public void configurarAsientos(List<Asiento> nuevos) {
        asientos.clear();
        asientos.addAll(nuevos);
    }

    public void actualizarEstadoAsiento() {
        // TODO liberar asientos en PENDIENTE_PAGO vencidos
    }

    public void addFuncion(Funcion f) { funciones.add(f); }
}