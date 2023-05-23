package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Reptil jacare = new Reptil();
		jacare.setNomenclatura("Jacaré");
		jacare.setNumeroDePatas(4);
		jacare.setCobertoPor("Escamas");
		jacare.setReproducao("Ovíparo");
		jacare.setAlimentacao("Carnívoro");
		jacare.setCapacidadeRegenerativa(false);
		
		Reptil largatixa = new Reptil("Largatixa", 4, "Escamas", "Ovíparo", "Carnívoro", true);
		
		Mamifero cachorro = new Mamifero("Cachorro", 4, "Pelos", "Vivíparo", "Carnívoro", "Terrestre");
		
		Mamifero baleia = new Mamifero("Baleia", 0, "Pele", "Vivíparo", "Carnívoro", "Aquático");
		
		jacare.tipoDeRespiracao();
		baleia.tipoDeRespiracao();
		
		jacare.exibir();
		baleia.exibir();
		
		largatixa.exibir();
		cachorro.exibir();;
	}

}
