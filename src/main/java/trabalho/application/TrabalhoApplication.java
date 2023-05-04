package trabalho.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class TrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a entrada de strings: ");
        String entrada = scanner.nextLine();

        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < entrada.length(); i++) {
            if (i % 2 == 0) {
                saida.append(Character.toUpperCase(entrada.charAt(i)));
            } else {
                saida.append(Character.toLowerCase(entrada.charAt(i)));
            }
        }

        System.out.println("Saída: " + saida.toString());

        scanner.close();
		
	}

}
