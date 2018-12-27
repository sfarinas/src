package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto;
	
	Produto() {
		
	}
	// Usado para trabalhar no modo static
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;		
	}
	
	//Produto(String nome, double preco, double desconto) {
		//this.nome = nome;
		//this.preco = preco;
		//this.desconto = desconto;
	//}
	
	
	
	double precoComDesconto() {
		
		return preco - preco * desconto;
	}
}
