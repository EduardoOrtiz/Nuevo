
package Principal;
import Conexion_BD.Conexion_BD;
import Pantallas.Inicio_Sesion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Conexion_BD conexion=new Conexion_BD();
        
        if (Conexion_BD.getConexionSQL()!=null) {
            
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo conectar al servidor");
        }
        Inicio_Sesion mp=new Inicio_Sesion();
        mp.setVisible(true);
    }
}
