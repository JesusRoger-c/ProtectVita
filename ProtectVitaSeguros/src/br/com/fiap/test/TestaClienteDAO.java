package br.com.fiap.test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteDAO;

public class TestaClienteDAO {

	public static void main(String[] args) throws SQLException {

		ClienteDAO dao = new ClienteDAO();
		Cliente roger = new Cliente("Roger", "45345387970", 27, 1500.00, "masculino", "Roger@gmail.com", "123456");
		Cliente ana = new Cliente("Ana", "12343567834", 23, 2300.00, "feminino", "ana@gmail.com", "654321");
		
		dao.insert(roger);
		dao.insert(ana);

		List<Cliente> clientes = dao.selectAll();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getCpf());
			System.out.println(cliente.getIdade());
			System.out.println(cliente.getSalario());
			System.out.println(cliente.getGenero());
			System.out.println(cliente.getEmail());
			System.out.println(cliente.getSenha());
		}
	
		Cliente cliente = dao.selectById(1);

		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getSalario());
		System.out.println(cliente.getGenero());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getSenha());
	}
}