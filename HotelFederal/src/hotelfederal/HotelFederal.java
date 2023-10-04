/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfederal;

import accesoadatos.Conexion;
import accesoadatos.HuespedData;
import entidades.Huesped;
import java.sql.Connection;

/**
 *
 * @author Carlos
 */
public class HotelFederal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        Huesped carlos = new Huesped("Carlos Andres","Nardone","37577100","En la esquina de mi casa","carlos.nardone143@gmail.com","155234434", true);
//        Huesped ezequiel = new Huesped("Ezequiel","Hernandez","34243424","Necochea 3850","ezequiel.14322@live.com","155155155", true);
        HuespedData hue = new HuespedData();
//        hue.agregarHuesped(ezequiel);
//        hue.eliminarHuesped("34243424");
        hue.modificarHuesped(carlos);
        
    }
    
}
