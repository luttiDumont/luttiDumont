package javaCourse;

public class Run {

	
	public static void main(String[] args) {
		
		// este metodo funciona como uma chave de ignição.
		//executa qualquer metodo de classe instanciada aqui 
		//dentro .
		// hw é o Objeto da classe HelloWorld,
		// mensagemPrincipal(), é o metodo a ser executado.
		// mas, antes será executado o Construtor da classe.
		
		HelloWorld hw = new HelloWorld();
		hw.mensagemPrincipal();

	}

}
