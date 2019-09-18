package br.com.runner.consulta;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:C:\\Projetos\\TesteEntrevista\\src\\test\\resources\\features",
		plugin = "pretty",
		monochrome = true,
		tags = {"@CadastroeConsulta"},
		glue = {"br.com.stepDefinition.consultaFilme"},
		dryRun = false
		)
public class ConsultarDiretorFilme {

}
