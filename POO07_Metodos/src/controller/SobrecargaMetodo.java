package controller;

public class SobrecargaMetodo {
	//variáveis globais
	public int idade;
	public String nome;

	public static void main(String[] args) {
		//instanciando objeto: scm
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(58);
		scm.cadastrarPessoa("Jorge Nogueira");
		scm.cadastrarPessoa(35, "Fabrício Curvello");	
	}//fim do método main
	
	public void cadastrarPessoa (int valor){
		idade = valor;
		System.out.println("Idade: " + idade);
		}
	public void cadastrarPessoa (String valor ){
		nome = valor;
		System.out.println("Nome: " + nome);
	}
	public void cadastrarPessoa (int valor1, String valor2){
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " – Nome: " + nome);
		}

}//fim da classe
