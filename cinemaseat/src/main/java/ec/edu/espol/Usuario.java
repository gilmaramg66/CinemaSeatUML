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

public void seleccionarAsiento(){
    // Lógica para seleccionar un asiento
}

public Boleto comprarBoleto(){
    // Lógica para comprar un boleto
}

public void recibirNotificacion(){
    // Lógica para recibir notificaciones
}

}
