import javax.swing.JOptionPane;
import gui.VentaOperaciones;

public class Accion {
    String nombre;
    String apellido;
    int edad;
    int telefono;
    String tipo;
    String nombreProducto;
    double valorUnitario;
    int cantidadProductos;
    double pagoTotal = 0;
    double valorFinal = 0;
    double descuento;

    public Accion() {
        pedirDatos();
    }

    private void pedirDatos() {
        VentaOperaciones miVentana = new VentaOperaciones();
        miVentana.setVisible(true);
        
        miVentana.getBtnRealizarCompra().addActionListener(e -> realizarCompra(miVentana));
        miVentana.getBtnMostrarDatos().addActionListener(e -> mostrarDatos(miVentana));
        miVentana.getBtnLimpiar().addActionListener(e -> limpiar(miVentana));
    }

    private void realizarCompra(VentaOperaciones ventana) {
        nombreProducto = ventana.getNombreProducto();
        valorUnitario = ventana.getValorUnitario();
        cantidadProductos = ventana.getCantidadProductos();

        if (nombreProducto.isEmpty() || cantidadProductos <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un producto válido y cantidad.");
            return;
        }

        calcularDescuento(ventana.getTipo());
        pagoTotal = valorUnitario * cantidadProductos;
        valorFinal = pagoTotal - (pagoTotal * descuento);
        
        

        String mensaje = "Nombre: " + nombre + "\n" +
                         "Tipo: " + tipo + "\n" +
                         "Precio Total: " + pagoTotal + "\n" +
                         "Descuento: " + (descuento > 0 ? (descuento * 100) + "%" : "No se le realiza descuento") + "\n" +
                         "Precio Final: " + valorFinal;

        ventana.mostrarMensaje(mensaje);
    }

    private void calcularDescuento(String tipoUsuario) {
        switch (tipoUsuario.toUpperCase()) {
            case "A":
                descuento = 0.4;
                break;
            case "B":
                descuento = 0.2;
                break;
            case "C":
                descuento = 0.1;
                break;
            default:
                descuento = 0;
                break;
        }
    }

    private void mostrarDatos(VentaOperaciones ventana) {
        if (ventana.camposVacios()) {
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacíos.");
            return;
        }

        nombre = ventana.getNombre();
        apellido = ventana.getApellido();
        edad = ventana.getEdad();
        telefono = ventana.getTelefono();
        tipo = ventana.getTipo();

        String datos = "Nombre: " + nombre + "\n" +
                       "Apellido: " + apellido + "\n" +
                       "Edad: " + edad + "\n" +
                       "Teléfono: " + telefono + "\n" +
                       "Tipo: " + tipo;

        ventana.mostrarMensaje(datos);
    }

    private void limpiar(VentaOperaciones ventana) {
        ventana.limpiarCampos();
    }
}
