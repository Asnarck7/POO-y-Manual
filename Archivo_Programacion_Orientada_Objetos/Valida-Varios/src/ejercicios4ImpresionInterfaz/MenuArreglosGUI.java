package ejercicios4ImpresionInterfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * Programa GUI en Java que gestiona un arreglo de enteros.
 * Permite adicionar, listar, buscar, invertir, eliminar y llenar aleatoriamente el arreglo.
 * 
 * Autor: GUERRERO WARS
 */
public class MenuArreglosGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    // --- Variables principales del arreglo ---
    private int[] arreglo;
    private int pos;
    private final int TAM = 10;

    // --- Componentes visuales ---
    private DefaultListModel<Integer> modeloLista;
    private JList<Integer> lista;
    private JTextField txtNumero;
    private JLabel lblEstado;

    // --- Constructor ---
    public MenuArreglosGUI() {
        arreglo = new int[TAM];
        pos = 0;

        // --- Configuración básica de ventana ---
        setTitle("Gestor de Arreglos");
        setSize(700, 560); // Tamaño más grande
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(240, 245, 255));

        // --- Título principal ---
        JLabel lblTitulo = new JLabel("GESTOR DE ARREGLOS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitulo.setForeground(new Color(30, 60, 140));
        lblTitulo.setBounds(100, 20, 500, 40);
        add(lblTitulo);

        // --- Lista visual para mostrar el arreglo ---
        modeloLista = new DefaultListModel<>();
        lista = new JList<>(modeloLista);
        lista.setFont(new Font("Consolas", Font.PLAIN, 16));
        lista.setBackground(Color.WHITE);
        lista.setBorder(BorderFactory.createLineBorder(new Color(180, 200, 255), 1));

        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(50, 90, 220, 320);
        scroll.setBorder(BorderFactory.createTitledBorder("Contenido del arreglo"));
        add(scroll);

        // --- Campo de entrada ---
        JLabel lblNumero = new JLabel("Ingrese un número:");
        lblNumero.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblNumero.setBounds(320, 90, 200, 25);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(320, 120, 280, 35);
        txtNumero.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtNumero.setBorder(BorderFactory.createLineBorder(new Color(180, 200, 255), 1));
        add(txtNumero);

        // --- Creación y ubicación de botones ---
        int y = 180;
        int h = 35;
        int w = 280;

        JButton btnAdd = crearBoton("Adicionar", new Color(70, 160, 255));
        btnAdd.setBounds(320, y, w, h);
        btnAdd.addActionListener(e -> adicionar());
        add(btnAdd);

        y += 45;
        JButton btnListar = crearBoton("Listar", new Color(90, 190, 120));
        btnListar.setBounds(320, y, w, h);
        btnListar.addActionListener(e -> listar());
        add(btnListar);

        y += 55;
        JButton btnBuscar = crearBoton("Buscar", new Color(255, 190, 80));
        btnBuscar.setBounds(320, y, w, h);
        btnBuscar.addActionListener(e -> buscar());
        add(btnBuscar);

        y += 55;
        JButton btnInvertir = crearBoton("Invertir", new Color(150, 130, 255));
        btnInvertir.setBounds(320, y, w, h);
        btnInvertir.addActionListener(e -> invertir());
        add(btnInvertir);

        y += 55;
        JButton btnEliminar = crearBoton("Eliminar", new Color(255, 140, 90));
        btnEliminar.setBounds(320, y, w, h);
        btnEliminar.addActionListener(e -> eliminar());
        add(btnEliminar);

        y += 55;
        JButton btnAleatorio = crearBoton("Llenar Aleatorio", new Color(100, 200, 255));
        btnAleatorio.setBounds(320, y, w, h);
        btnAleatorio.addActionListener(e -> llenarAleatorio());
        add(btnAleatorio);

        // --- Etiqueta de estado (mensajes) ---
        lblEstado = new JLabel("Arreglo vacío", SwingConstants.CENTER);
        lblEstado.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblEstado.setBounds(150, 485, 400, 25);
        lblEstado.setForeground(Color.BLACK); // Texto negro
        add(lblEstado);

        // --- Botón salir más abajo ---
        JButton btnSalir = crearBoton("Salir", new Color(230, 80, 80));
        btnSalir.setBounds(270, 510, 140, 40);
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);

        // --- Permitir presionar Enter para adicionar ---
        txtNumero.addActionListener(e -> adicionar());
    }

    /**
     * Crea un botón con estilo moderno y animación de hover
     */
    private JButton crearBoton(String texto, Color colorBase) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        boton.setForeground(Color.WHITE);
        boton.setBackground(colorBase);
        boton.setBorderPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(colorBase.darker());
            }
            public void mouseExited(MouseEvent e) {
                boton.setBackground(colorBase);
            }
        });
        return boton;
    }

    /**
     * Agrega un nuevo número al arreglo (si hay espacio)
     */
    private void adicionar() {
        if (pos >= TAM) {
            JOptionPane.showMessageDialog(this, "El arreglo está lleno (" + TAM + " elementos).");
            return;
        }
        try {
            int valor = Integer.parseInt(txtNumero.getText());
            arreglo[pos++] = valor;
            txtNumero.setText("");
            lblEstado.setText("Elemento agregado: " + valor);
            listar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        }
    }

    /**
     * Muestra los elementos del arreglo en la lista
     */
    private void listar() {
        modeloLista.clear();
        for (int i = 0; i < pos; i++) {
            modeloLista.addElement(arreglo[i]);
        }
        lblEstado.setText("Total elementos: " + pos);
    }

    /**
     * Busca un número dentro del arreglo
     */
    private void buscar() {
        if (pos == 0) {
            JOptionPane.showMessageDialog(this, "No hay elementos para buscar.");
            return;
        }
        String input = JOptionPane.showInputDialog(this, "Ingrese número a buscar:");
        if (input == null || input.isEmpty()) return;
        try {
            int n = Integer.parseInt(input);
            for (int i = 0; i < pos; i++) {
                if (arreglo[i] == n) {
                    JOptionPane.showMessageDialog(this, "Encontrado en la posición: " + i);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró el número " + n);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida. Debe ser un número.");
        }
    }

    /**
     * Invierte el orden de los elementos del arreglo
     */
    private void invertir() {
        if (pos == 0) {
            JOptionPane.showMessageDialog(this, "No hay elementos para invertir.");
            return;
        }
        for (int i = 0; i < pos / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[pos - 1 - i];
            arreglo[pos - 1 - i] = temp;
        }
        listar();
        lblEstado.setText("Arreglo invertido.");
    }

    /**
     * Elimina un número del arreglo
     */
    private void eliminar() {
        if (pos == 0) {
            JOptionPane.showMessageDialog(this, "No hay elementos para eliminar.");
            return;
        }
        String input = JOptionPane.showInputDialog(this, "Ingrese número a eliminar:");
        if (input == null || input.isEmpty()) return;
        try {
            int n = Integer.parseInt(input);
            boolean encontrado = false;
            for (int i = 0; i < pos; i++) {
                if (arreglo[i] == n) {
                    encontrado = true;
                    for (int j = i; j < pos - 1; j++) {
                        arreglo[j] = arreglo[j + 1];
                    }
                    pos--;
                    break;
                }
            }
            if (encontrado) {
                listar();
                lblEstado.setText("Elemento eliminado: " + n);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el número " + n);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida. Debe ser un número.");
        }
    }

    /**
     * Llena el arreglo con números aleatorios
     */
    private void llenarAleatorio() {
        Random rand = new Random();
        pos = TAM;
        for (int i = 0; i < TAM; i++) {
            arreglo[i] = rand.nextInt(100) + 1;
        }
        listar();
        lblEstado.setText("Arreglo llenado aleatoriamente.");
    }

    /**
     * Método principal: inicia la interfaz
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuArreglosGUI().setVisible(true));
    }
}
