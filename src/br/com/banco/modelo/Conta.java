package br.com.banco.modelo;

public class Conta {
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private float saldo;
	
	public Conta() {
		
	}
	
	public Conta(String numero, Agencia agencia, Cliente cliente, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public void deposito(float valor) {
		saldo = saldo + valor;
	}
	
	public void saque(float valor) {
		saldo = saldo - valor;
	}
	
	public String exibirSaldo() {
		return "Olá, " + cliente.getNome() + " o seu saldo é de R$" + saldo + ".";
	}
	
	public void setAll(String numero, Agencia agencia, Cliente cliente, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getAll() {
		return "Numero da agência: " + numero + "\n" +
				"Nome da agência: " + agencia + "\n" +
				"Nome do cliente: " + cliente.getNome() + "\n" +
				"Saldo da conta: " + saldo;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
