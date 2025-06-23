package ec.edu.espol;
public class Boleto {
    private String id;
    private Funcion funcion;
    private Asiento asiento;
    private Usuario usuario;

    public Boleto(Funcion funcion, Asiento asiento, Usuario usuario) {
        this.funcion = funcion;
        this.asiento = asiento;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "id='" + id + '\'' +
                ", asiento=" + asiento +
                ", usuario=" + usuario +
                '}';
    }
}
