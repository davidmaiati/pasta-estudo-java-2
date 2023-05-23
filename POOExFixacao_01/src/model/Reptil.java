package model;

public class Reptil extends Animal implements IAnimal {
	
	private boolean capacidadeRegenerativa;

	public Reptil() {
		super();
	}

	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println(" Traquial");
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal: Pecilotérmico");
		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- EXIBIR RÉPTIL ---");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Número de patas: " + super.getNumeroDePatas());
		System.out.println("Coberto por:  " + super.getCobertoPor());
		System.out.println("Reprodução:  " + super.getReproducao());
		System.out.println("Alimentação:  " + super.getAlimentacao());
		if (this.capacidadeRegenerativa ) {
			System.out.println("Capacidade regenerativa: Verdadeiro");
		} else System.out.println("Capacidade regenerativa: Falso");
		
		tipoDeRespiracao();
		temperaturaCorporal();
		
	}

}
