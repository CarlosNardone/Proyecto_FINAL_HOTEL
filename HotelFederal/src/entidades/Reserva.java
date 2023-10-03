
package entidades;

import java.time.LocalDate;

public class Reserva {
private int idReserva;
private LocalDate fechaDeEntrada;
private LocalDate fechaDeSalida;
private int cantidadPersonas;
private double precioTotal;
private boolean estado;
private Huesped huesped;
private Habitacion habitacion;

//cont

    public Reserva() {
    }

    public Reserva(LocalDate fechaDeEntrada, LocalDate fechaDeSalida, int cantidadPersonas, double precioTotal, boolean estado, Huesped huesped, Habitacion habitacion) {
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public Reserva(int idReserva, LocalDate fechaDeEntrada, LocalDate fechaDeSalida, int cantidadPersonas, double precioTotal, boolean estado, Huesped huesped, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }
    
    // get and set

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(LocalDate fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public LocalDate getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fechaDeEntrada=" + fechaDeEntrada + ", fechaDeSalida=" + fechaDeSalida + ", cantidadPersonas=" + cantidadPersonas + ", precioTotal=" + precioTotal + ", estado=" + estado + ", huesped=" + huesped + ", habitacion=" + habitacion + '}';
    }
    
    
    
    
    


    
}
