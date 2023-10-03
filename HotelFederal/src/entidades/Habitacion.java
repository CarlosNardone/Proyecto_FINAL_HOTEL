
package entidades;


public class Habitacion {
    
    private int idHabitacion;
    private int numero;
    private boolean estado;
    private int piso;
    private TipoHabitacion tipoHabitacion;

    //const
    public Habitacion() {
    }

    public Habitacion(int numero, boolean estado, int piso, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.estado = estado;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion(int idHabitacion, int numero, boolean estado, int piso, TipoHabitacion tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.estado = estado;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    // get and set

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", numero=" + numero + ", estado=" + estado + ", piso=" + piso + ", tipoHabitacion=" + tipoHabitacion + '}';
    }
    
    
    
    
}
