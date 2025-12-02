import javax.swing.JOptionPane;

public class RegistroProductos {

    public static void main(String[] args) {

        // Solicitar límite máximo
        int limite = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el límite máximo de productos a registrar:")
        );

        // Solicitar día de operación
        int dia = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el día de operación:\n"
                        + "1 = Lunes\n"
                        + "2 = Martes\n"
                        + "3 = Miércoles\n"
                        + "4 = Jueves\n"
                        + "5 = Viernes\n"
                        + "6 = Sábado\n"
                        + "7 = Domingo"
                )
        );

        // Tasa de Control Especial (TCE)
        float TCE = 0f;
        if (dia == 6 || dia == 7) {
            TCE = 0.02f; // 2% adicional
        }

        String reporteFinal = "REPORTE FINAL\n";
        reporteFinal += "Día de operación: " + dia + "\n";
        reporteFinal += "Tasa de Control Especial (TCE): " + (TCE * 100) + "%\n\n";

        // Registro de productos
        for (int i = 1; i <= limite; i++) {

            String nombre = JOptionPane.showInputDialog("Producto " + i + " - Ingrese el nombre:");

            float precio = Float.parseFloat(
                    JOptionPane.showInputDialog("Ingrese el precio del producto:")
            );

            int cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese la cantidad del producto:")
            );

            float subtotal = precio * cantidad;
            float incrementoTCE = subtotal * TCE;
            float total = subtotal + incrementoTCE;

            // Mostrar resultado individual
            JOptionPane.showMessageDialog(null,
                    "PRODUCTO " + i +
                    "\nNombre: " + nombre +
                    "\nPrecio: " + precio +
                    "\nCantidad: " + cantidad +
                    "\nSubtotal: " + subtotal +
                    "\nTCE aplicado: " + incrementoTCE +
                    "\nTotal a pagar: " + total
            );

            // Agregar al reporte final
            reporteFinal += "Producto " + i + ":\n";
            reporteFinal += "  Nombre: " + nombre + "\n";
            reporteFinal += "  Subtotal: " + subtotal + "\n";
            reporteFinal += "  TCE: " + incrementoTCE + "\n";
            reporteFinal += "  Total: " + total + "\n\n";
        }

        // Mostrar reporte final
        JOptionPane.showMessageDialog(null, reporteFinal);
    }
}
