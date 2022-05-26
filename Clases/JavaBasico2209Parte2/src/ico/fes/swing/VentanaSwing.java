
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VentanaSwing extends JFrame{
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox <Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;
    

    public VentanaSwing() throws HeadlessException {
        setTitle("CONVERSION DE °C a °F");
        setSize(300, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+ "\\src\\ico\\fes\\swing\\carro.png");
        boton = new JButton(icono);
        //boton.setBackground(Color.CYAN);
        boton.setOpaque(true);
        boton.setToolTipText("CONVERTR EN °F");
        resultado = new JLabel("°F");
        lista = new JComboBox();
        texto = new JTextArea(10,10);
        
      /*  lista .addItem("Ingenieria");
        lista .addItem("Derecho");
        lista .addItem("Periodismo");
        lista .addItem("Arquiternura");*/
      
      modelo = new ModeloPersonaCombo();
      modelo.consultarBaseDatos();
      lista.setModel(modelo);
      
      
        
        this.getContentPane().add(cuadro);
         this.getContentPane().add(boton);
         this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        this.validate();
        this.setVisible(true);
        
        
        
            
            this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            });
            this.lista.addItemListener(new ItemAdapter(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("evento..."+ ie.getItem());
                texto.setText(ie.getItem()+ "\n");
            }
                
      
                
            });
            this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celsius = 0.f;
                try {
                    celsius = Float.parseFloat(cuadro.getText());
                    gradosFarenheit = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + "°F");
                } catch (Exception ex) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null,  "Introduce un error numerico", "Captura Incorrecta", JOptionPane.ERROR_MESSAGE);
                    
                }
            }

            });
    }
}
