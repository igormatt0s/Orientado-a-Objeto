//Nome: Igor Araujo de Mattos - RA: 2346443

public class Carga extends Veiculo implements Calc{
	
	private int tara;
	private int cargaMax;

	public Carga(){
		tara = 0;
		cargaMax = 0;
	}

	public int calcVel(int x){
		int c = 0;
		c = x * 100000;
		return c;
	}

	public int calcular(){
		int soma = 0;
		soma += this.getCargaMax();
		soma += this.getQtdRodas();
		soma += this.getVelocMax();
		soma += this.getMotor().getQtdPistoes();
		soma += this.getMotor().getPotencia();
		soma += this.getTara();
		return soma;
	}

	public int getTara(){
		return tara;
	}

	public int getCargaMax(){
		return cargaMax;
	}

	public void setTara(int tara){
		this.tara = tara;
	}

	public void setCargaMax(int cargaMax){
		this.cargaMax = cargaMax;
	}

}