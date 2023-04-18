package CalcPendiente;

import java.awt.*;
import javax.swing.*;

public class ConfigVentana extends JFrame {
    public JPanel panelGeneral, panelVerde, panelAzul;
    public JButton btnCalcular;
    Dimension Tamaño = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();

    public ConfigVentana() {
        setVisible(true);
        setSize(Tamaño);
        setLocationRelativeTo(null);
        setTitle("Calculadora de Pendiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // panelVerde = new ConfigPanel();
        Paneles();
        Etiquetas();
        Botones();
    }
    public void Paneles() {
        panelGeneral = new JPanel(new GridBagLayout());
        panelVerde = new JPanel();
        panelAzul = new JPanel();

        panelVerde.setBackground(Color.GREEN);
        panelAzul.setBackground(Color.BLUE);
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
    public void Etiquetas() {

        Font fuente = new Font("Arial", Font.BOLD, 36);
        JLabel Calcular = new JLabel("Calcular");
        Calcular.setFont(fuente);
        Calcular.setForeground(Color.WHITE);
        panelAzul.add(Calcular);
    }
    public void Botones() {
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 400, 390, 70);
        panelVerde.add(btnCalcular);
    }

}