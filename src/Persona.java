import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class Persona extends PersonaApp.PersonaPOA{
    
    private ORB orb;

    @Override
    public boolean insertarPersona(int id_persona, String nombre, String apellido, int telefono, String direccion, String correo) {
        boolean resultado = false;
        try {
            String query = "Insert into persona(id_persona,nombre,apellido,telefono,direccion,correo)"
                    + "values ("+id_persona+","+nombre+","+apellido+","+telefono+","+direccion+","+correo+")";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int id_persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int id_persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int id_persona, String nombre, String apellido, int telefono, String direccion, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}