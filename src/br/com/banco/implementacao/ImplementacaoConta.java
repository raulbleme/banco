package br.com.banco.implementacao;
import br.com.banco.modelo.Agencia;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;
import br.com.banco.tela.Magica;

public class ImplementacaoConta {

	public static void main(String[] args) {
		Conta conta = new Conta(
		Magica.t("Numero da conta:"),
		new Agencia(
				Magica.i("N�mero da ag�ncia:"),
				Magica.t("Nome da ag�ncia:"),
				new Endereco(
						Magica.t("Logradouro: "),
						Magica.t("Bairro: "),
						Magica.t("Cidade: "),
						Magica.t("CEP: "),
						Magica.t("N�mero: "),
						Magica.t("UF: "),
						Magica.t("Complemento: ")
						)
				),
		new Cliente(
				Magica.i("C�digo do cliente:"),
				Magica.t("Nome:"),
				Magica.t("E-Mail:"),
				Magica.t("Telefone:"),
				Magica.t("CPF:"),
				new Endereco(
						Magica.t("Logradouro: "),
						Magica.t("Bairro: "),
						Magica.t("Cidade: "),
						Magica.t("CEP: "),
						Magica.t("N�mero: "),
						Magica.t("UF: "),
						Magica.t("Complemento: ")
						)
				),
		5000.00f);
		
		System.out.println(conta.getAll());
		
		conta.deposito(Magica.f("Digite o valor do deposito:"));
		
		System.out.println(conta.exibirSaldo());
	}

}
