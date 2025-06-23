package ec.edu.espol;

import java.util.List;

public class ServicioNotificacion {

    public void notificarUsuario(Usuario user, Boleto boleto) {
        // TODO: integración real email / SMS
        System.out.println("Correo a " + user.getEmail()
                + "\nTu compra: " + boleto.obtenerPrecio());
    }

    public void notificarUsuarios(List<Usuario> usuarios, String mensaje) {
        usuarios.forEach(u -> System.out.println("Msg a " + u.getEmail() + ": " + mensaje));
    }
}