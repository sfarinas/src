package classe;

public class Desafio {

	// Variavel de instancia (a), precisa ser acessada por esta classe.
	int a = 2;
	
	// Se tem static, é por que pertence a classe
	public static void main(String[] args) {
		
		//É preciso criar uma instacia para comportar a variavel (a).
		Desafio d = new Desafio();
		System.out.println(d.a);
	}
	
	// Metodo teste é um metodo de instancia, por isso ele nao ve 
	// problema em acessar uma variavel de instancia como é o caso da (a).
	
	//void teste() {
		//System.out.println(a);
	//}
}
