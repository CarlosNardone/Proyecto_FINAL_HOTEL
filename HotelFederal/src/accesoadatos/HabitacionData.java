package accesoadatos;

import entidades.Habitacion;
import entidades.Huesped;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;
    private TipoHabitacion tipoHab = new TipoHabitacion();
    private TipoHabitacionData dat = new TipoHabitacionData();

    public HabitacionData() {
        con = Conexion.getConexion();

    }

    public void altaHabitacion(Habitacion habitacion) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO habitacion"
                    + "(numero, estado, piso, idTipoHabitacion) "
                    + "VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getNumero());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Habitacion Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Esta Habitacion ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Habitacion duplicada");
            System.err.println(ex);
        }

    }

    public void eliminarHabitacion(int numero) {
        String sql = "UPDATE habitacion SET estado = 0  WHERE numero  = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Habitacion dada de baja");
            } else {
                JOptionPane.showMessageDialog(null, "Esta habitacion ya esta dada de baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }
    }

    public void modificarHabitacionPorNumero(Habitacion habitacion) {
        String sql = "UPDATE habitacion SET numero = ?, estado = ?, piso = ? "
                + "WHERE numero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNumero());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.getNumero());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 1) {
                JOptionPane.showMessageDialog(null, "Habitación Modificada");
            } else {
                JOptionPane.showMessageDialog(null, "Habitación inexistente");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitación");
            System.err.println(ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public Habitacion buscarHabitacionXNro(int numero, TipoHabitacion tipohab) {
        String sql = "SELECT idHabitacion, numero, estado, idTipohabitacion FROM habitacion WHERE numero = ? AND estado = 1";
        Habitacion habitacion = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                //habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(tipohab);

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa habitacion");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }

        return habitacion;
    }

    public List<Habitacion> listarHabitaciones() {
        String sql = "SELECT idHabitacion ,numero, estado, piso, idTipoHabitacion FROM habitacion WHERE estado = 1";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                TipoHabitacion tiphab = new TipoHabitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setPiso(rs.getInt("piso"));
                int idTipoHabitacion = rs.getInt("idTipoHabitacion");
                tiphab = dat.buscarTipoHabitacion(idTipoHabitacion);
//                tipoHab.setIdTipoHabitacion(idTipoHabitacion);
                habitacion.setTipoHabitacion(tiphab);

//                habitacion.getTipoHabitacion().getIdTipoHabitacion();
                habitaciones.add(habitacion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesxPiso(int piso) {
        String sql = "SELECT idHabitacion ,numero, estado, piso, idTipoHabitacion FROM habitacion WHERE piso = ?";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                TipoHabitacion tiphab = new TipoHabitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setPiso(rs.getInt("piso"));
                int idTipoHabitacion = rs.getInt("idTipoHabitacion");
                tiphab = dat.buscarTipoHabitacion(idTipoHabitacion);
//                tiphab.setIdTipoHabitacion(idTipoHabitacion);
                habitacion.setTipoHabitacion(tiphab);

//                habitacion.getTipoHabitacion().getIdTipoHabitacion();
                habitaciones.add(habitacion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesxTipo() {
        String sql = "SELECT idHabitacion ,numero, estado, piso, idTipoHabitacion FROM habitacion WHERE tipo = ?";
//        String sql = "SELECT idHabitacion, numero, estado, piso, idTipoHabitacion FROM habitacion WHERE tipo = ?";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//PreparedStatement ps = con.prepareStatement(sql);
//ps.setString(1, tipoSeleccionado);  // Establecer el valor del parámetro
//ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                TipoHabitacion tiphab = new TipoHabitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setPiso(rs.getInt("piso"));
                int idTipoHabitacion = rs.getInt("idTipoHabitacion");
                tiphab.setIdTipoHabitacion(idTipoHabitacion);
                habitacion.setTipoHabitacion(tiphab);

//                habitacion.getTipoHabitacion().getIdTipoHabitacion();
                habitaciones.add(habitacion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return habitaciones;
    }
    
        public List<Habitacion> listarHabitacionesxNumero(int numero) {
        String sql = "SELECT idHabitacion ,numero, estado, piso, idTipoHabitacion FROM habitacion WHERE numero = ?";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                TipoHabitacion tiphab = new TipoHabitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setPiso(rs.getInt("piso"));
                int idTipoHabitacion = rs.getInt("idTipoHabitacion");
                tiphab = dat.buscarTipoHabitacion(idTipoHabitacion);
//                tiphab.setIdTipoHabitacion(idTipoHabitacion);
                habitacion.setTipoHabitacion(tiphab);

//                habitacion.getTipoHabitacion().getIdTipoHabitacion();
                habitaciones.add(habitacion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return habitaciones;
    }
}
