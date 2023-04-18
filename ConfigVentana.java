package CalcPendiente;

import java.awt.*;
import javax.swing.*;

public class ConfigVentana extends JFrame {
    Dimension screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();

    public ConfigVentana() {
        setVisible(true);
        setSize(screenSize);
        setLocationRelativeTo(null);
        setTitle("Calculadora de Pendiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}