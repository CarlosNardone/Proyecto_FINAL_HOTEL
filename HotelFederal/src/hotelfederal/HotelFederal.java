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
//      Huesped carlos = new Huesped(1,"Carlos","Nardone","37577100","Berrutti","carlos.nardone143@gmail.com","155234434", true); 
//        Huesped andres = new Huesped("Andres","Perez","1243243","Mendoza","andres.perez242@gmail.com","112313223", true); 
//        Huesped diego = new Huesped("Diego","Bazzoni","24652571","San Luis","diegobazzoni@gmail.com","3445354545", true); 
//        Huesped mauricio = new Huesped("Mauricio","Avila","30068183","Tucuman","mauricioavila@gmail.com","542323423", true); 
//        Huesped ezequiel = new Huesped("Ezequiel","Hernandez","34243424","Necochea 3850","ezequiel.14322@live.com","155155155", true);

//        HuespedData hue = new HuespedData();
////        TipoHabitacion hab = new TipoHabitacion(1,"1", 1, 1, "simple", 1000);
//        
//         Habitacion hab1 = new Habitacion(10, 1, true, 2, hab);
//         Reserva reserva = new Reserva(LocalDate.of(2023, 10, 6), LocalDate.of(2023, 10, 10), 3, 40000, true, carlos, hab1);
//         ReservaData reserdata = new ReservaData();
//         reserdata.agregarReserva(reserva, hab1, carlos);
//        HabitacionData habdata = new HabitacionData();
//        habdata.altaHabitacion(hab1);
//        habdata.eliminarHabitacion(1);
//        hue.agregarHuesped(ezequiel);
//        hue.eliminarHuesped("34243424");
//        hue.modificarHuespedPorDNI(carlos);
//        hue.modificarHuesped(carlos);
//          habdata.modificarHabitacionPorNumero(hab1);
//          Huesped huesped = hue.buscarHuepedPorDni(37577100);
//TipoHabitacion tphab = new TipoHabitacion("5",4, 2, "doble",20000);
        TipoHabitacionData tphadata = new TipoHabitacionData();
//tphadata.eliminarTipoHabitacion("5");

    }

}
