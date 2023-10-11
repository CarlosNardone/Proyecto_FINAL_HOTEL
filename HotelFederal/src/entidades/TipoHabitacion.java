
package entidades;


public class TipoHabitacion {
   private int idTipoHabitacion;
   private int codigo;
   private int capacidadMaxima;
   private int cantidadCamas;
   private String tipoCamas;
   private double precioNoche;
   
   
   //const

    public TipoHabitacion() {
    }

    public TipoHabitacion(int codigo, int capacidadMaxima, int cantidadCamas, String tipoCamas, double precioNoche) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadCamas = cantidadCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion(int idTipoHabitacion, int codigo, int capacidadMaxima, int cantidadCamas, String tipoCamas, double precioNoche) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadCamas = cantidadCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }
   
    
    // get and set

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idTipoHabitacion=" + idTipoHabitacion + ", codigo=" + codigo + ", capacidadMaxima=" + capacidadMaxima + ", cantidadCamas=" + cantidadCamas + ", tipoCamas=" + tipoCamas + ", precioNoche=" + precioNoche + '}';
    }
    
    
    
   
           
    
    
}
