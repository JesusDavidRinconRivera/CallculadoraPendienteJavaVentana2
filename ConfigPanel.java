package CalcPendiente;
import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JFrame {
    private JPanel panelVerde;
    public ConfigPanel() {
        JPanel panelVerde = new JPanel();
        this.getContentPane().add(panelVerde);
        panelVerde.setBackground(Color.GREEN);
    }

}