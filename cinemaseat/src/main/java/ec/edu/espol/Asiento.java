package ec.edu.espol;

enum estadoAsiento {
    DISPONIBLE, RESERVADO, PROCESO_DE_COMPRA
}

public abstract class Asiento {
    private String id;
    private float precio;
    private estadoAsiento estado;

    public estadoAsiento getEstado() {
        return estado;
    }

    public void setEstado(estadoAsiento estado) {
        this.estado = estado;
    }

    public void liberar() {
        this.estado = estadoAsiento.DISPONIBLE;
    }

    public void reservar() {
        if (this.estado == estadoAsiento.DISPONIBLE) {
            this.estado = estadoAsiento.RESERVADO;
        } else {
            throw new IllegalStateException("El asiento no está disponible para reservar.");
        }
    }

    public float getPrecio(){
        return precio;
    };

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
