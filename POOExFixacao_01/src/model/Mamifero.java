package model;

public class Mamifero extends Animal implements IAnimal{
	
	private String habitat;

	public Mamifero() {
		super();
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println(" Pulmonar");
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal: Homeotérmico ");
		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- EXIBIR MAMÍFERO ---");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Número de patas: " + super.getNumeroDePatas());
		System.out.println("Coberto por:  " + super.getCobertoPor());
		System.out.println("Reprodução:  " + super.getReproducao());
		System.out.println("Alimentação:  " + super.getAlimentacao());
		System.out.println("Habitat:  " + this.habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
		
	}
}
