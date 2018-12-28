package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new HashSet<String>();
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
