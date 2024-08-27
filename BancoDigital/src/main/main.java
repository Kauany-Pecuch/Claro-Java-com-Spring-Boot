package main;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class main {

    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Thalita", 99999999999L, 66966666666L);
        Cliente cliente2 = new Cliente("João", 88888888888L, 67777777777L);

        // Criando contas
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, 500.00);
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.00, cliente1);

        // Operações na conta corrente 1
        System.out.println("Operações na Conta Corrente 1:");
        contaCorrente1.depositar(1000.00); // Deposita R$ 1000,00
        contaCorrente1.sacar(200.00); // Saca R$ 200,00
        contaCorrente1.transferir(300.00, contaCorrente2); // Transfere R$ 300,00 para a Conta Corrente 2
        contaCorrente1.imprimirExtrato();

        // Operações na conta corrente 2
        System.out.println("\nOperações na Conta Corrente 2:");
        contaCorrente2.depositar(500.00); // Deposita R$ 500,00
        contaCorrente2.sacar(100.00); // Saca R$ 100,00
        contaCorrente2.imprimirExtrato();

        // Operações na conta poupança
        System.out.println("\nOperações na Conta Poupança:");
        contaPoupanca.depositar(500.00); // Deposita R$ 500,00
        contaPoupanca.sacar(100.00); // Saca R$ 100,00
        contaPoupanca.aplicarJuros(); // Aplica juros
        contaPoupanca.imprimirExtrato();
    }
}
