package ec.edu.espol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaCine {
    private final List<SalaCine> salas    = new ArrayList<>();
    private final List<Usuario>  usuarios = new ArrayList<>();

    /* ---------- getters ---------- */
    public List<SalaCine> getSalas()    { return Collections.unmodifiableList(salas); }
    public List<Usuario>  getUsuarios() { return Collections.unmodifiableList(usuarios); }

    /* ---------- lógica ---------- */
    public void agregarSala(SalaCine sala)    { salas.add(sala); }
    public void registrarUsuario(Usuario u)   { usuarios.add(u); }

    public void configurarSala(String salaId, Funcion funcion) {
        salas.stream()
             .filter(s -> s.getId().equals(salaId))
             .findFirst()
             .ifPresent(s -> s.addFuncion(funcion));
    }
}