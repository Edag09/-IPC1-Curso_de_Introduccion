package DragDrop;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Ventana_a_manita extends JFrame {

    private JButton Boton1, Boton2;
    private JLabel texto1, texto2, texto3;
    private JTextArea area1, area2, area3;
    private Container lienzo;
    JPanel panelito;

    public Ventana_a_manita(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tablero");
        this.setBounds(300, 130, 750, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
    
        Boton1 = new JButton("Ingresar");
        
    }

}
