package br.com.alura.cineb;

import br.com.alura.cineb.model.DadosSerie;
import br.com.alura.cineb.service.ConsumoAPI;
import br.com.alura.cineb.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CinebApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}

