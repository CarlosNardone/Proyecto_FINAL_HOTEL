
package hotelfederal;

import accesoadatos.Conexion;
import accesoadatos.HuespedData;
import entidades.Habitacion;
import entidades.Huesped;
import java.sql.Connection;


public class HotelFederal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        Huesped carlos = new Huesped("Carlos Andres","Nardone","37577100","Cochabamba","carlos.lopez143@gmail.com","155234434", true); 
        Huesped andres = new Huesped("Andres","Perez","1243243","Mendoza","andres.perez242@gmail.com","112313223", true); 
        Huesped diego = new Huesped("Diego","Bazzoni","24652571","San Luis","diegobazzoni@gmail.com","3445354545", true); 
        Huesped mauricio = new Huesped("Mauricio","Avila","30068183","Tucuman","mauricioavila@gmail.com","542323423", true); 
//        Huesped ezequiel = new Huesped("Ezequiel","Hernandez","34243424","Necochea 3850","ezequiel.14322@live.com","155155155", true);
        HuespedData hue = new HuespedData();
        
        
        Habitacion hab1 = new Habitacion(1,true,2,1);
//        hue.agregarHuesped(mauricio);
//        hue.eliminarHuesped("34243424");
//        hue.modificarHuespedPorDNI(carlos);
//        hue.modificarHuesped(carlos);
    }
    
}
