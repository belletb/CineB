package br.com.alura.cineb;

import br.com.alura.cineb.principal.Main;
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

		Main main = new Main();
		main.exibeMenu();
	}
}

