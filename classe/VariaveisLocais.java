package classe;

public class VariaveisLocais {

	int a = 2;
	int a1 = 9;
	//CRIANDO METODO DE INSTACIA TESTE1
	void teste1() {
		// criando uma variavel detro do metodo, ele só podera ser usada
		// pelo METODO.
		int a1 = 2;
		
		System.out.println(a);
		
		if(a1 > 3) {
			int a2 = 3;
			System.out.println(a2);
		}
	}
	
	void teste2() {
		int a1 = 7;
		//USANDO VARIAVEL CRIADA NO METODO.
		System.out.println(a1);
		
		//USANDO AS VARIAVEIS CRIADAS FORA DO METODO.
		System.out.println(this.a1);
		
		// VAMOS APRENDER A USAR A VARIAVEL FORA DO FOR.
		// O NORMAL É ASSIM.
		//for (int i = 1; 1 < 10; i++) {
			//System.out.println(i);
		//}
		
		// AGORA USAREMOS A VARIAVEL FORA DO FOR.
		int i = 0;
		for (;i < 10;i++) {
			
		}
		// fora do for
		System.out.println(i);
		
	}
	
	
}
