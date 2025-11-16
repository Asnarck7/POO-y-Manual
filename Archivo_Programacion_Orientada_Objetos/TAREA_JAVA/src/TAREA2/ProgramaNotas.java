package TAREA2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class ProgramaNotas extends JFrame {

	/*Kevin Julián Guerrero Penagos	ID 821270
	Carlos Jhoan Calderón Falla          ID 931012
	Emanuel Rincón Sierra 			ID 938723 
	 */
    private static final long serialVersionUID = 1L;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private JTextArea areaMostrar;
    private final String ARCHIVO = "estudiantes.txt"; // 💾 Archivo donde se guardan los datos

    public ProgramaNotas() {
        // === CONFIGURACIÓN PRINCIPAL ===
        setTitle("Programa de Notas - Tarea 2");
        setSize(650, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(235, 240, 255));

        // === CARGAR DATOS EXISTENTES ===
        cargarDesdeArchivo();

        // === TÍTULO ===
        JLabel lblTitulo = new JLabel("PROGRAMA DE NOTAS", SwingConstants.CENTER);
        lblTitulo.setBounds(100, 30, 440, 40);
        lblTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 26));
        lblTitulo.setForeground(new Color(30, 50, 130));
        add(lblTitulo);

        // === BOTONES ===
        JButton btnAgregar = crearBoton("Registrar Estudiante", new Color(90, 160, 255));
        btnAgregar.setBounds(60, 100, 240, 45);
        btnAgregar.addActionListener(e -> registrarEstudiante());
        add(btnAgregar);

        JButton btnMostrar = crearBoton("Mostrar Estudiantes", new Color(255, 170, 70));
        btnMostrar.setBounds(340, 100, 240, 45);
        btnMostrar.addActionListener(e -> mostrarEstudiantes());
        add(btnMostrar);

        JButton btnOrdenar = crearBoton("Ordenar por Nota", new Color(100, 200, 120));
        btnOrdenar.setBounds(60, 160, 240, 45);
        btnOrdenar.addActionListener(e -> ordenarPorBurbuja());
        add(btnOrdenar);

        JButton btnBuscar = crearBoton("Buscar por Código", new Color(200, 150, 255));
        btnBuscar.setBounds(340, 160, 240, 45);
        btnBuscar.addActionListener(e -> buscarBinario());
        add(btnBuscar);

        JButton btnSalir = crearBoton("Salir", new Color(240, 90, 90));
        btnSalir.setBounds(250, 400, 140, 40);
        btnSalir.addActionListener(e -> {
            guardarEnArchivo(); // 💾 Guarda antes de salir
            System.exit(0);
        });
        add(btnSalir);

        // === ÁREA DE RESULTADOS ===
        areaMostrar = new JTextArea();
        areaMostrar.setEditable(false);
        areaMostrar.setFont(new Font("Consolas", Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(areaMostrar);
        scroll.setBounds(60, 230, 520, 150);
        add(scroll);
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

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { boton.setBackground(colorBase.darker()); }
            @Override
            public void mouseExited(MouseEvent e) { boton.setBackground(colorBase); }
        });
        return boton;
    }

    // === REGISTRAR ESTUDIANTE ===
    private void registrarEstudiante() {
        try {
            String codigo = JOptionPane.showInputDialog(this, "Ingrese código del estudiante:");
            if (codigo == null || codigo.trim().isEmpty()) return;

            for (Estudiante e : estudiantes) {
                if (e.getCodigo().equalsIgnoreCase(codigo)) {
                    JOptionPane.showMessageDialog(this, "⚠️ Código repetido. Intente con otro.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            String nombre = JOptionPane.showInputDialog(this, "Ingrese nombre del estudiante:");
            if (nombre == null || nombre.trim().isEmpty()) return;

            double n1 = pedirNota("Ingrese Nota 1 (30%)");
            double n2 = pedirNota("Ingrese Nota 2 (30%)");
            double n3 = pedirNota("Ingrese Nota 3 (40%)");

            Estudiante nuevo = new Estudiante(codigo, nombre, n1, n2, n3);
            estudiantes.add(nuevo);
            guardarEnArchivo(); // 💾 Guarda automáticamente
            JOptionPane.showMessageDialog(this, "✅ Estudiante registrado correctamente.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar: " + ex.getMessage());
        }
    }

    // === VALIDAR NOTAS ===
    private double pedirNota(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(this, mensaje);
                if (input == null) throw new Exception("Cancelado");
                double nota = Double.parseDouble(input);
                if (nota < 0 || nota > 5) throw new Exception("La nota debe estar entre 0 y 5");
                return nota;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "⚠️ Valor inválido. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // === MOSTRAR ESTUDIANTES ===
    private void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay estudiantes registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-15s %-8s %-8s %-8s %-8s%n", "Código", "Nombre", "N1", "N2", "N3", "Def"));
        sb.append("---------------------------------------------------------------\n");

        for (Estudiante e : estudiantes) {
            sb.append(String.format("%-10s %-15s %-8.2f %-8.2f %-8.2f %-8.2f%n",
                    e.getCodigo(), e.getNombre(), e.getNota1(), e.getNota2(), e.getNota3(), e.getDefinitiva()));
        }

        areaMostrar.setText(sb.toString());
    }

    // === ORDENAR POR BURBUJA ===
    private void ordenarPorBurbuja() {
        if (estudiantes.size() < 2) return;

        for (int i = 0; i < estudiantes.size() - 1; i++) {
            for (int j = 0; j < estudiantes.size() - 1 - i; j++) {
                if (estudiantes.get(j).getDefinitiva() > estudiantes.get(j + 1).getDefinitiva()) {
                    Estudiante temp = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j + 1));
                    estudiantes.set(j + 1, temp);
                }
            }
        }

        guardarEnArchivo(); // 💾 Guarda al ordenar
        JOptionPane.showMessageDialog(this, "✅ Estudiantes ordenados por nota definitiva (burbuja).");
        mostrarEstudiantes();
    }

    // === BÚSQUEDA BINARIA ===
    private void buscarBinario() {
        if (estudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay estudiantes registrados.");
            return;
        }

        estudiantes.sort((a, b) -> a.getCodigo().compareToIgnoreCase(b.getCodigo()));
        guardarEnArchivo(); // 💾 Actualiza archivo al ordenar

        String codigoBuscado = JOptionPane.showInputDialog(this, "Ingrese el código a buscar:");
        if (codigoBuscado == null || codigoBuscado.trim().isEmpty()) return;

        int inicio = 0, fin = estudiantes.size() - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Estudiante e = estudiantes.get(medio);
            int comp = e.getCodigo().compareToIgnoreCase(codigoBuscado);

            if (comp == 0) {
                JOptionPane.showMessageDialog(this, "✅ Estudiante encontrado:\n\n" + e);
                encontrado = true;
                break;
            } else if (comp < 0) inicio = medio + 1;
            else fin = medio - 1;
        }

        if (!encontrado)
            JOptionPane.showMessageDialog(this, "❌ No se encontró el estudiante con ese código.");
    }

    // === GUARDAR EN ARCHIVO ===
    private void guardarEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Estudiante e : estudiantes) {
                bw.write(e.getCodigo() + ";" + e.getNombre() + ";" + e.getNota1() + ";" + e.getNota2() + ";" + e.getNota3());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    }

    // === CARGAR DESDE ARCHIVO ===
    private void cargarDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 5) {
                    String codigo = partes[0];
                    String nombre = partes[1];
                    double n1 = Double.parseDouble(partes[2]);
                    double n2 = Double.parseDouble(partes[3]);
                    double n3 = Double.parseDouble(partes[4]);
                    estudiantes.add(new Estudiante(codigo, nombre, n1, n2, n3));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    // === MAIN ===
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProgramaNotas().setVisible(true));
    }
}

// === CLASE ESTUDIANTE ===
class Estudiante {
    private String codigo;
    private String nombre;
    private double nota1, nota2, nota3;

    public Estudiante(String codigo, String nombre, double n1, double n2, double n3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    public double getDefinitiva() {
        return (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
    }

    @Override
    public String toString() {
        return String.format("Código: %s\nNombre: %s\nDefinitiva: %.2f", codigo, nombre, getDefinitiva());
    }
}