package colecoes;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportadissimo {

	public static void main(String[] args) {
		
		// COM LinkedHashSet DA FORMA QUE ENTROU É DA FORMA QUE VAI SAIR
		Set<String> aprovados = new LinkedHashSet<String>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Salomao");
		aprovados.add("Simone");
		
		for(Object nome: aprovados) {
			System.out.println(nome);
			
		}
	}
	
}
