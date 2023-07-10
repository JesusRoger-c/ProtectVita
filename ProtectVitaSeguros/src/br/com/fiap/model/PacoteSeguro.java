package br.com.fiap.model;

public class PacoteSeguro {
    private double valorPagar;
    private Int idPacoteSeguro;
    private String tpPacote;
    
    public PacoteSeguro() {
    	
    }

    public PacoteSeguro(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    public Int getIdPacoteSeguro() {
		return idPacoteSeguro;
	}

	public void setIdPacoteSeguro(Int idPacoteSeguro) {
		this.idPacoteSeguro = idPacoteSeguro;
	}
	

	public String getTpPacote() {
		return tpPacote;
	}

	public void setTpPacote(String tpPacote) {
		this.tpPacote = tpPacote;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public void ContaIdade(Cliente cliente) {
        double idade = cliente.getIdade();
        String genero = cliente.getGenero();
        double salario = cliente.getSalario();

        // Cálculo acrescimento por idade
        if (idade <= 15) {
            valorPagar += valorPagar * 1; // %
        } else if (idade <= 20) {
            valorPagar += valorPagar * 1.5; // %
        } else if (idade <= 25) {
            valorPagar += valorPagar * 2; // %
        } else if (idade <= 30) {
            valorPagar += valorPagar * 2.5; // %
        } else if (idade <= 35) {
            valorPagar += valorPagar * 3; // %
        } else if (idade <= 40) {
            valorPagar += valorPagar * 3.5; // %
        } else if (idade <= 45) {
            valorPagar += valorPagar * 4; // %
        } else if (idade <= 50) {
            valorPagar += valorPagar * 4.5; // %
        } else if (idade <= 55) {
            valorPagar += valorPagar * 5; // %
        } else if (idade <= 60) {
            valorPagar += valorPagar * 5.5; // %
        } else if (idade <= 65) {
            valorPagar += valorPagar * 6; // %
        } else if (idade <= 70) {
            valorPagar += valorPagar * 6.5; // %
        } else if (idade <= 75) {
            valorPagar += valorPagar * 7; // %
        } else if (idade <= 80) {
            valorPagar += valorPagar * 7.5; // %
        } else {
            valorPagar += valorPagar * 8; // para idades acima de 80
        }

        // Cálculo do acréscimo por gênero
        if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("Mulher")) {
            valorPagar += valorPagar * 1; // 100% para mulheres
        } else if (genero.equalsIgnoreCase("H") || genero.equalsIgnoreCase("Homem")) {
            valorPagar += valorPagar * 1.5; // 200% para homens
        } else {
            System.out.println("Gênero inválido. Por favor, digite novamente.");
            return;
        }

        // Cálculo do desconto salarial
        double descontoSalario = buscarDescontoSalario(salario);
        valorPagar *= (1 - descontoSalario);
    }

    private double buscarDescontoSalario(double salario) {
        if (salario <= 1000) {
            return 0.1; // 10%
        } else if (salario <= 2000) {
            return 0.08; // 8%
        } else if (salario <= 3000) {
            return 0.06; // 6%
        } else if (salario <= 4000) {
            return 0.04; // 4%
        } else if (salario <= 5000) {
            return 0.02; // 2%
        } else if (salario <= 6000) {
            return 0.001; // 0.1%
        } else if (salario <= 7000) {
            return 0.008; // 0.8%
        } else if (salario <= 8000) {
            return 0.006; // 0.6%
        } else if (salario <= 9000) {
            return 0.004; // 0.4%
        } else if (salario <= 10000) {
            return 0.002; // 0.2%
        } else if (salario <= 20000) {
            return 0.0008; // 0.08%
        } else if (salario <= 30000) {
            return 0.0006; // 0.06%
        } else if (salario <= 40000) {
            return 0.0004; // 0.04%
        } else if (salario <= 50000) {
            return 0.0002; // 0.02%
        } else if (salario <= 60000) {
            return 0.0001; // 0.01%
        } else if (salario <= 70000) {
            return 0.00008; // 0.008%
        } else if (salario <= 80000) {
            return 0.00006; // 0.006%
        } else if (salario <= 90000) {
            return 0.00004; // 0.004%
        } else {
            return 0.00002; // 0.002% para salários acima de 100000
        }
    }

    public double getValorPagar() {
        return valorPagar;
    }
}