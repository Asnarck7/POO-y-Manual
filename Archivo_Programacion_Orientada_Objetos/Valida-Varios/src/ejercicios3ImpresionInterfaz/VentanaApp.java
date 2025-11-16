package ejercicios3ImpresionInterfaz;

import java.awt.*;
import javax.swing.*;

public class VentanaApp extends JFrame {
    private static final long serialVersionUID = 1L; // evita warning
    private JTextField txtA, txtB, txtResultado;
    private JButton btnSumar, btnLimpiar, btnSalir;
    private JLabel lblTitulo;

    public VentanaApp() {
        setTitle("💻 Calculadora Visual - Proyecto Java");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 245, 255));

        lblTitulo = new JLabel("Calculadora Visual");
        lblTitulo.setBounds(100, 20, 250, 30);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setForeground(new Color(50, 50, 150));
        add(lblTitulo);

        JLabel lblA = new JLabel("Número A:");
        lblA.setBounds(50, 80, 100, 25);
        add(lblA);
        txtA = new JTextField();
        txtA.setBounds(150, 80, 180, 25);
        add(txtA);

        JLabel lblB = new JLabel("Número B:");
        lblB.setBounds(50, 120, 100, 25);
        add(lblB);
        txtB = new JTextField();
        txtB.setBounds(150, 120, 180, 25);
        add(txtB);

        JLabel lblRes = new JLabel("Resultado:");
        lblRes.setBounds(50, 160, 100, 25);
        add(lblRes);
        txtResultado = new JTextField();
        txtResultado.setBounds(150, 160, 180, 25);
        txtResultado.setEditable(false);
        txtResultado.setBackground(new Color(230, 230, 250));
        add(txtResultado);

        btnSumar = new JButton("➕ Sumar");
        btnSumar.setBounds(50, 210, 120, 30);
        btnSumar.setBackground(new Color(100, 180, 255));
        btnSumar.setForeground(Color.WHITE);
        btnSumar.setFocusPainted(false);
        btnSumar.addActionListener(e -> sumar());
        add(btnSumar);

        btnLimpiar = new JButton("🧹 Limpiar");
        btnLimpiar.setBounds(190, 210, 120, 30);
        btnLimpiar.setBackground(new Color(255, 180, 80));
        btnLimpiar.setForeground(Color.WHITE);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(e -> limpiar());
        add(btnLimpiar);

        btnSalir = new JButton("🚪 Salir");
        btnSalir.setBounds(130, 260, 120, 30);
        btnSalir.setBackground(new Color(255, 90, 90));
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);
    }

    private void sumar() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double resultado = a + b;
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "❌ Ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        txtA.setText("");
        txtB.setText("");
        txtResultado.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaApp().setVisible(true));
    }
}
