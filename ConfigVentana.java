package CalcPendiente;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConfigVentana extends JFrame {
    public JPanel panelGeneral, panelVerde, panelAzul, panelRojo;
    public JButton btnCalcular;
    public JTextField X1, Y1, X2, Y2;
    public JLabel Calcular;
    double x1 = 0, y1 = 0, x2 = 0, y2 = 0, pendiente = 0;
    Dimension Tamaño = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();

    public ConfigVentana() {
        setVisible(true);
        setSize(Tamaño);
        // setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Calculadora de Pendiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // panelVerde = new ConfigPanel();
        Paneles();
        Etiquetas();
        Botones();
       // Cajas();
    }

    public void Paneles() {
        panelGeneral = new JPanel(null);
        panelVerde = new JPanel(null);
        panelAzul = new JPanel(null);
        panelRojo = new JPanel(null);
        panelVerde.setBackground(Color.GREEN);
        panelAzul.setBackground(Color.BLUE);
        panelRojo.setBackground(Color.RED);
        panelVerde.setBounds(0, 0, (int)(Tamaño.getWidth() * 0.2), (int)Tamaño.getHeight());
        panelRojo.setBounds((int)(Tamaño.getWidth() * 0.2), 0, (int)(Tamaño.getWidth() * 0.8), (int)(Tamaño.getHeight()*0.2));
        panelAzul.setBounds((int)(Tamaño.getWidth() * 0.2), (int)(Tamaño.getHeight()*0.2), (int)(Tamaño.getWidth() * 0.8), (int)(Tamaño.getHeight()*0.8));
        panelGeneral.add(panelVerde);
        panelGeneral.add(panelAzul);
        panelGeneral.add(panelRojo);
        this.getContentPane().add(panelGeneral);
    }

    public void Etiquetas() {
        Font fuente = new Font("Arial", Font.BOLD, 36);
        Calcular = new JLabel("Pendiente: ");
        Calcular.setBounds(10, 4, 390, 70);
        Calcular.setFont(fuente);
        Calcular.setForeground(Color.WHITE);
        panelAzul.add(Calcular);
    }

    public void Botones() {
        JButton btnCalcular = new JButton("Calcular");
        panelVerde.setLayout(null);
        btnCalcular.setBounds(10, 4, 390, 70);
        panelVerde.add(btnCalcular);
    
        // Crear variables para guardar los valores de x1, y1, x2, y2 y la pendiente
        JTextField X1 = new JTextField();
        JTextField Y1 = new JTextField();
        JTextField X2 = new JTextField();
        JTextField Y2 = new JTextField();

        X1.setBounds(40, 80, 40, 20);
        Y1.setBounds(40, 120, 40, 20);
        X2.setBounds(40, 160, 40, 20);
        Y2.setBounds(40, 200, 40, 20);
    
        // Asignar un tamaño a las cajas de texto
      
    
        // Crear etiquetas para los campos de texto
        JLabel lblX1 = new JLabel("X1:");
        lblX1.setBounds(10, 80, 40, 20);
        JLabel lblY1 = new JLabel("Y1:");
        lblY1.setBounds(10, 120, 40, 20);
        JLabel lblX2 = new JLabel("X2:");
        lblX2.setBounds(10, 160, 40, 20);
        JLabel lblY2 = new JLabel("Y2:");
        lblY2.setBounds(10, 200, 40, 20);
    
        // Añadir los componentes al panel verde
        panelVerde.add(lblX1);
        panelVerde.add(X1);
        panelVerde.add(lblY1);
        panelVerde.add(Y1);
        panelVerde.add(lblX2);
        panelVerde.add(X2);
        panelVerde.add(lblY2);
        panelVerde.add(Y2);
    
        // Crear objeto ActionListener que se encargará del cálculo de la pendiente y guardar los datos
        ActionListener calcularPendiente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                try {
                    x1 = Double.parseDouble(X1.getText());
                    y1 = Double.parseDouble(Y1.getText());
                    x2 = Double.parseDouble(X2.getText());
                    y2 = Double.parseDouble(Y2.getText());
    
                    // Calcular la pendiente
                    pendiente = (y2 - y1) / (x2 - x1);
    
                    // Imprimir la pendiente en la etiqueta correspondiente
                    Calcular.setText("Pendiente: " + pendiente);
    
                } catch (NumberFormatException ex) {
                    // Si hay un error al convertir los valores, imprimir un mensaje de error
                    Calcular.setText("Error: Ingresa valores numéricos");
                }
            }
        };
    
        // Asignar el ActionListener al botón "Calcular"
        btnCalcular.addActionListener(calcularPendiente);
        panelVerde.add(btnCalcular);
    }
    

    public void Cajas() {
        JTextField X1 = new JTextField();
        JTextField Y1 = new JTextField();
        JTextField X2 = new JTextField();
        JTextField Y2 = new JTextField();
        X1.setBounds(10, 80, 40, 20);
        Y1.setBounds(10, 80, 40, 20);
        X2.setBounds(10, 80, 40, 20);
        Y2.setBounds(10, 80, 40, 20);
        panelVerde.add(X1);
        panelVerde.add(Y1);
        panelVerde.add(X2);
        panelVerde.add(Y2);

    }
}