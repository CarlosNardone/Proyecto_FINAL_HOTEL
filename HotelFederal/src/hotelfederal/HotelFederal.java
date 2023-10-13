package hotelfederal;

import accesoadatos.Conexion;
import accesoadatos.HabitacionData;
import accesoadatos.HuespedData;
import accesoadatos.ReservaData;
import accesoadatos.TipoHabitacionData;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.time.LocalDate;

public class HotelFederal {

    public static void main(String[] args) {
        // TODO code application logic here
//        Connection con = Conexion.getConexion();
//Huesped huesped = hue.buscarHuepedPorDni(37577100);
      Huesped carlos = new Huesped(1,"Carlos","Nardone","3812323","Berrutti","carlos.nardone143@gmail.com",155234434, true); 
//        Huesped andres = new Huesped("Andres","Perez","1243243","Mendoza","andres.perez242@gmail.com","112313223", true); 
//        Huesped diego = new Huesped("Diego","Bazzoni","24652571","San Luis","diegobazzoni@gmail.com","3445354545", true); 
//        Huesped mauricio = new Huesped("Mauricio","Avila","30068183","Tucuman","mauricioavila@gmail.com","542323423", true); 
//        Huesped ezequiel = new Huesped("Ezequiel","Hernandez","34243424","Necochea 3850","ezequiel.14322@live.com","155155155", true);
        HuespedData hue = new HuespedData();
        hue.agregarHuesped(carlos);
//        hue.eliminarHuesped("34243424");
//        hue.modificarHuespedPorDNI(carlos);
//        hue.modificarHuesped(carlos);

//       Huesped huespedEncontrado = hue.buscarHuepedPorDni(37577100);
//       if(huespedEncontrado !=null){
//       
//            System.out.println(huespedEncontrado.getDni());
//            System.out.println(huespedEncontrado.getApellido());
//            System.out.println(huespedEncontrado.getNombre());
//            System.out.println(huespedEncontrado.getCelular());
//            System.out.println(huespedEncontrado.getDomicilio());
//    }



//        for (Huesped huesped : hue.listarHuespedes()) {
//            System.out.println(huesped.getDni());
//            System.out.println(huesped.getApellido());
//            System.out.println(huesped.getNombre());
//            System.out.println(huesped.getCelular());
//            System.out.println(huesped.getDomicilio());





//        TipoHabitacion hab = new TipoHabitacion(1,3, 6, 4, "Simple", 12000.5);
//        TipoHabitacionData tipodata = new TipoHabitacionData();
//        Habitacion hab1 = new Habitacion(4, true, 1, hab);
//      
        
//        HabitacionData habdata = new HabitacionData();
//        String apellido = "Carlos";  
//        HuespedData huespedata = new HuespedData();
//         
////         
////        
////         
//        habdata.altaHabitacion(hab1);
////        habdata.eliminarHabitacion(1);
//          habdata.modificarHabitacionPorNumero(hab1);
//
//     
//
////     Habitacion habitacion = habdata.buscarHabitacionXNro(1, hab);
//          TipoHabitacion habitacion = tipodata.buscarTipoHabitacionXCodigo(1);   
////             if (habitacion != null){
//         System.out.println("ID: " + habitacion.getIdTipoHabitacion());
//         System.out.println("Codigo: " + habitacion.getCodigo());
//         System.out.println("MAX: " + habitacion.getCapacidadMaxima());
//         System.out.println("Cantidad de camas: " + habitacion.getCantidadCamas());
         
//    }



         


//         Reserva reserva = new Reserva(LocalDate.of(2023, 10, 6), LocalDate.of(2023, 10, 10), 3, 40000, true, carlos, hab1);
//         ReservaData reserdata = new ReservaData();
//         reserdata.agregarReserva(reserva, hab1, carlos);
        

//TipoHabitacion tphab = new TipoHabitacion(5,4, 2, "doble",20000);
//        TipoHabitacionData tphadata = new TipoHabitacionData();
//tphadata.eliminarTipoHabitacion("5");
//        tipodata.modificartipoHabitacion(hab);

        
//        for (Huesped huesped : huespedata.listarHuespedesXApellido(apellido)) {
//            System.out.println("DNI: " + huesped.getDni());
//            System.out.println("Apellido: " + huesped.getApellido());
//            System.out.println("Nombre: " + huesped.getNombre());
//            System.out.println("Domicilio: " + huesped.getDomicilio());
//            System.out.println("Correo: " + huesped.getCorreo());
//            System.out.println("Correo: " + huesped.getCelular());
            
//            System.out.println("piso: " + habitacion.getPiso());
//            System.out.println("TIPO: " + habitacion.getTipoHabitacion());
            
            
        }     
//            
//            System.out.println("Codigo: " + tipoHabitacion.getCodigo());
//            System.out.println("Capacidad Maxima: " + tipoHabitacion.getCapacidadMaxima());
//            System.out.println("Cantidad de camas: " + tipoHabitacion.getCantidadCamas());
//            System.out.println("Tipo de camas: " + tipoHabitacion.getTipoCamas());
//            System.out.println("Precio de la noche: " + tipoHabitacion.getPrecioNoche());    
//        }

        

    }

