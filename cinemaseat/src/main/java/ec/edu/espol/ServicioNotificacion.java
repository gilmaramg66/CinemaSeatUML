package ec.edu.espol;

import java.util.List;

public class ServicioNotificacion {
    public void enviarNotificacion(Usuario usuario, String mensaje) {
        // Lógica para enviar notificaciones a los usuarios
    }

    public void enviarNotificacionCompra(Usuario usuario, Boleto boleto) {
        String mensaje = "Compra exitosa: " + boleto.toString();
        enviarNotificacion(usuario, mensaje);
    }

    public void enviarNotificacionCancelacion(Usuario usuario, Boleto boleto) {
        String mensaje = "Compra cancelada: " + boleto.toString();
        enviarNotificacion(usuario, mensaje);
    }

    public void enviarNotificacionFuncionNueva(Usuario usuario, Funcion funcion) {
        String mensaje = "Nueva función disponible: " + funcion.getPelicula() + " a las " + funcion.getHorario();
        enviarNotificacion(usuario, mensaje);
    }

    public void enviarNotificacionUsuarios(List<Usuario> usuarios, String mensaje) {
        for (Usuario usuario : usuarios) {
            enviarNotificacion(usuario, mensaje);
        }
    }
}
