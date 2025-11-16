package ejercicios1ImpresionInterfaz;

import javax.swing.JOptionPane;

public class Varios {

    public int leerEntero(String x) {
        int n = 0;
        String cadena = "";
        while (true) {
            try {
                cadena = JOptionPane.showInputDialog(x);
                n = Integer.parseInt(cadena);
                break;
            } catch (Exception e) {
                Mensaje("Debe ser número (" + cadena + ")");
            }
        }
        return n;
    }

    public double leerDecimal(String x) {
        double n = 0;
        String cadena = "";
        while (true) {
            try {
                cadena = JOptionPane.showInputDialog(x);
                n = Double.parseDouble(cadena);
                break;
            } catch (Exception e) {
                Mensaje("Debe ser decimal (" + cadena + ")");
            }
        }
        return n;
    }

    public void Mensaje(String x) {
        JOptionPane.showMessageDialog(null, x);
    }
}
