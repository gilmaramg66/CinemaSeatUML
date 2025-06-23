package ec.edu.espol;

import java.util.ArrayList;
import java.util.List;

// singleton para gestionar el sistema de cine
// contiene una lista de salas de cine, una lista de funciones y un servicio de notificación
public class SistemaCine {
    private List<SalaCine> salas;
    private List<Funcion> funciones;
    private ServicioNotificacion servicioNotificacion;

    private SistemaCine() {
        this.salas = new ArrayList<>();
        this.funciones = new ArrayList<>();
        this.servicioNotificacion = new ServicioNotificacion();
    }

    public List<SalaCine> getSalas() {
        return salas;
    }

    public void addSala(SalaCine sala) {
        this.salas.add(sala);
    }

    public static SistemaCine getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SistemaCine INSTANCE = new SistemaCine();
    }
}
