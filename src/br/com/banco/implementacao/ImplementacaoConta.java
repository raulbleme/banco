package br.com.banco.implementacao;
import br.com.banco.modelo.Conta;
import br.com.banco.tela.Magica;

public class ImplementacaoConta {

	public static void main(String[] args) {
		Conta conta = new Conta(
		Magica.t("Numero da conta:"),
		new Agencia(
				Magica.i("Número da agência:"),
				Magica.t("Nome da agência:"),
				
				)
		
		)
	}

}
