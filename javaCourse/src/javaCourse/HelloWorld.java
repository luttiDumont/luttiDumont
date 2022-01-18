package javaCourse;

public class HelloWorld {
	
	private String mensagem  = "";

	// usando  construtor para enviar uma mensagem
	public HelloWorld() {
		super();
		String msgConst = "Parabens,  Sua Primeira Classe ...";
		System.out.println(msgConst);
	}
	
	public void mensagemPrincipal() {
		
		String msg = "Hello World !!";
		System.out.println(msg);
	}
	
	//ps. Esta classe será Instanciada e 
	// executada pela classe Run.java

}
