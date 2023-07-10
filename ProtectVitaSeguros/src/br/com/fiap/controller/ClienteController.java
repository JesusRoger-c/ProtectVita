package br.com.fiap.controller;
import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteDAO;

public class ClienteController {

	private ClienteDAO clienteDAO;

	public CandidatoController(ClienteDAO clienteDAO) {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.clienteDAO = new ClienteDAO(connection);
	}

	public void delete(Integer IdCliente) {
		this.clienteDAO.delete(IdCliente);
	}

	public void insert(Cliente cliente) {
		this.clienteDAO.insert(cliente);
	}

	public List<Cliente> findAll() {
		return this.clienteDAO.findAll();
	}

	//public void update(Cliente cliente) {
		//this.clienteDAO.update(cliente);
	//}
	
	public void update(int idCliente, String nome, String email, String cpf, Double salario, String genero, Double idade, String senha) {
		this.update(idCliente, nome, email, cpf, salario, genero, idade, senha);
	}

}

