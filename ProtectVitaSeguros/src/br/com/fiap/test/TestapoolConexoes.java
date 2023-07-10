package br.com.fiap.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.connection.ConnectionFactory;

public class TestapoolConexoes {

	public static void main(String[] args) throws SQLException {

		for (int i = 0; i < 50; i++) {
			Connection conexao = ConnectionFactory.conectar();
			System.out.println("Conex�o: " + i);
		}

	}

}

