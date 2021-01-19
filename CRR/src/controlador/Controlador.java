package controlador;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Carro;
import modelo.Operaciones;
import vista.Vista;

/**
 * Clase encargada de conectar la vista con el modelo en el patrón MVC (Model
 * View Controller) sirviendo de enlace entre el manejo de la base de datos, los
 * objetos y la interfaz gráfica.
 *
 * @author Michael González
 */
public class Controlador {

    private final Vista vista;
    private Carro carro;
    private final Operaciones operaciones;

    public Controlador() {
        this.vista = new Vista();
        this.carro = new Carro();
        this.operaciones = new Operaciones();
        this.inicio();
    }

    /**
     * Instanciado en el constructor. Le asigna los eventos y las acciones a
     * realizar a cada componente que lo requiera.
     */
    private void inicio() {
        vista.getjToggleProntoPago().setEnabled(false);
        vista.getjToggleServicioPublico().setEnabled(false);
        vista.getjToggleTraslado().setEnabled(false);
        vista.setLocationRelativeTo(null);
        this.vista.getBtnRegistrar().addActionListener(e -> registrar());
        this.vista.getBtnModificar().addActionListener(e -> modificar());
        this.vista.getBtnEliminar().addActionListener(e -> eliminar());
        this.vista.getBtnBuscar().addActionListener(e -> buscar());
        this.vista.getBtnLimpiar().addActionListener(e -> limpiar());

        this.vista.getBtnImpuesto().addActionListener(e -> {
            double impuesto = Double.parseDouble(vista.getTxtPrecio().getText());
            imprimirImpuesto(calcularImpuesto(impuesto));
        });

        this.vista.getBtnImpuestoDesc().addActionListener(e -> {
            vista.getjToggleProntoPago().setEnabled(true);
            vista.getjToggleServicioPublico().setEnabled(true);
            vista.getjToggleTraslado().setEnabled(true);
        });

        this.vista.getBtnDescuentos().addActionListener(e -> {
            double impuesto, nuevoImpuesto;
            impuesto = Double.parseDouble(vista.getTxtPrecio().getText());
            nuevoImpuesto = calcularImpuesto(impuesto);
            imprimirImpuesto(calcularImpuestoDescuento(nuevoImpuesto));
        });

        this.vista.getExitLabel().addMouseListener(new MouseEvents());
    }

    /**
     * Crea un nuevo carro son los datos proporcionados en el formulario de la
     * vista.
     *
     * @return Objeto de tipo Carro con todas sus propiedades.
     */
    private Carro crearCarro() {
        return new Carro(
                vista.getTxtPlaca().getText(),
                vista.getTxtMarca().getText(),
                vista.getTxtModelo().getText(),
                Double.parseDouble(vista.getTxtPrecio().getText())
        );
    }

    /**
     * Limpia el formulario.
     */
    private void limpiar() {
        vista.getTxtPlaca().setText(null);
        vista.getTxtMarca().setText(null);
        vista.getTxtModelo().setText(null);
        vista.getTxtPrecio().setText(null);
    }

    /**
     * Valida que no haya campos vacíos al momento de enviar el formulario.
     *
     * @return Verdadero si todos los campos tienen información.
     */
    public boolean validar() {
        return !(vista.getTxtPlaca().getText().equals("")
                && vista.getTxtMarca().getText().equals("")
                && vista.getTxtModelo().getText().equals("")
                && vista.getTxtPrecio().getText().equals(""));
    }

    private void registrar() {
        if (validar()) {
            try {
                carro = crearCarro();

                if (operaciones.registrar(carro)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado", "Registrado", 1);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al intentar guardar el nuevo registro", "ERROR", 0);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un valor numérico", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los datos son obligatorios", "ERROR", 0);
        }
    }

    private void modificar() {
        if (validar()) {
            try {
                carro = crearCarro();

                if (operaciones.modificar(carro)) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "Modificado", 1);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al intentar modificar el registro", "ERROR", 0);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un valor numérico", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los datos son obligatorios", "ERROR", 0);
        }
    }

