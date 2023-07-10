package br.com.fiap.repository;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.PacoteSeguro;

public class PacoteSeguroDAO {
	
	
	
	private Connection conexao;

	public ClienteDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}

	public void insert(PacoteSeguro seguros) {
		String sql = "INSERT INTO usuarios(idPacoteSeguro, valorPagar, tpSeguro) VALUES (?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, seguros.getIdPacoteSeguro());
			stmt.setString(2, seguros.getValorPagar());
			stmt.setString(3, seguros.getTpSeguro());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<PacoteSeguro> selectAll() {
		List<PacoteSeguro> seguros = new ArrayList<>();
		String sql = "SELECT * FROM usuarios ORDER BY nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				PacoteSeguro seguro = new PacoteSeguro();
				seguro.setIdPacoteSeguro(rs.getInt("id"));
				seguro.setValorPagar(rs.getDouble("ValorPagar"));
				seguro.setTpSeguro(rs.getString("tpSeguro"));
				seguro.add(seguros);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return seguros;
	}

	public PacoteSeguro selectById(int idPacoteSeguro) {
		PacoteSeguro seguro = null;
		String sql = "SELECT * FROM usuarios WHERE idPacoteSeguro=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idPacoteSeguro);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				seguro = new PacoteSeguro();
				seguro.setIdPacoteSeguro(rs.getInt("id"));
				seguro.setValorPagar(rs.getDouble("valorPgar"));
				seguro.setTpSeguro(rs.getDouble("tpSeguro"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return seguro;
	}

	public void delete(int idPacoteSeguro) {
		String sql = "DELETE FROM usuarios WHERE idPacoteSeguro=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idPacoteSeguro);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(PacoteSeguro seguro) {
		String sql = "UPDATE usuarios SET valorPagar=?, tpSeguro=? WHERE idPacoteSeguro=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, seguro.getValorPagar());
			stmt.setString(2, seguro.getTpSeguro());
			stmt.setString(3, seguro.getIdPacoteSeguro());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


}
