package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Produto;

public class Cadastro {

	public static void main(String[] args) {
		
		
		Carro kombi = new Carro("VW,", "Kombi 1.6", "Branca", 2000);
		
		Carro corsa = new Carro("Chevrolet" , "corsa 1.2" , "Branca", 2000);
		
		
		Carro carro1 = new Carro();
		
		carro1.setFabricante("Honda"); 
		carro1.setModelo("Civic");
		carro1.setCor("Preto");
		carro1.setAno(2023);
		
//		Carro carro2 = new Carro();
		
//		carro2.fabricante = "Honda";
//		carro2.modelo = "Civic";
//		carro2.cor = "Branco";
//		carro2.ano = 2022;
	
//		Carro carro3 = new Carro();
		
//		carro3.fabricante = "Honda";
//		carro3.modelo = "Civic";
//		carro3.cor = "Prata";
//		carro3.ano = 2022;
		
		System.out.println("Fabricante: " + carro1.getFabricante() + "\nModelo: " + carro1.getModelo() + "\nCor: " +
		carro1.getCor() + "\nAno: " + carro1.getAno() + "\n");
		
//		System.out.println("Fabricante: " + carro2.fabricante + "\nModelo: " + carro2.modelo + "\nCor: " +
//				carro2.cor + "\nAno: " + carro2.ano + "\n");
//		
//		System.out.println("Fabricante: " + carro3.fabricante + "\nModelo: " + carro3.modelo + "\nCor: " +
//				carro3.cor + "\nAno: " + carro3.ano);
//		
//		System.out.println("\nFabricante: " +kombi.fabricante);
//		System.out.println("Modelo: "+kombi.modelo);
//		System.out.println("Cor: "+kombi.cor);
//		System.out.println("Ano: "+kombi.ano);
//		
	
		
		
		Funcionario fun1 = new Funcionario();
		
		fun1.matricula = 16692;
		fun1.nome = "Cloves";
		fun1.cpf = "15442554120";
		
		Funcionario fun2 = new Funcionario();
		
		fun2.matricula = 16698;
		fun2.nome = "Armando";
		fun2.cpf = "15442874120";
		Funcionario fun3 = new Funcionario();
		
		fun3.matricula = 16693;
		fun3.nome = "Zefinha";
		fun3.cpf = "15442563120";
		
		System.out.println("\nMatrícula do Funcionário: " + fun1.matricula);
		System.out.println("Nome do Funcionário: " + fun1.nome);
		System.out.println("Documento de indentificação: " + fun1.cpf);
		
		System.out.println("\nMatrícula do Funcionário: " + fun2.matricula);
		System.out.println("Nome do Funcionário: " + fun2.nome);
		System.out.println("Documento de indentificação: " + fun2.cpf);
		
		System.out.println("\nMatrícula do Funcionário: " + fun3.matricula);
		System.out.println("Nome do Funcionário: " + fun3.nome);
		System.out.println("Documento de indentificação: " + fun3.cpf);
		
		
		Livro livro1 = new Livro();
		
		livro1.isbn = 3215312;
		livro1.nome = "Favela Vive";
		livro1.autor = "Bolsonaro";
		livro1.editora = "Brazino";
		
		Livro livro2 = new Livro();
		
		livro2.isbn = 3219312;
		livro2.nome = "Favela Vive2";
		livro2.autor = "Bolsonaro";
		livro2.editora = "Brazino";
		
		Livro livro3 = new Livro();
		
		livro3.isbn = 3218312;
		livro3.nome = "Favela Vive3";
		livro3.autor = "Bolsonaro";
		livro3.editora = "Brazino";
		
		System.out.println("\nISBN: " + livro1.isbn);
		System.out.println("Nome: " + livro1.nome);
		System.out.println("Autor: " + livro1.autor);
		System.out.println("Editora: " + livro1.editora);
		
		System.out.println("\nISBN: " + livro2.isbn);
		System.out.println("Nome: " + livro2.nome);
		System.out.println("Autor: " + livro2.autor);
		System.out.println("Editora: " + livro2.editora);
		
		System.out.println("\nISBN: " + livro3.isbn);
		System.out.println("Nome: " + livro3.nome);
		System.out.println("Autor: " + livro3.autor);
		System.out.println("Editora: " + livro3.editora);
		
		Produto prod1 = new Produto();
		
		prod1.idProduto = 178945;
		prod1.nomenclatura = "Trakinas";
		prod1.descricao = "Trakinas sabor morango";
		prod1.quantidade = 1;
		
		Produto prod2 = new Produto();
		
		prod2.idProduto = 178944;
		prod2.nomenclatura = "Trakinas";
		prod2.descricao = "Trakinas sabor chocolate";
		prod2.quantidade = 1;
		
		Produto prod3 = new Produto();
		
		prod3.idProduto = 178946;
		prod3.nomenclatura = "Trakinas";
		prod3.descricao = "Trakinas sabor limão";
		prod3.quantidade = 1;
		
		System.out.println("\nID: " + prod1.idProduto );
		System.out.println("Produto: " + prod1.nomenclatura );
		System.out.println("Descrição: " + prod1.descricao );
		System.out.println("Quantidade: " + prod1.quantidade );
		
		System.out.println("\nID: " + prod2.idProduto );	
		System.out.println("Produto: " + prod2.nomenclatura );
		System.out.println("Descrição: " + prod2.descricao );
		System.out.println("Quantidade: " + prod2.quantidade );
		
		System.out.println("\nID: " + prod3.idProduto );
		System.out.println("Produto: " + prod3.nomenclatura );
		System.out.println("Descrição: " + prod3.descricao );
		System.out.println("Quantidade: " + prod3.quantidade );
		
	

	}

}