    private void eliminar() {
        String placa = vista.getTxtPlaca().getText();
        if (!placa.equals("")) {
            if (operaciones.eliminar(placa)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Eliminado", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se logró eliminar el registro", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se debe ingresar la placa del vehículo", "ERROR", 0);
        }
    }

    private void buscar() {
        String placa = vista.getTxtPlaca().getText();

        if (!placa.equals("")) {
            carro = operaciones.buscar(placa);
            if (carro != null) {

                vista.getTxtPlaca().setText(carro.getPlaca());
                vista.getTxtMarca().setText(carro.getMarca());
                vista.getTxtModelo().setText(carro.getModelo());
                vista.getTxtPrecio().setText(carro.getPrecio() + "");

            } else {
                JOptionPane.showMessageDialog(null, "Registro no encontrado. \n"
                        + "Realice la búsqueda por las placas del vehículo, \n"
                        + "separando las letras y los números con un espacio", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se debe ingresar la placa del vehículo", "ERROR", 0);
        }
    }

    /**
     * Calcula el impuesto a pagar del carro según el precio del mismo. Si es
     * menor de $50000, el impuesto será del 2.5%. Si oscila entre $50000 y
     * $150000, el impuesto será del 3.5%. Y si es mayor a $150000, el impuesto
     * a pagar será de 4.5% sobre el valor del carro.
     *
     * @param precioCarro El valor del carro en cuestión.
     * @return El valor del impuesto a pagar por el cliente.
     */
    private double calcularImpuesto(double precioCarro) {
        double impuesto = 0;
        String porcentaje = "";

        if (precioCarro < 50000) {
            impuesto = (precioCarro * 2.5) / 100;
            porcentaje = "2.5";
        } else if (precioCarro >= 50000 && precioCarro < 150000) {
            impuesto = (precioCarro * 3.5) / 100;
            porcentaje = "3.5";
        } else if (precioCarro >= 150000) {
            impuesto = (precioCarro * 4.5) / 100;
            porcentaje = "4.5";
        }

        JOptionPane.showMessageDialog(null, "Su impuesto inicial es de " + porcentaje + "% \n"
                + "Recuerde que puede aplicar a alguno de nuestros descuentos", "Impuesto", 1);

        return impuesto;
    }

    /**
     * Calcula el valor del impuesto a pagar en caso de que aplique a ciertos
     * descuentos ofrecidos. Estos descuentos son:
     *
     * <ul>
     * <li>Descuento por pronto pago: 1% sobre el impuesto actual</li>
     * <li>Descuento por servicio público: 2% sobre el impuesto actual</li>
     * <li>Descuento por traslado de cuenta: 3% sobre el impuesto actual</li>
     * </ul>
     *
     * Los descuentos se aplican en secuencia utilizando el último valor
     * calculado. Por ejemplo, si se tiene una liquidación a la que aplican
     * todos los descuentos, primero se descuenta el porcentaje por pronto pago,
     * luego a este valor se le aplica el descuento por servicio público, y
     * luego al resultado se le aplica el descuento por traslado de cuenta.
     *
     * @param nuevoImpuesto El impuesto del carro sobre el que se aplicarán los
     * descuentos.
     * @return El nuevo valor a pagar por el usuario.
     */
    private double calcularImpuestoDescuento(double nuevoImpuesto) {
        String mensaje = "";

        if (vista.getjToggleProntoPago().isSelected()) {
            nuevoImpuesto = nuevoImpuesto - (nuevoImpuesto * 1) / 100;
            mensaje += "Su impuesto por pronto pago es de 3%" + "\n";
        }
        if (vista.getjToggleServicioPublico().isSelected()) {
            nuevoImpuesto = nuevoImpuesto - (nuevoImpuesto * 2) / 100;
            mensaje += "Su impuesto por vehículo de servicio público es de 2%" + "\n";
        }
        if (vista.getjToggleTraslado().isSelected()) {
            nuevoImpuesto = nuevoImpuesto - (nuevoImpuesto * 3) / 100;
            mensaje += "Su impuesto por traslado de cuenta es de 1%" + "\n";
        }
        if (!vista.getjToggleProntoPago().isSelected()
                && !vista.getjToggleServicioPublico().isSelected()
                && !vista.getjToggleTraslado().isSelected()) {
            mensaje = "Lo sentimos, usted no puede aplicar a ningún descuento.";
        }

        JOptionPane.showMessageDialog(null, mensaje, "Impuesto con Descuento", 1);

        return nuevoImpuesto;
    }

    /**
     * Muestra en la GUI el valor a pagar.
     *
     * @param valor El valor que se va a imprimir.
     */
    private void imprimirImpuesto(double valor) {
        vista.getValorDescuento().setText("Su impuesto es de $ " + valor);
        vista.getEditLabel1().setText("Recuerde pagar sus impuestos a tiempo");
        vista.getEditLabel2().setText("¡Éxitos!");
    }

    /**
     * Clase anidada encargada de asignar los eventos del mouse al botón de
     * salida que cierra la aplicación. Frente a la necesidad de sobreescribir
     * todos los métodos de la interfaz {@code MouseListener} y a la
     * organización del código, se optó por separarlos en una clase que sería
     * posteriormente instanciada.
     *
     * @see MouseListener
     */
    private class MouseEvents implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.exit(0);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Component comp = e.getComponent();
            comp.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component comp = e.getComponent();
            comp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

    }

    /**
     * Método main que inicia el programa y muestra la interfaz gráfica.
     *
     * @param args
     */
    public static void main(String[] args) {
        new Controlador().vista.setVisible(true);
    }

}
