package br.com.fiap.connection;

public class ConnectionFAC {
	
	private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = JOptionPane.showInputDiaLog("digite Usuario: ");
	private String password = JOptionPane.showInputDiaLog("digite sua senha: ");
	
	public Connection conectar() {
		
		try {
			return DriverManager.getConnection(schema, user, password);
		}catch (SQLException e) {
			System.out.println("Erro ao conectar");
			throw new RunTimeException(e);
		}
	}

}
