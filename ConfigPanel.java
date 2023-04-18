package CalcPendiente;
import javax.swing.*;
import java.awt.*;
//Clase que crea los paneles con nombres de colores 
public class ConfigPanel extends JFrame {
    private JPanel panelVerde;
    public ConfigPanel() {
        panelVerde = new JPanel(new GridBagLayout());
        panelAzul = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        panelVerde.setBackground(Color.GREEN);
        panelAzul.setBackground(Color.BLUE);

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.getContentPane().add(panelVerde, gbc);

        gbc.gridx = 1;
        this.getContentPane().add(panelAzul, gbc);
    }

}