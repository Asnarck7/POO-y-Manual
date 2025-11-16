package logica; // Indica que esta clase pertenece al paquete 'logica'

import javax.swing.*; // Importa las clases necesarias para crear interfaces gráficas (Swing)
import java.awt.*;    // Importa clases para manejo de colores, fuentes, y diseño gráfico

public class Conversor {

    // Método principal que muestra la ventana del conversor
    public void mostrarInterfazConversor() {
        // Crea una ventana de diálogo modal (bloquea la ventana principal hasta cerrarla)
        JDialog dialog = new JDialog((Frame) null, "Conversor", true);
        dialog.setSize(420, 350);                     // Tamaño de la ventana
        dialog.setLayout(null);                       // Desactiva el layout automático (posicionamiento manual)
        dialog.setLocationRelativeTo(null);           // Centra la ventana en la pantalla
        dialog.getContentPane().setBackground(new Color(250, 250, 255)); // Color de fondo

        // Título principal del conversor
        JLabel lblTitulo = new JLabel("💱 CONVERSOR", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));   // Tipo y tamaño de letra
        lblTitulo.setBounds(50, 20, 300, 30);                     // Posición y tamaño
        lblTitulo.setForeground(new Color(70, 70, 160));          // Color del texto
        dialog.add(lblTitulo);                                   // Se agrega el componente a la ventana

        // Lista desplegable con las opciones de conversión
        String[] opciones = {
            "Celsius → Fahrenheit",
            "Fahrenheit → Celsius",
            "Dólares → Pesos",
            "Pesos → Dólares"
        };
        JComboBox<String> cmbOpciones = new JComboBox<>(opciones);
        cmbOpciones.setBounds(70, 70, 270, 25); // Ubicación y tamaño del combo
        dialog.add(cmbOpciones);

        // Campo de texto para ingresar el valor a convertir
        JTextField txtValor = new JTextField();
        txtValor.setBounds(70, 110, 270, 25);
        dialog.add(txtValor);

        // Botón para ejecutar la conversión
        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(130, 150, 150, 30);
        btnConvertir.setBackground(new Color(100, 180, 255)); // Color del botón
        btnConvertir.setForeground(Color.WHITE);               // Color del texto
        dialog.add(btnConvertir);

        // Campo de texto para mostrar el resultado
        JTextField txtResultado = new JTextField();
        txtResultado.setBounds(130, 200, 150, 30);
        txtResultado.setEditable(false);                       // Evita que el usuario lo modifique
        txtResultado.setHorizontalAlignment(JTextField.CENTER); // Centra el texto
        dialog.add(txtResultado);

        // Acción del botón "Convertir" al hacer clic
        btnConvertir.addActionListener(e -> {
            try {
                // Obtiene el valor ingresado y lo convierte a número
                double valor = Double.parseDouble(txtValor.getText());
                // Obtiene el tipo de conversión seleccionada
                String tipo = (String) cmbOpciones.getSelectedItem();
                double resultado = 0;

                // Estructura condicional que realiza la conversión según el tipo
                switch (tipo) {
                    case "Celsius → Fahrenheit":
                        resultado = (valor * 9 / 5) + 32;
                        break;
                    case "Fahrenheit → Celsius":
                        resultado = (valor - 32) * 5 / 9;
                        break;
                    case "Dólares → Pesos":
                        resultado = valor * 4200; // Tasa de cambio estimada
                        break;
                    case "Pesos → Dólares":
                        resultado = valor / 4200;
                        break;
                }

                // Muestra el resultado formateado con 2 decimales
                txtResultado.setText(String.format("%.2f", resultado));
            } catch (NumberFormatException ex) {
                // Muestra mensaje de error si el valor ingresado no es numérico
                JOptionPane.showMessageDialog(dialog, "Ingrese un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Botón para cerrar la ventana del conversor
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBounds(150, 250, 100, 30);
        btnCerrar.setBackground(new Color(255, 120, 120));
        btnCerrar.setForeground(Color.WHITE);
        btnCerrar.addActionListener(e -> dialog.dispose()); // Cierra el diálogo
        dialog.add(btnCerrar);

        // Muestra la ventana del conversor
        dialog.setVisible(true);
    }
}
