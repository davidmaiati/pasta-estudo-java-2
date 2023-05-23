package model;

public class Carro {

	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	
	//void -> sem retorno 
	
	//metodo construtor simples
	public Carro() {
		super();
	}
	
	
	//metodo contrutor completo
	public Carro(String fabricante, String modelo, String cor, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}


	//metódos getters e setters
	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

}//fim da classe
