package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	public String frear (int valor) {
		if(!this.motorLigado) {
			return this.modelo + " --> ATENÇÃO: O motor está desligado! O carro já está parado!";
		} else {
			if (this.velocidade == 0) {
				return this.modelo + " --> ATENÇÃO: O carro já está parado!";
			} else {
				if (this.velocidade - valor <= 0) {
					this.velocidade = 0;
					return this.modelo + " --> FREOU!!! O carro já está parado!";
				} else {
					this.velocidade -= valor;
					return this.modelo + " --> FREOU!!! Velocidade atual: <velocidade> km/h";
				}
			}
		}
	}
	
	public String acelerar( int valor) {
		if (this.motorLigado) {
			//aumentar a velocidade
			this.velocidade += valor; //this.velocidade = this.velocidade + valor;
			return this.modelo + " --> ACELEROU!!! Velocidade atual: " + this.velocidade +" km/h.";
 		} else {
 			return this.modelo + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!";
 		}
	}
	
	public String desligarMotor() {
		//verificando se o motor está desligado
		if( !this.motorLigado) {
			return "O motor do " + this.modelo + " já estava desligado";
		} else { 
			if (this.velocidade > 0) {
				return "ATENÇÃO: o motor do " + this.modelo + " não foi desligado pois o carro está em movimento";
			} else {
				this.motorLigado = false;
				return "O motor do " + this.modelo + " foi desligado agora";
			}
		}
	}
	
	public String ligarMotor() {
		if(this.motorLigado) {
			return "O motor do " + this.modelo + " já estava ligado";
		} else   {
			this.motorLigado = true;
			return "O motor do " + this.modelo + " foi ligado";
		}
	}
	
	public String situacaoMotor() {
		if (this.motorLigado == true) {
			return this.modelo + " --> Motor Ligado";
		} else {
			return this.modelo + " --> Motor Desligado";
		}
	}
	
	public void detalhes() {
		System.out.println("--- Detalhes do carro ---");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + getAno() + "\n");
	}
	
	///método construtor simples
	public Carro() {
		super();
	}

	//métodos construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

		
	//método construtor personalizado (terceiro m. construtor)
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}
	
	//métodos getters e setters
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	

}
