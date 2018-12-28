package colecoes;


import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrdenado {

public static void main(String[] args) {
		
		// COM LinkedHashSet DA FORMA QUE ENTROU É DA FORMA QUE VAI SAIR
		Set<String> aprovados = new TreeSet<String>();
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
