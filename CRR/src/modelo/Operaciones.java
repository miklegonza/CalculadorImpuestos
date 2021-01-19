package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * En esta clase se realiza todo el manejo de la base de datos (MySQL 5.7).
 *
 * @author Michael González
 */
public class Operaciones extends Conexion {

    private final Connection con = conectar();
    private PreparedStatement ps = null;
    private Carro car;

    public boolean registrar(Carro carro) {

        String sql = "INSERT INTO carro (Placa, Marca, Modelo, Precio) VALUES (?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getMarca());
            ps.setString(3, carro.getModelo());
            ps.setDouble(4, carro.getPrecio());
            if (ps.executeUpdate() > 0) {
                System.out.println("Insertado con éxito");
                return true;
            } else {
                System.out.println("No se pudo insertar");
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar");
            System.out.println("Causa: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return false;
    }

    public boolean modificar(Carro carro) {

        String sql = "UPDATE carro SET Marca = ?, Modelo = ?, Precio = ? WHERE Placa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, carro.getMarca());
            ps.setString(2, carro.getModelo());
            ps.setDouble(3, carro.getPrecio());
            ps.setString(4, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                System.out.println("Modificado con éxito");
                return true;
            } else {
                System.out.println("No se pudo modificar");
            }
        } catch (SQLException ex) {
            System.out.println("Error al modificar");
            System.out.println("Causa: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return false;
    }

    public boolean eliminar(String placa) {

        String sql = "DELETE FROM carro WHERE Placa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, placa);
            if (ps.executeUpdate() > 0) {
                System.out.println("Eliminado con éxito");
                return true;
            } else {
                System.out.println("No se pudo eliminar");
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar");
            System.out.println("Causa: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return false;
    }

    public Carro buscar(String placa) {

        car = new Carro();

        ResultSet rs;

        String sql = "SELECT * FROM carro WHERE Placa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, placa);
            rs = ps.executeQuery();

            if (rs.next()) {
                car.setPlaca(rs.getString("Placa"));
                car.setMarca(rs.getString("Marca"));
                car.setModelo(rs.getString("Modelo"));
                car.setPrecio(rs.getDouble("Precio"));
                System.out.println("Encontrado");
                return car;
            } else {
                System.out.println("No encontrado");
            }

        } catch (SQLException ex) {
            System.out.println("Error al eliminar");
            System.out.println("Causa: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return null;
    }

}
