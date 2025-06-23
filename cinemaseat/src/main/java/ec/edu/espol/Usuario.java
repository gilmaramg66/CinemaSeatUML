package ec.edu.espol;

public class Usuario {
    private String id;
    private String name;
    private String email;

    public Usuario(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    } 

    public void seleccionarAsiento(Asiento asiento){
        // Lógica para seleccionar un asiento
    }

    public Boleto comprarBoleto(Asiento asiento, Funcion funcion){
        return new Boleto();
    }

    public void recibirNotificacion(String mensaje){
        // Lógica para recibir notificaciones
    }

}
