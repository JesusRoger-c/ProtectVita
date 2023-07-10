package br.com.fiap.controller;
import br.com.fiap.model.PacoteSeguro;
import br.com.fiap.repository.PacoteSeguroDAO;

public class PacoteSeguroController {
	
	
	
	private PacoteSeguroDAO pacoteSeguroDAO;

	public PacoteSeguroController(PacoteSeguroDAO pacoteSeguroDAO) {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.pacoteSeguroDAO = new PacoteSeguroDAO(connection);
	}

	public void delete(Integer IdPacoteSeguro) {
		this.pacoteSeguroDAO.delete(IdPacoteSeguro);
	}

	public void insert(PacoteSeguro pacoteSeguro) {
		this.pacoteSeguroDAO.insert(pacoteSeguro);
	}

	public List<PacoteSeguro> findAll() {
		return this.pacoteSeguroDAO.findAll();
	}

	//public void update(PacoteSeguro pacoteSeguro) {
		//this.pacoteSeguroDAO.update(pacoteSeguro);
	//}
	
	
	public void update(int idPacote, Double valorPagar, String tpPacote) {
		this.update(idPacote, valorPagar, tpPacote);
	}


}
