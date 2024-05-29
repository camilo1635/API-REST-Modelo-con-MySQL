
package co.edu.unicauca.distribuidos.core.capaAccesoADatos.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.core.capaAccesoADatos.models.ClienteEntity;
import co.edu.unicauca.distribuidos.core.capaAccesoADatos.repositories.conexion.ConexionBD;

/**
 * la clase permite registrar, eliminar, actualizar, consultar y listar datos de
 * los clientes
 * 
 */
@Repository
public class UsuarioRepositoryBaseDatos {
    private final ConexionBD conexionABaseDeDatos;

    public UsuarioRepositoryBaseDatos() {
        conexionABaseDeDatos = new ConexionBD();
    }

    /**
     * 
     * @author: Daniel Eduardo Paz Perafán
     * @version: 09/12/2020
     * @param cliente El parámetro encapsula la información del cliente a registrar
     *                en el sistema
     * @return si el cliente se registro correctamente, el método retorna el cliente
     *         con los datos registrados,null en caso contrario
     */

    public ClienteEntity save(ClienteEntity objCliente) {
        System.out.println("registrando cliente");
        ClienteEntity objClienteAlmacenado = null;
        int resultado = -1;

        try {

            conexionABaseDeDatos.conectar();

            PreparedStatement sentencia = null;
            String consulta = "insert into clientes(clientes.nombre, clientes.apellido, clientes.email, clientes.createAt) values(?,?,?,?)";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, objCliente.getNombre());
            sentencia.setString(2, objCliente.getApellido());
            sentencia.setString(3, objCliente.getEmail());

            sentencia.setDate(4, new java.sql.Date(objCliente.getCreateAt().getTime()));

            resultado = sentencia.executeUpdate();
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("error en la inserción: " + e.getMessage());
        }

        if (resultado == 1) {
            objClienteAlmacenado = objCliente;
        }
        return objClienteAlmacenado;
    }

    public List<ClienteEntity> findAll() {
        System.out.println("listando clientes");
        ArrayList<ClienteEntity> clientes = new ArrayList<ClienteEntity>();

        conexionABaseDeDatos.conectar();
        try {
            PreparedStatement sentencia = null;
            String consulta = "select * from clientes";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            ResultSet res = sentencia.executeQuery();
            while (res.next()) {
                ClienteEntity objCliente = new ClienteEntity();
                objCliente.setIdCliente(res.getInt("idCliente"));
                objCliente.setNombre(res.getString("nombre"));
                objCliente.setApellido(res.getString("apellido"));
                objCliente.setEmail(res.getString("email"));
                objCliente.setCreateAt(res.getDate("createAt"));
                clientes.add(objCliente);
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("error en la inserción: " + e.getMessage());
        }

        return clientes;
    }

    public ClienteEntity findById(Integer idCliente) {
        System.out.println("consultar cliente");
        ClienteEntity objCliente = null;

        conexionABaseDeDatos.conectar();
        try {
            PreparedStatement sentencia = null;
            String consulta = "select clientes.idCliente, clientes.nombre, clientes.apellido, clientes.email, clientes.createAt from clientes where clientes.idCliente=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setInt(1, idCliente);
            ResultSet res = sentencia.executeQuery();
            while (res.next()) {
                System.out.println("cliente encontrado");
                objCliente = new ClienteEntity();
                objCliente.setIdCliente(res.getInt("idCliente"));
                objCliente.setNombre(res.getString("nombre"));
                objCliente.setApellido(res.getString("apellido"));
                objCliente.setEmail(res.getString("email"));
                objCliente.setCreateAt(res.getDate("createAt"));
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("error en la consulta de un empleado: " + e.getMessage());
        }

        return objCliente;
    }

    public ClienteEntity update(Integer idCliente, ClienteEntity objCliente) {
        System.out.println("actualizar cliente");
        ClienteEntity objClienteActualizado = null;
        conexionABaseDeDatos.conectar();
        int resultado = -1;
        try {
            PreparedStatement sentencia = null;
            String consulta = "update clientes set clientes.nombre=?,"
                    + "clientes.apellido=?,"
                    + "clientes.email=? ,"
                    + "clientes.createAt=? "
                    + "where clientes.idCliente=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);

            sentencia.setString(1, objCliente.getNombre());
            sentencia.setString(2, objCliente.getApellido());
            sentencia.setString(3, objCliente.getEmail());

            sentencia.setDate(4, new java.sql.Date(objCliente.getCreateAt().getTime()));

            sentencia.setInt(5, idCliente);
            resultado = sentencia.executeUpdate();
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("error en la actualización: " + e.getMessage());
        }

        if (resultado == 1) {
            objClienteActualizado = objCliente;
        }
        return objClienteActualizado;

    }

    public boolean delete(Integer idCliente) {
        System.out.println("eliminar cliente");
        conexionABaseDeDatos.conectar();
        int resultado = -1;
        try {
            PreparedStatement sentencia = null;
            String consulta = "delete from clientes where clientes.idCliente=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setInt(1, idCliente);
            resultado = sentencia.executeUpdate();
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("error en la eliminación: " + e.getMessage());
        }

        return resultado == 1;
    }
}
