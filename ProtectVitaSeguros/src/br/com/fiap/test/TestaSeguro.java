package br.com.fiap.test;
import br.com.fiap.model.PacoteSeguro;
import br.com.fiap.model.Cliente;

public class TestaSeguro {
    public static void main(String[] args) {
        // Criando um objeto Cliente
        Cliente cliente = new Cliente("Fulano", "123.456.789-00", 80, 1000.00, "Homem");

        // Criando um objeto CalculoValor
        PacoteSeguro calculoValor = new PacoteSeguro(10);

        // Chamando o método ContaIdade para calcular o valor a ser pago
        calculoValor.ContaIdade(cliente);

        // Obtendo o valor atualizado a ser pago
        double valorAtualizado = calculoValor.getValorPagar();

        // Exibindo o valor atualizado a ser pago
        System.out.println("Valor a ser pago: R$" + valorAtualizado);
    }
    
    
    
    
    
    
    
    
    
}