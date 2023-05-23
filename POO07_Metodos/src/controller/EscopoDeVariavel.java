package controller;

public class EscopoDeVariavel {

	public static int x = 1; //variável global
	
	public static void main(String[] args) {
		int x = 5;//variável local
		System.out.println("X no início de main() é " + x);	
		metodoA();//chamando o metodoA de dentro do main
		metodoB();
		metodoA();
		metodoB();//executa a variável global acumulada
		metodoB(x);
		metodoB(4);
		int y = 7;
		metodoB(y);
	}//fim do método main
	
	public static void metodoA(){
		int x = 25;//variável local
		System.out.println("Variavel local x ao entrar no metodoA é " + x);
		x=x+1;
		System.out.println("variável local x antes de sair do metodoA é " + x);
	}//fim do métodoA()
	
	public static void metodoB(){
		System.out.println("Variavel x ao entrar no metodoB é " + x + " global");
		x=x*10;//valor de x recebe a variável global
		System.out.println("variável x antes de sair do metodoB é " + x);
	
	}//fim do métodoB()
	public static void metodoB(int x){
		System.out.println("Variavel x ao entrar no metodoB é " + x + " local");
		x=x*10;//valor de x recebe a variável global
		System.out.println("variável x antes de sair do metodoB é " + x);
		
	}//fim do métodoB(int x) 

}//fim da classe
