package modelo;

/**
 * Clase modelo que abstrae las características necesarias de un carro para este
 * caso de uso.
 *
 * @author Michael González
 */
public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private Double precio;

    public Carro() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.precio = 0d;
    }

    public Carro(String placa) {
        this.placa = placa;
        this.marca = "";
        this.modelo = "";
        this.precio = 0d;
    }

    public Carro(String placa, String marca, String modelo, Double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double Precio) {
        this.precio = Precio;
    }

    @Override
    public String toString() {
        return "Carro: \n"
                + "Placa → " + placa + "\n"
                + "Marca → " + marca + "\n"
                + "Modelo → " + modelo + "\n"
                + "Precio → " + precio + "\n";
    }

}
