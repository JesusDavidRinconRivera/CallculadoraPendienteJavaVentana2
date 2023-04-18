package CalcPendiente;

import java.awt.*;
import javax.swing.*;

public class ConfigVentana extends JFrame {
    Dimension Tamaño = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();
    
    public ConfigVentana() {
        setVisible(true);
        setSize(Tamaño);
        setLocationRelativeTo(null);
        setTitle("Calculadora de Pendiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConfigPanel Paneles = new ConfigPanel(); 
    }

    private void Componentes(){
        
            JPanel panelVerde = new JPanel();
            this.getContentPane().add(panelVerde);
            panelVerde.setBackground(Color.GREEN);
        }
    }

