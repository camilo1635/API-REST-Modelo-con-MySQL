package servicios;

import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.jackson.JacksonFeature;

import modelos.Cliente;

public class ClienteServices {

    private String endPoint;
    private Client client;

    public ClienteServices() {
        this.endPoint = "http://localhost:5000/api/clientes";
        client = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Cliente consultarCliente(Integer id) {
        Cliente objCliente = null;

        WebTarget target = client.target(this.endPoint + "/" + id);
        objCliente = target.request(MediaType.APPLICATION_JSON_TYPE).get(Cliente.class);
        return objCliente;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> listaClientes = null;
        WebTarget target = client.target(this.endPoint);
        listaClientes = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Cliente>>() {
        });
        return listaClientes;
    }

    public Cliente registrarCliente(Cliente objClienteRegistar) {
        Cliente objCliente = null;
        WebTarget target = client.target(this.endPoint);
        Entity<Cliente> data = Entity.entity(objClienteRegistar, MediaType.APPLICATION_JSON_TYPE);
        objCliente = target.request(MediaType.APPLICATION_JSON_TYPE).post(data, Cliente.class);
        return objCliente;
    }

    public Cliente actualizarCliente(Cliente objClienteActualizar, Integer id) {
        Cliente objCliente = null;
        WebTarget target = client.target(this.endPoint + "/" + id);
        Entity<Cliente> data = Entity.entity(objClienteActualizar, MediaType.APPLICATION_JSON_TYPE);
        objCliente = target.request(MediaType.APPLICATION_JSON_TYPE).put(data, Cliente.class);

        return objCliente;
    }

    public Boolean eliminarCliente(Integer id) {
        Boolean bandera = false;
        WebTarget target = client.target(this.endPoint + "/" + id);
        bandera = target.request(MediaType.APPLICATION_JSON_TYPE).delete(Boolean.class);
        return bandera;
    }

    public Boolean consultarSiExisteCliente(Integer id) {
        Boolean bandera;
        WebTarget target = client.target(this.endPoint + "/consultarSiExiste/" + id);
        bandera = target.request(MediaType.APPLICATION_JSON_TYPE).get(Boolean.class);
        return bandera;
    }

    public Boolean consultarSiExisteClientePorCorreo(String correo) {
        Boolean bandera;
        WebTarget target = client.target(this.endPoint + "/consultarSiExistePorCorreo/" + correo);
        bandera = target.request(MediaType.APPLICATION_JSON_TYPE).get(Boolean.class);
        return bandera;
    }
}
