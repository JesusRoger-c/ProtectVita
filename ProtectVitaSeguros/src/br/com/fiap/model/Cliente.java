package br.com.fiap.model;

import java.time.LocalDate;

import br.com.fiap.util.CriptografiaUtils;

public class Cliente {

	private String nome;
	private int idCliente;
	private String cpf;
	private double idade;
	protected double salario;
	private String genero;
	private String email;
	private String senha;
	
	
	public Cliente() {
		
	}


	public Cliente(String nome, String cpf, double idade, double salario, String genero, String email, String senha, Int idCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
		this.genero = genero;
		this.email = email;
		this.senha = senha;
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		try {
			this.senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}