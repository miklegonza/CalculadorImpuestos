package principal;

import controlador.Controlador;
import modelo.Carro;
import modelo.Operaciones;
import vista.Vista;

public class Main {

    public static void main(String[] args) {
        Carro carr = new Carro();
        Operaciones ope = new Operaciones();
        Vista vis = new Vista();

        Controlador ctrl = new Controlador(vis, carr, ope);
        ctrl.inicio();
        vis.setVisible(true);

    }

}
