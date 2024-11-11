package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentaOperaciones extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panelPrincipal;
    private JTextField textCampoNombre;
    private JTextField textCampoApellido;
    private JTextField textCampoEdad;
    private JTextField textCampoTelefono;
    private JTextField textCampoTipo;
    private JTextField textCampoNombreProducto;
    private JTextField textCampoValorUnitario;
    private JTextField textCampoCantidad;
    private JLabel labelMensaje;
    private JButton btnRealizarCompra;
    private JButton btnMostrarDatos;
    private JButton btnLimpiar;

    public VentaOperaciones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("VENTANA FORMULARIO");
        setBounds(100, 100, 492, 690);
        setLocationRelativeTo(null);
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null); // Absolute layout
        setContentPane(panelPrincipal);

        // Título
        JLabel lblTitulo = new JLabel("Formulario de Compra");
        lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        lblTitulo.setBounds(100, 10, 250, 30);
        panelPrincipal.add(lblTitulo);

        // Campo Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 50, 100, 25);
        panelPrincipal.add(lblNombre);
        textCampoNombre = new JTextField();
        textCampoNombre.setBounds(150, 50, 200, 25);
        panelPrincipal.add(textCampoNombre);

        // Campo Apellido
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(30, 90, 100, 25);
        panelPrincipal.add(lblApellido);
        textCampoApellido = new JTextField();
        textCampoApellido.setBounds(150, 90, 200, 25);
        panelPrincipal.add(textCampoApellido);

        // Campo Edad
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 130, 100, 25);
        panelPrincipal.add(lblEdad);
        textCampoEdad = new JTextField();
        textCampoEdad.setBounds(150, 130, 200, 25);
        panelPrincipal.add(textCampoEdad);

        // Campo Teléfono
        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(30, 170, 100, 25);
        panelPrincipal.add(lblTelefono);
        textCampoTelefono = new JTextField();
        textCampoTelefono.setBounds(150, 170, 200, 25);
        panelPrincipal.add(textCampoTelefono);

        // Campo Tipo
        JLabel lblTipo = new JLabel("Tipo (A/B/C):");
        lblTipo.setBounds(30, 210, 100, 25);
        panelPrincipal.add(lblTipo);
        textCampoTipo = new JTextField();
        textCampoTipo.setBounds(150, 210, 200, 25);
        panelPrincipal.add(textCampoTipo);

        // Campo Nombre del Producto
        JLabel lblNombreProducto = new JLabel("Nombre del Producto:");
        lblNombreProducto.setBounds(30, 250, 150, 25);
        panelPrincipal.add(lblNombreProducto);
        textCampoNombreProducto = new JTextField();
        textCampoNombreProducto.setBounds(150, 250, 200, 25);
        panelPrincipal.add(textCampoNombreProducto);

        // Campo Valor Unitario
        JLabel lblValorUnitario = new JLabel("Valor Unitario:");
        lblValorUnitario.setBounds(30, 290, 100, 25);
        panelPrincipal.add(lblValorUnitario);
        textCampoValorUnitario = new JTextField();
        textCampoValorUnitario.setBounds(150, 290, 200, 25);
        panelPrincipal.add(textCampoValorUnitario);

        // Campo Cantidad
        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(30, 330, 100, 25);
        panelPrincipal.add(lblCantidad);
        textCampoCantidad = new JTextField();
        textCampoCantidad.setBounds(150, 330, 200, 25);
        panelPrincipal.add(textCampoCantidad);

        // Botones
        btnRealizarCompra = new JButton("Realizar Compra");
        btnRealizarCompra.setBounds(30, 370, 150, 25);
        panelPrincipal.add(btnRealizarCompra);

        btnMostrarDatos = new JButton("Mostrar Datos");
        btnMostrarDatos.setBounds(200, 370, 150, 25);
        panelPrincipal.add(btnMostrarDatos);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(370, 370, 100, 25);
        panelPrincipal.add(btnLimpiar);

        // Etiqueta de mensaje
        labelMensaje = new JLabel();
        labelMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        labelMensaje.setBounds(30, 410, 436, 230);
        panelPrincipal.add(labelMensaje);
    }

    public JButton getBtnRealizarCompra() {
        return btnRealizarCompra;
    }

    public JButton getBtnMostrarDatos() {
        return btnMostrarDatos;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public String getNombre() {
        return textCampoNombre.getText();
    }

    public String getApellido() {
        return textCampoApellido.getText();
    }

    public int getEdad() {
        return Integer.parseInt(textCampoEdad.getText());
    }

    public int getTelefono() {
        return Integer.parseInt(textCampoTelefono.getText());
    }

    public String getTipo() {
        return textCampoTipo.getText();
    }

    public String getNombreProducto() {
        return textCampoNombreProducto.getText();
    }

    public double getValorUnitario() {
        return Double.parseDouble(textCampoValorUnitario.getText());
    }

    public int getCantidadProductos() {
        return Integer.parseInt(textCampoCantidad.getText());
    }

    public void mostrarMensaje(String mensaje) {
        labelMensaje.setText("<html>" + mensaje.replace("\n", "<br>") + "</html>");
    }

    public boolean camposVacios() {
        return textCampoNombre.getText().isEmpty() || textCampoApellido.getText().isEmpty() ||
               textCampoEdad.getText().isEmpty() || textCampoTelefono.getText().isEmpty() ||
               textCampoTipo.getText().isEmpty() || textCampoNombreProducto.getText().isEmpty() ||
               textCampoValorUnitario.getText().isEmpty() || textCampoCantidad.getText().isEmpty();
    }

    public void limpiarCampos() {
        textCampoNombre.setText("");
        textCampoApellido.setText("");
        textCampoEdad.setText("");
        textCampoTelefono.setText("");
        textCampoTipo.setText("");
        textCampoNombreProducto.setText("");
        textCampoValorUnitario.setText("");
        textCampoCantidad.setText("");
        labelMensaje.setText("");
    }
}
