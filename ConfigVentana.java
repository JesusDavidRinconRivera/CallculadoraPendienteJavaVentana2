package CalcPendiente;

import java.awt.*;
import javax.swing.*;

public class ConfigVentana extends JFrame {
    private JPanel panelGeneral,panelVerde,panelAzul;
    Dimension Tamaño = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();

    public ConfigVentana() {
        setVisible(true);
        setSize(Tamaño);
        setLocationRelativeTo(null);
        setTitle("Calculadora de Pendiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // panelVerde = new ConfigPanel();
        Paneles();
    }

    private void Paneles(){
        panelGeneral = new JPanel(new GridBagLayout());
        panelVerde = new JPanel();
        panelAzul = new JPanel();
    
        panelVerde.setBackground(Color.GREEN);
        panelAzul.setBackground(Color.BLUE);
    
        JLabel Calcular = new JLabel("Calcular");
        panelAzul.add(Calcular);
    
        // definir las restricciones de panelVerde
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 1;
        gbc.weightx = 0.2;
        gbc.weighty = 0.8;
        panelGeneral.add(panelVerde, gbc);
    
        // definir las restricciones de panelAzul
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        panelGeneral.add(panelAzul, gbc);
    
        this.getContentPane().add(panelGeneral);
    }
    
    
}