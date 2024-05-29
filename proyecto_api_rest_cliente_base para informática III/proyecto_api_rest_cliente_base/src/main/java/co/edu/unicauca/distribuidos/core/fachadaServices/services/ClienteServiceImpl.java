
package co.edu.unicauca.distribuidos.core.fachadaServices.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.capaAccesoADatos.models.ClienteEntity;
import co.edu.unicauca.distribuidos.core.capaAccesoADatos.repositories.UsuarioRepositoryBaseDatos;
import co.edu.unicauca.distribuidos.core.fachadaServices.DTO.ClienteDTO;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private UsuarioRepositoryBaseDatos servicioAccesoBaseDatos;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ClienteDTO> findAll() {
		List<ClienteEntity> clientesEntity = this.servicioAccesoBaseDatos.findAll();
		List<ClienteDTO> clientesDTO = this.modelMapper.map(clientesEntity, new TypeToken<List<ClienteDTO>>() {
		}.getType());
		return clientesDTO;
	}

	@Override
	public ClienteDTO findById(Integer id) {
		ClienteEntity objCLienteEntity = this.servicioAccesoBaseDatos.findById(id);
		ClienteDTO clienteDTO = this.modelMapper.map(objCLienteEntity, ClienteDTO.class);
		return clienteDTO;
	}

	@Override
	public ClienteDTO save(ClienteDTO cliente) {
		ClienteEntity clienteEntity = this.modelMapper.map(cliente, ClienteEntity.class);
		ClienteEntity objCLienteEntity = this.servicioAccesoBaseDatos.save(clienteEntity);
		ClienteDTO clienteDTO = this.modelMapper.map(objCLienteEntity, ClienteDTO.class);
		return clienteDTO;
	}

	@Override
	public ClienteDTO update(Integer id, ClienteDTO cliente) {
		ClienteEntity clienteEntity = this.modelMapper.map(cliente, ClienteEntity.class);
		ClienteEntity clienteEntityActualizado = this.servicioAccesoBaseDatos.update(id, clienteEntity);
		ClienteDTO clienteDTO = this.modelMapper.map(clienteEntityActualizado, ClienteDTO.class);
		return clienteDTO;
	}

	@Override
	public boolean delete(Integer id) {
		return this.servicioAccesoBaseDatos.delete(id);
	}
}
