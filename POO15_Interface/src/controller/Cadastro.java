package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(501, "David", "27/02", "Masculino", 252);
		a1.exibirMatriculaENome();
		a1.mostrar();
		a1.sorrir();
		
		Professor pr1 = new Professor(741, "Flávia", "28/05/1975", "Design");
		pr1.exibirMatriculaENome();
		pr1.mostrar();
		pr1.sorrir();
		
//		Pessoa p1 = new Pessoa();
//		p1.setMatricula(152);
//		p1.setNome("Lohan");
//		p1.setDataNascimento("27/02/2000");
//		
//		p1.exibirMatriculaENome();
		
		System.out.println(a1);
		
	}

}
