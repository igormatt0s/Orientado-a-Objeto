//Nome: Igor Araujo de Mattos - RA: 2346443

public abstract class Veiculo{
	
	private String placa;
	private String marca;
	private String modelo;
	private String cor;

	private int qtdRodas;
	private int velocMax;

	private Motor motor;
	private String dataCadastro;

//=============================================================================
	
	public Veiculo(){
		placa = "";
		marca = "";
		modelo = "";
		cor = "";

		qtdRodas = 0;
		velocMax = 0;

		motor = new Motor();
		dataCadastro = "";
	}

	public abstract int calcVel(int x);

//==============================================================================

	public String getPlaca(){
		return placa;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getCor(){
		return cor;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public int getQtdRodas(){
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) trhows NumNegException{
		if(qtdRodas >= 0){
			this.qtdRodas = qtdRodas;
		}else{
			throw new NumNegException();
		}
	}

	public int getVelocMax(){
		return velocMax;
	}

	public void setVelocMax(int velocMax){
		
		if(10 > velocMax || velocMax > 250){
			System.out.println("\n A velocidade esta fora dos limites brasileiros!");
			this.velocMax = 100;
		}else{
			this.velocMax = velocMax;
		}
	}

	public Motor getMotor(){
		return motor;
	}
	
	public void setMotor(Motor motor){
		this.motor = motor;
	}

	public String getDataCadastro(){
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}

}