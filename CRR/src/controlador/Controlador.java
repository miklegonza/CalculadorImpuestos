package controlador;

import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.Carro;
import modelo.Operaciones;
import vista.Vista;

public class Controlador implements ActionListener {

    private final Vista view;
    private final Carro car;
    private final Operaciones op;

    public Controlador(Vista view, Carro car, Operaciones op) {
        this.view = view;
        this.car = car;
        this.op = op;
        this.view.getBtnRegistrar().addActionListener(this);
        this.view.getBtnLimpiar().addActionListener(this);
        this.view.getBtnBuscar().addActionListener(this);
        this.view.getBtnModificar().addActionListener(this);
        this.view.getBtnEliminar().addActionListener(this);
        this.view.getBtnDescuentos().addActionListener(this);
        this.view.getLabelOp1().addActionListener(this);
        this.view.getLabelOp2().addActionListener(this);
        this.view.getBtnDescuentos().addActionListener(this);
    }

    public void inicio() {
        view.getjToggleButton1().setEnabled(false);
        view.getjToggleButton2().setEnabled(false);
        view.getjToggleButton3().setEnabled(false);
        view.getValorDescuento().setEnabled(false);

        view.setLocationRelativeTo(null);
        view.setTitle("Calcular Impuestos");
        view.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.getBtnRegistrar()) {
            car.setPlaca(view.getTxtPlaca().getText());
            car.setMarca(view.getTxtMarca().getText());
            car.setModelo(view.getTxtModelo().getText());
            car.setPrecio(Double.parseDouble(view.getTxtPrecio().getText()));

            if (op.registrar(car)) {
                JOptionPane.showMessageDialog(null, "Registro guardado", "Registrado", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar guardar el nuevo registro", "ERROR", 0);
                limpiar();
            }
        }

        if (e.getSource() == view.getBtnModificar()) {
            car.setPlaca(view.getTxtPlaca().getText());
            car.setMarca(view.getTxtMarca().getText());
            car.setModelo(view.getTxtModelo().getText());
            car.setPrecio(Double.parseDouble(view.getTxtPrecio().getText()));

            if (op.modificar(car)) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "Modificado", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar modificar el registro", "ERROR", 0);
                limpiar();
            }
        }

        if (e.getSource() == view.getBtnEliminar()) {
            car.setPlaca(view.getTxtPlaca().getText());

            if (op.eliminar(car)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Eliminado", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se logró eliminar el registro", "ERROR", 0);
                limpiar();
            }
        }

        if (e.getSource() == view.getBtnBuscar()) {
            car.setPlaca(view.getTxtPlaca().getText());

            if (op.buscar(car)) {

                view.getTxtPlaca().setText(car.getPlaca());
                view.getTxtMarca().setText(car.getMarca());
                view.getTxtModelo().setText(car.getModelo());
                view.getTxtPrecio().setText(car.getPrecio() + "");

            } else {
                JOptionPane.showMessageDialog(null, "Registro no encontrado. \n"
                        + "Realice la búsqueda por las placas del vehículo, separando las letras y los números con un espacio", "ERROR", 0);
                limpiar();
            }
        }

        if (e.getSource() == view.getBtnLimpiar()) {
            limpiar();
        }

        if (e.getSource() == view.getLabelOp1()) {
            double imp = 0, precioCarro = Double.parseDouble(view.getTxtPrecio().getText());

            if (precioCarro < 46630) {
                imp = (precioCarro * 2.5) / 100;
            } else if (precioCarro >= 46630 && precioCarro < 104916) {
                imp = (precioCarro * 3.5) / 100;
            } else if (precioCarro >= 104916) {
                imp = (precioCarro * 4.5) / 100;
            }

            view.getValorDescuento().setText("$" + imp);
            view.getEditLabel1().setText("Recuerde pagar sus impuestos a tiempo para evitar recargos...");
            view.getEditLabel2().setText("¡Éxitos!");

        }

        if (e.getSource() == view.getLabelOp2()) {
            view.getjToggleButton1().setEnabled(true);
            view.getjToggleButton2().setEnabled(true);
            view.getjToggleButton3().setEnabled(true);
        }

        if (e.getSource() == view.getBtnDescuentos()) {
            double impd, imp = 0, precioCarro = Double.parseDouble(view.getTxtPrecio().getText());

            if (precioCarro < 46630) {
                imp = (precioCarro * 2.5) / 100;
                System.out.println(imp + " → 1,1");
            } else if (precioCarro >= 46630 && precioCarro < 104916) {
                imp = (precioCarro * 3.5) / 100;
                System.out.println(imp + " → 1,2");
            } else if (precioCarro >= 104916) {
                imp = (precioCarro * 4.5) / 100;
                System.out.println(imp + " → 1,3");
            }

            impd = imp;
            if (view.getjToggleButton1().isSelected()) {
                impd = (impd * 3) / 100;
                System.out.println(impd + " → 2,1");
            }
            if (view.getjToggleButton2().isSelected()) {
                impd = (impd * 2) / 100;
                System.out.println(impd + " → 2,2");
            }
            if (view.getjToggleButton3().isSelected()) {
                impd = (impd * 1) / 100;
                System.out.println(impd + " → 2,3");
            }

            view.getValorDescuento().setText("$" + impd);
            view.getEditLabel1().setText("Recuerde pagar sus impuestos a tiempo para evitar recargos...");
            view.getEditLabel2().setText("¡Éxitos!");

        }

    }

    public void limpiar() {
        view.getTxtPlaca().setText(null);
        view.getTxtMarca().setText(null);
        view.getTxtModelo().setText(null);
        view.getTxtPrecio().setText(null);
    }

}
