package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cliente;

public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(Cliente cliente) {
		String sql = "INSERT INTO usuarios(nome, cpf, idade, salario, genero, email, senha) VALUES (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setDouble(3, cliente.getIdade());
			stmt.setDouble(4, cliente.getSalario());
			stmt.setString(5, cliente.getGenero());
			stmt.setString(6, cliente.getEmail());
			stmt.setString(7, cliente.getSenha());
			stmt.setString(8, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> selectAll() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "SELECT * FROM usuarios ORDER BY nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setIdade(rs.getDouble("idade"));
				cliente.setDataDeNascimento(rs.getDate("dataDeNascimento").toLocalDate());
				cliente.setSalario(rs.getDouble("salario"));
				cliente.setGenero(rs.getString("genero"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));

				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public Cliente selectById(int id) {
		Cliente cliente = null;
		String sql = "SELECT * FROM usuarios WHERE id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setIdade(rs.getDouble("idade"));
				cliente.setSalario(rs.getDouble("salario"));
				cliente.setGenero(rs.getString("genero"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void delete(int id) {
		String sql = "DELETE FROM usuarios WHERE id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Cliente cliente) {
		String sql = "UPDATE usuarios SET nome=?, cpf=?, idade=?, salario=?, genero=?, email=?, senha=? WHERE id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setDouble(3, cliente.getIdade());
			stmt.setDouble(4, cliente.getSalario());
			stmt.setString(5, cliente.getGenero());
			stmt.setString(6, cliente.getEmail());
			stmt.setString(7, cliente.getSenha());
			stmt.setLong(8, cliente.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
