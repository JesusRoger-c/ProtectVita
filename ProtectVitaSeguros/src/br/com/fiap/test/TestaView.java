package br.com.fiap.test;

import java.sql.SQLException;

import br.com.fiapview.JHomem;
import br.com.fiapview.JLogin;
import br.com.fiapview.JMulher;
import br.com.fiapview.JPerfil;
import br.com.fiapview.JRegister;

public class TestaView {

	public static void main(String[] args) {
		
		
		JRegister frame = null;
		try {
			register = new JRegister();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		register.setDefaultCloseOperation(JRegister.EXIT_ON_CLOSE);
	}


	JHomem frame = null;
	try {
		homem = new JHomem();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	homem.setDefaultCloseOperation(JHomem.EXIT_ON_CLOSE);

	JMulher frame = null;
	try {
	mulher = new JMulher();
	} catch (SQLException e) {
	e.printStackTrace();
}
	mulher.setDefaultCloseOperation(JMulher.EXIT_ON_CLOSE);
}

	
	JPerfil frame = null;
	try {
	perfil = new JPerfil();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	perfil.setDefaultCloseOperation(JPerfil.EXIT_ON_CLOSE);

	
	JLogin frame = null;
	try {
	login = new JLogin();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	login.setDefaultCloseOperation(JLogin.EXIT_ON_CLOSE);
	}
	}
	
	