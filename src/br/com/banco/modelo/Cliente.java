package br.com.banco.modelo;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;
	
		public Cliente() {
		
	}
	
	public Cliente(int codigo, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public void setAll(int codigo, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return "Codigo: " + codigo + "\n" +
				"Nome: " + nome + "\n" +
				"E-mail: " + email + "\n" +
				"Telefone: " + fone + "\n" +
				"CPF: " + cpf + "\n" +
				"Endereço: " + endereco.getAll();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
