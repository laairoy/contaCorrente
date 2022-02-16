package me.dio;

public class Main {
	public static void main(String[] args) {
		Cliente Rafa = new Cliente("Rafa");

		Conta cc = new ContaCorrente(Rafa);
		Conta poupanca = new ContaPoupanca(Rafa);

		cc.depositar(1000);
		cc.transferir(50.5, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
