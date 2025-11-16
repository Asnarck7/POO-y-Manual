package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import logica.Conversor;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtNum1, txtNum2, txtResultado;
    private JComboBox<String> cmbOperacion;
    private Conversor conversor;

    public Main() {
        conversor = new Conversor();

        // === CONFIGURACIÓN PRINCIPAL ===
        setTitle("Calculadora Dinámica");
        setSize(600, 450); // Ventana más grande
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Fondo con color suave
        getContentPane().setBackground(new Color(235, 240, 255));

        // === TÍTULO PRINCIPAL ===
        JLabel lblTitulo = new JLabel("CALCULADORA DINÁMICA", SwingConstants.CENTER);
        lblTitulo.setBounds(80, 30, 440, 40);
        lblTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(30, 50, 130));
        add(lblTitulo);

        // === BOTONES PRINCIPALES ===
        JButton btnCalc = crearBoton("Calculadora Básica", new Color(90, 160, 255));
        btnCalc.setBounds(150, 120, 300, 45);
        btnCalc.addActionListener(e -> mostrarCalculadora());
        add(btnCalc);

        JButton btnConv = crearBoton("Conversor (Moneda / Temperatura)", new Color(255, 170, 70));
        btnConv.setBounds(150, 185, 300, 45);
        btnConv.addActionListener(e -> conversor.mostrarInterfazConversor());
        add(btnConv);

        JButton btnSalir = crearBoton("Salir", new Color(240, 90, 90));
        btnSalir.setBounds(230, 300, 140, 40);
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);

        // === ETIQUETA DE PIE DE PÁGINA ===
        JLabel lblFooter = new JLabel("Desarrollado por el equipo de programación", SwingConstants.CENTER);
        lblFooter.setBounds(100, 370, 400, 25);
        lblFooter.setForeground(new Color(70, 70, 70));
        lblFooter.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        add(lblFooter);
    }

    // === MÉTODO PARA CREAR BOTONES ESTILIZADOS ===
    private JButton crearBoton(String texto, Color colorBase) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setForeground(Color.WHITE);
        boton.setBackground(colorBase);
        boton.setBorderPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setOpaque(true);

        // Efecto hover para interactividad visual
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(colorBase.darker());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(colorBase);
            }
        });

        return boton;
    }

    // === INTERFAZ DE LA CALCULADORA BÁSICA ===
    private void mostrarCalculadora() {
        JDialog calcDialog = new JDialog(this, "Calculadora Básica", true);
        calcDialog.setSize(420, 320);
        calcDialog.setLayout(null);
        calcDialog.setLocationRelativeTo(this);
        calcDialog.getContentPane().setBackground(new Color(245, 250, 255));

        // Etiquetas y campos de entrada
        JLabel lbl1 = new JLabel("Número A:");
        lbl1.setBounds(50, 50, 100, 25);
        calcDialog.add(lbl1);

        txtNum1 = new JTextField();
        txtNum1.setBounds(150, 50, 200, 25);
        calcDialog.add(txtNum1);

        JLabel lbl2 = new JLabel("Número B:");
        lbl2.setBounds(50, 90, 100, 25);
        calcDialog.add(lbl2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(150, 90, 200, 25);
        calcDialog.add(txtNum2);

        // Combo para seleccionar operación
        cmbOperacion = new JComboBox<>(new String[]{"+ Sumar", "- Restar", "× Multiplicar", "÷ Dividir"});
        cmbOperacion.setBounds(50, 130, 300, 30);
        calcDialog.add(cmbOperacion);

        // Botón calcular
        JButton btnCalcular = crearBoton("Calcular", new Color(100, 200, 120));
        btnCalcular.setBounds(140, 180, 140, 35);
        btnCalcular.addActionListener(e -> calcularOperacion());
        calcDialog.add(btnCalcular);

        // Campo de resultado
        txtResultado = new JTextField();
        txtResultado.setBounds(140, 230, 140, 35);
        txtResultado.setEditable(false);
        txtResultado.setHorizontalAlignment(JTextField.CENTER);
        txtResultado.setFont(new Font("Segoe UI", Font.BOLD, 14));
        txtResultado.setBackground(new Color(225, 230, 250));
        calcDialog.add(txtResultado);

        calcDialog.setVisible(true);
    }

    // === LÓGICA DE OPERACIONES ===
    private void calcularOperacion() {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            String op = (String) cmbOperacion.getSelectedItem();
            double resultado = 0;

            switch (op.charAt(0)) {
                case '+': resultado = num1 + num2; break;
                case '-': resultado = num1 - num2; break;
                case '×': resultado = num1 * num2; break;
                case '÷':
                    if (num2 == 0) throw new ArithmeticException("No se puede dividir por cero");
                    resultado = num1 / num2;
                    break;
            }

            txtResultado.setText(String.format("%.2f", resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // === MÉTODO PRINCIPAL ===
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
