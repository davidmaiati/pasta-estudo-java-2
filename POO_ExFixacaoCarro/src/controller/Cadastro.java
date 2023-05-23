package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		
		//instanciando obj pelo método simples
		Carro uno = new Carro();
		
		uno.setFabricante("|Fiat");
		uno.setModelo("Uno Mille 1.0");
		uno.setAno(2010);
		uno.setMotorLigado(false);
		uno.setVelocidade(0);
		
		//instanciando obj pelo método completo
		Carro gol = new Carro("VW", "Gol Turbo", 2015, true, 70 );
		
		
		//instanciando obj pelo método personalizado
		Carro ka = new Carro("Ford", "Ka Sedan", 2020);
//		System.out.println("Modelo: " + ka.getModelo());
//		System.out.println("Motor Ligado? " + ka.isMotorLigado());
//		System.out.println("Velocidade: " + ka.getVelocidade());
		
		
		uno.detalhes();
		gol.detalhes();
		ka.detalhes();
		
		String texto = uno.situacaoMotor();
		System.out.println(texto);
		
		System.out.println(gol.situacaoMotor());
		System.out.println(ka.situacaoMotor() + "\n");
		
		System.out.println(gol.ligarMotor());
		System.out.println(ka.ligarMotor());
		System.out.println(uno.ligarMotor() + "\n");
		
		ka.setMotorLigado(false); 
		
		System.out.println(gol.desligarMotor());
		System.out.println(ka.desligarMotor());
		System.out.println(uno.desligarMotor() + "\n");
		
		System.out.println(uno.acelerar(50));
		System.out.println(gol.acelerar(30) + "\n");
		
		System.out.println(uno.frear(100));
		System.out.println(gol.frear(60));
		System.out.println(ka.frear(0));
		
	}

}
