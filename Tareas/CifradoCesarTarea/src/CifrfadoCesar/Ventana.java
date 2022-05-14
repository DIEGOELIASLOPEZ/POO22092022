package CifrfadoCesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.Buffer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel TipoDesplazamiento, IngresaNumero, MensajeCifrado, espacio, espacio2;

    private JTextField cuadro1, cuadro2, cuadro3;

    private JButton boton;
    int numero;

    public Ventana() throws HeadlessException {
        setTitle("CIFRADO CÉSAR");
        setSize(400, 400);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        TipoDesplazamiento = new JLabel("Tipo de desplazamiento");

        cuadro1 = new JTextField(20);
        
        IngresaNumero = new JLabel("Ingrese un mensaje:      ");
        cuadro2 = new JTextField(20);
        
        espacio2 = new JLabel("                                               ");
        espacio = new JLabel("                                                                                                                            ");
        MensajeCifrado = new JLabel("Mensaje Cifrado:            ");
        cuadro3 = new JTextField(20);
        
        
        boton = new JButton("Cifrar");
        this.getContentPane().add(TipoDesplazamiento);
        this.getContentPane().add(cuadro1);
        this.getContentPane().add(IngresaNumero);
        this.getContentPane().add(cuadro2);
         this.getContentPane().add(espacio2);
        this.getContentPane().add(boton);
         this.getContentPane().add(espacio);
        this.getContentPane().add(MensajeCifrado);
        this.getContentPane().add(cuadro3);
        // this.getContentPane().add(cuadro2);
        //this.getContentPane().add(boton);

        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() { 
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        
        
           
       });
        
       this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numero = Integer.parseInt(cuadro1.getText());
                String clave = cuadro2.getText();
                
                char letras[]=clave.toCharArray();
                for (int i = 0; i < letras.length; i++) {
                    letras[i] = (char)(letras[i] + (char)numero); //clave numerofinal
                }
                String crip = String.valueOf(letras);
                cuadro3.setText(crip);
            }
           
       });
       
    }

}
