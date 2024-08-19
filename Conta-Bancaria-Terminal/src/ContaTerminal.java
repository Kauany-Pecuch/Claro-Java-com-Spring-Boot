package com.desafio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Conta:");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next().trim();
        System.out.println("Por favor, digite seu Nome:");
        String nome = scanner.next().trim();
        System.out.println("Por favor, digite seu Saldo:");
        Double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
