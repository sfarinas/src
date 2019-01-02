package api;

public class ExplorandoString {
	
	public static void main(String[] args) {
		// JEITO ERRADO, POREM FUNCIONAL
		String nome = new String("Gustavo");
		
		// JEITO MAIS SIMPLES
		nome = "Gus" + "tavo";
		
		// AJGUNS METODOS.
		System.out.println(nome.toUpperCase() + ": Conteudo da Variavel em Maiusculo: ");
		System.out.println(nome.length() + ": Contagem de caracteres da variavel: ");
		System.out.println(nome.substring(0, 3) + ": Os 3 primeiro caracteres da variavel: ");
		System.out.println(nome.indexOf('s') + ": Em qual posicao tem a letra (S): ");
		System.out.println(nome.charAt(6) + ": Quem esta na posicao 6: ");
		System.out.println(nome.equalsIgnoreCase("leonardo") + ": Comparando a variavel sem comparar maiusculo ou minusculo: ");
		System.out.println(nome.startsWith("Leo") + ": Comparando o inicio da variavel: ");
		System.out.println(nome.isEmpty() + ": Comparar se a string esta vazia: ");
		System.out.println(nome.concat(" é muito Bacana").concat("!"));
		
		// ALTERANDO A VARIAVEL
		nome = nome.toUpperCase().substring(0, 4).concat(" é bacana");
		System.out.println(nome);
	}

}
