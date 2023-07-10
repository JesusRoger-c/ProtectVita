package erros;

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
		String sql = "insert into usuarios(nome, email, senha, data) values (?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getSenha());
			stmt.setDate(4, cliente.getDataDeNascimento());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> selectAll() {
		List<Cliente> cliente = new ArrayList<Cliente>();
		String sql = "select * from usuarios order by nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setDataDeNascimento(rs.getDate("data"));

				cliente.add(cliente);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public Cliente selectById(int id) {
		Cliente cliente = null;
		String sql = "select * from usuarios where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				//cliente.setDataDeNascimento(rs.getDate("data"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void delete(int id) {
		String sql = "delete from usuarios where id=?";
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
		String sql = "update usuarios set nome=?, email=?, senha=? where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getSenha());
			stmt.setLong(4, cliente.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
