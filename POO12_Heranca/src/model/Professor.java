package model;

public class Professor extends Pessoa{ 
	
	private String formacao;
	
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
