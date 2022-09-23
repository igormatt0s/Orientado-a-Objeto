//Nome: Igor Araujo de Mattos - RA: 2346443

public class Passeio extends Veiculo implements Calc{
	
	private int qtdePassageiro;

	public Passeio(){
		qtdePassageiro = 0;
	}

	public int calcVel(int y){
		int c = 0;
		c = y * 1000;
		return c;
	}

	public int calcular(){
		int num = this.getPlaca().length() + this.getMarca().length() + this.getModelo().length() + this.getCor().length();
		return num;
	}

	public int getQtdePassageiro(){
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro){
		this.qtdePassageiro = qtdePassageiro;
	}

}