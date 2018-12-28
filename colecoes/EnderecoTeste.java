package colecoes;

public class EnderecoTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Finito", 10, "Sala 5");
		Endereco endereco2 = new Endereco("Rua Loop Finito", 10, "Sala 5");
		
		// GEITO ERRADO POIS ELE ESTA COMPARANDO ENDERECO DE MEMORIA
		System.out.println(endereco1 == endereco2);
		
		// VOLTE A CLASSE ENDERECO E PRECIONE O TECLADO: ALT + SHIFT + S
		// ESCOLHA A OPCAO QUE TENHA EQUALS()...
		System.out.println(endereco1.equals(endereco2));
	}

}
