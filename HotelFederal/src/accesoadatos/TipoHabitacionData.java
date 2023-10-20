package accesoadatos;

import entidades.Habitacion;
import entidades.Huesped;
import entidades.TipoHabitacion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TipoHabitacionData {

    private Connection con = null;
    
    
    
    public TipoHabitacionData() {
        con = Conexion.getConexion();

    }

    public void agregarTipoHab(TipoHabitacion tipoHab) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO tipohabitacion"
                    + "(codigo, capacidadMaxima, cantidadCamas, tipoCamas,precioNoche) "
                    + "VALUES (?, ?, ?, ?, ? )", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipoHab.getCodigo());
            ps.setInt(2, tipoHab.getCapacidadMaxima());
            ps.setInt(3, tipoHab.getCantidadCamas());
            ps.setString(4, tipoHab.getTipoCamas());
            ps.setDouble(5, tipoHab.getPrecioNoche());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Tipo Habitacion agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Este tipo de Habitacion ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo habitacion duplicada");
            System.err.println(ex);
        }
      
    }

    public void eliminarTipoHabitacion(int codigo){
        String sql = "DELETE FROM TipoHabitacion WHERE codigo = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de baja");
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de Habitacion ya esta dado de baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipohabitacion ");
        }
    }

    public TipoHabitacion buscarTipoHabitacionXCodigo(int codigo) {
        String sql = "SELECT idTipoHabitacion , codigo, capacidadMaxima, cantidadCamas, tipoCamas, precioNoche FROM tipohabitacion WHERE codigo = ? ";
        TipoHabitacion tipoHabitacion = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tipoHabitacion.setCodigo(rs.getInt("codigo"));
                tipoHabitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipoHabitacion.setTipoCamas(rs.getString("tipoCamas"));
                tipoHabitacion.setPrecioNoche(rs.getDouble("precioNoche"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese tipo de habitación");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipohabitacion");
        }

        return tipoHabitacion;
    }

    public void modificartipoHabitacion(TipoHabitacion tipoHabitacion) {
        String sql = "UPDATE tipohabitacion SET codigo = ?, capacidadMaxima = ?, cantidadCamas = ?, tipoCamas = ?, precioNoche = ? "
                + "WHERE codigo = ?";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, tipoHabitacion.getIdTipoHabitacion());
            ps.setInt(1, tipoHabitacion.getCodigo());
            ps.setInt(2, tipoHabitacion.getCapacidadMaxima());
            ps.setInt(3, tipoHabitacion.getCantidadCamas());
            ps.setString(4, tipoHabitacion.getTipoCamas());
            ps.setDouble(5, tipoHabitacion.getPrecioNoche());
            ps.setInt(6, tipoHabitacion.getCodigo());
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 1) {
                JOptionPane.showMessageDialog(null, "Tipo de Habitación Modificada");
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de Habitación inexistente");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHabitación");
            System.err.println(ex);
         
        }
    }

    public List <TipoHabitacion> listarTipoHabitaciones(){
        String sql = "SELECT idTipoHabitacion ,codigo, capacidadMaxima, cantidadCamas, tipoCamas, precioNoche FROM tipohabitacion";
        ArrayList <TipoHabitacion> tipoHabitaciones = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             Habitacion habitacion = new Habitacion();
             TipoHabitacion tiphab = new TipoHabitacion();
                
                tiphab.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tiphab.setCodigo(rs.getInt("codigo"));
                tiphab.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                tiphab.setCantidadCamas(rs.getInt("cantidadCamas"));
                tiphab.setTipoCamas(rs.getString("tipoCamas"));
                tiphab.setPrecioNoche(rs.getDouble("precioNoche"));
                
                
                
                tipoHabitaciones.add(tiphab);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo Habitacion");
        }
        
        return tipoHabitaciones;
    }
   
    public TipoHabitacion buscarTipoHabitacionXCamas(String tipoCama) {
        String sql = "SELECT idTipoHabitacion , codigo, capacidadMaxima, cantidadCamas, tipoCamas, precioNoche FROM tipohabitacion WHERE tipoCamas = ? ";
        TipoHabitacion tipoHabitacion = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoCama);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tipoHabitacion.setCodigo(rs.getInt("codigo"));
                tipoHabitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipoHabitacion.setTipoCamas(rs.getString("tipoCamas"));
                tipoHabitacion.setPrecioNoche(rs.getDouble("precioNoche"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese tipo de habitación");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipohabitacion");
        }

        return tipoHabitacion;
    }
   
    public TipoHabitacion buscarTipoHabitacion(int id){
        String sql = "SELECT idTipoHabitacion , codigo, capacidadMaxima, cantidadCamas, tipoCamas, precioNoche FROM tipohabitacion WHERE idTipoHabitacion = ? ";
        TipoHabitacion Tipohab = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Tipohab = new TipoHabitacion();
                Tipohab.setIdTipoHabitacion(id);
                Tipohab.setCodigo(rs.getInt("codigo"));
                Tipohab.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                Tipohab.setCantidadCamas(rs.getInt("cantidadCamas"));
                Tipohab.setTipoCamas(rs.getString("tipoCamas"));
                Tipohab.setPrecioNoche(rs.getDouble("precioNoche"));
                
                }else{
                JOptionPane.showMessageDialog(null, "No existe ese alumno");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return Tipohab;
    }
    
   //    public Habitacion buscarHabitacionXNro(int numero, TipoHabitacion tipohab) {
//        String sql = "SELECT idHabitacion, numero, estado, idTipohabitacion FROM habitacion WHERE numero = ? AND estado = 1";
//        Habitacion habitacion = null;
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, numero);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                habitacion = new Habitacion();
//                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
//                habitacion.setNumero(rs.getInt("numero"));
//                habitacion.setEstado(rs.getBoolean("estado"));
//                //habitacion.setPiso(rs.getInt("piso"));
//                habitacion.setTipoHabitacion(tipohab);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No existe esa habitacion");
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
//        }
//
//        return habitacion;
//    }
    
}
