
package ico.fes.db;

import ico.fes.herencia.Persona;

import java.util.ArrayList;
import org.sqlite.SQLiteException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author die_e
 */
public class personaDAO implements IntefazDao{

    public personaDAO() {
    }

    @Override
    public ArrayList obtenerTodo() throws SQLiteException {
        ArrayList<Persona> info = new ArrayList<Persona>();
        Statement stm = (Statement) BaseDeDatos.getInstance().getConexion().createStatement();
        try {
            ResultSet rst = stm.executeQuery("SELECT *FROM persona;");
            while (rst.next()) {
                info.add(new Persona(rst.getString(1), rst.getInt(2)));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
                {
                    return info;
                }
       
        
        
        
        
        
    @Override
    public boolean insertar(Object o) throws SQLiteException {
        boolean respuesta false;
        Persona p =(Persona)o;
                ;
        String sql = " INSERT UNTO persona VALUES(?,?)";
            try {
                PreparedStatement pstm= BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
                pstm.setString(0, p.setNombre());
                pstm.setString(1,p.getEdad());
                int rowCount =pstm.executeUpdate()
                respuesta = rowConunt ==1? true:false;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    
        return respuesta;
        
    }
        

    @Override
    public boolean eliminar(String n) throws SQLiteException {
        return true;
    }
    
    
}

    public void insertar(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }