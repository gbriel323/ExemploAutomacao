package br.com.stepDefinition.consultaFilme;

import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public final class ConsultaFilme {

	@Before
	public void beforeTest() {
	}

	@Dado("^que estou no 'Google Chrome'$")
	public void que_estou_no_Google_Chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.print("Teste");
	}

	@Dado("^preencho o campo 'Busca' \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencho_o_campo_Busca_e(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Quando("^clico no botão 'Consultar'$")
	public void clico_no_botão_Consultar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Entao("^sistema apresenta a quantidade de resultado da busca$")
	public void sistema_apresenta_a_quantidade_de_resultado_da_busca() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}
}
