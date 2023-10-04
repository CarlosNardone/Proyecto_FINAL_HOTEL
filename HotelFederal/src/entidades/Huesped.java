
package entidades;


public class Huesped {
    private int idHuesped;
    private String apellido;
    private String nombre;
    private String dni;
    private String domicilio;
    private String correo;
    private String celular;
    private boolean estado;
    
    
    // Const

    public Huesped() {
    }

    public Huesped(String apellido, String nombre, String dni, String domicilio, String correo, String celular, Boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }

    public Huesped(int idHuesped, String apellido, String nombre, String dni, String domicilio, String correo, String celular, Boolean estado) {
        this.idHuesped = idHuesped;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
        
    }

   
   // get and set

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Huesped{" + "idHuesped=" + idHuesped + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", correo=" + correo + ", celular=" + celular + ", estado=" + estado + '}';
    }


    
    
}
