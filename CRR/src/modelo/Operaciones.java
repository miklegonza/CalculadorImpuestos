package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import principal.Conexion;

public class Operaciones extends Conexion {

    private final Connection con = conectar();
    private PreparedStatement ps;

    public boolean registrar(Carro ca) {

        String sql = "INSERT INTO carro (Placa, Marca, Modelo, Precio) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getPlaca());
            ps.setString(2, ca.getModelo());
            ps.setString(3, ca.getMarca());
            ps.setDouble(4, ca.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }

    public boolean modificar(Carro ca) {

        String sql = "UPDATE carro SET Marca=?, Modelo=?, Precio=? WHERE Placa=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getPlaca());
            ps.setString(2, ca.getModelo());
            ps.setString(3, ca.getMarca());
            ps.setString(4, ca.getPrecio() + "");
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }

    public boolean eliminar(Carro ca) {

        String sql = "DELETE FROM carro WHERE Placa=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getPlaca());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }

    public boolean buscar(Carro ca) {

        ResultSet rs;

        String sql = "SELECT * FROM carro WHERE Placa=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getPlaca());
            rs = ps.executeQuery();

            if (rs.next()) {
                ca.setPlaca(rs.getString("Placa"));
                ca.setMarca(rs.getString("Modelo"));
                ca.setModelo(rs.getString("Marca"));
                ca.setPrecio(rs.getDouble("Precio"));
                return true;
            }

            return false;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }

}
