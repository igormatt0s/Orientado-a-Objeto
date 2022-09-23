//Nome: Igor Araujo de Mattos - RA: 2346443

public class Motor{
	
	private int qtdPistoes;
	private int potencia;

	public Motor(){
		qtdPistoes = 0;
		potencia = 0;
	}

	public int getQtdPistoes(){
		return qtdPistoes;
	}

	public int getPotencia(){
		return potencia;
	}

	public void setQtdPistoes(int qtdPistoes) trhows NumNegException{
		if(qtdPistoes >= 0){
			this.qtdPistoes = qtdPistoes;
		}else{
			throw new NumNegException();
		}
	}

	public void setPotencia(int potencia) trhows NumNegException{
		if(potencia >= 0){
			this.potencia = potencia;
		}else{
			throw new NumNegException();
		}
	}
}