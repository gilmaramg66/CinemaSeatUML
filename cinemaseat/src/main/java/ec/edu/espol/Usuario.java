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
public String getId()        { return id;    }
    public void   setId(String id) { this.id = id; }

    public String getName()        { 
        return name; }
    public void   setName(String n){ 
        this.name = n;}

    public String getEmail()         { 
        return email; }
    public void   setEmail(String e) { 
        this.email = e; }

    
    public void seleccionarAsiento() { 
        
     }
    public Boleto comprarBoleto()    { 
         return null; }
    public void recibirNotificacion(){ 
        
     }


}
