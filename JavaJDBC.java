import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJDBC {

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/exhibiciondecoches", "root", ""
            );
            
            // CANTIDAD TOTAL DE PERSONAS INSCRITAS
            
            Statement total = connection.createStatement();
            ResultSet resultadototal = total.executeQuery("select count(*) from publico");
            while (resultadototal.next()) {
            	System.out.println("                                         ");
                System.out.println("Se han inscrito " + resultadototal.getInt(1)+ " personas. ");
                System.out.println("--------------------------------");
           
                }
            
            // DATOS DE LAS PERSONAS INSCRITAS
            
            Statement datos = connection.createStatement();
            ResultSet resultadodatos= datos.executeQuery("select * from publico");
            while (resultadodatos.next()) {
                System.out.println("Se inscribio: " +  " " +resultadodatos.getString(2)+ " " +resultadodatos.getString(3)+ " Nacido en "+resultadodatos.getString(4)+ " que vive en "+resultadodatos.getString(5)+ " "+resultadodatos.getString(6)+ " y Su D.N.I "+resultadodatos.getString(7));
                System.out.println("--------------------------------") ;

            }
            // DATOS DE LOS COCHES 
            
            Statement cochecitos = connection.createStatement();
            ResultSet resultadoscochecitos= cochecitos.executeQuery("select * from coche");
            while (resultadoscochecitos.next()) {
                System.out.println("Coche exhibido : " +  " " +resultadoscochecitos.getString(2)+ " " +resultadoscochecitos.getString(3)+ " "+resultadoscochecitos.getString(4)+ " "+resultadoscochecitos.getString(5)+ " "+resultadoscochecitos.getString(6)+ ""+resultadoscochecitos.getString(7));
                System.out.println("--------------------------------") ;

            }
            
    
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}