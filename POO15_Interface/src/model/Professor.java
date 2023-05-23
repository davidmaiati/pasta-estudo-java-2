package model;

public class Professor extends Pessoa implements IPessoa{ 
	
	private String formacao;
	
	@Override
	public void sorrir() {
		System.out.println("Professor(a) " + super.getNome() + " está sorrindo");		
	}
	
	@Override
	public void mostrar() {
		System.out.println("\nMétodo mostrar - CLASSE PROFESSOR\n");
		
	}
	
	
	@Override //notação que indica um polimorfismo
	public void exibirMatriculaENome() {
		System.out.println("Matrícula: " + super.getMatricula() + " - Nome: " + super.getNome() + " - Formação " + this.formacao);
	}

	public Professor() {
		super();
	}

	public Professor(int matricula, String nome, String dataNascimento, String formacao) {
		super(matricula, nome, dataNascimento);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}



	
	
}
