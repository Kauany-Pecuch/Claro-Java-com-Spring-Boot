package model;

public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 0.02; // 2% de juros

    // Construtor
    public ContaPoupanca(double par, Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    // Método para aplicar juros
    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
    }

    // Método para imprimir o extrato
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }
}
