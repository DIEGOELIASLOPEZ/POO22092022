
package ico.fes.modelo;

import ico.fes.db.personaDAO;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import ico.fes.herencia.Persona;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;

/**
 *
 * @author die_e
 */
public class ModeloPersonaCombo  implements ComboBoxModel<Persona>{
    private ArrayList <Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }


    public void consultarBaseDatos(){
    datos =new ArrayList<Persona>();
    datos.add(new Persona("Jose",19));
    datos.add(new Persona("Maria",19));
    datos.add(new Persona("Jesus",19));
    datos.add(new Persona("Diana",19));
    
        
    }

    public void agregarPersona(Persona p){
        datos.add(p);
    }
    @Override
    public void setSelectedItem(Object o) {
         this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
         //simular una consulta a una bd
        personaDAO pdao=new personaDAO();
        
        try {
            datos=pdao.obtenerTodo();
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
public  void  agregarPersona(Persona p){
        personaDAO pdao = new personaDAO();
        datos.add(p);
        try {
            pdao.insertar(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
  


    
            
    
}
