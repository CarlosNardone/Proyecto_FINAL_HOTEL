
package hotelfederal;

import accesoadatos.Conexion;
import accesoadatos.HuespedData;
import entidades.Huesped;
import java.sql.Connection;


public class HotelFederal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        Huesped carlos = new Huesped("Carlos Andres","Nardone","37577100","En la esquina de mi casa","carlos.nardone143@gmail.com","155234434", true);
//        Huesped ezequiel = new Huesped("Ezequiel","Hernandez","34243424","Necochea 3850","ezequiel.14322@live.com","155155155", true);
        HuespedData hue = new HuespedData();
//        hue.agregarHuesped(carlos);
//        hue.eliminarHuesped("34243424");
        hue.modificarHuesped(carlos);
        
    }
    
}
