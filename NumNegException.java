//Igor Araujo de Mattos - RA: 2346443

public class NumNegException extends Exception{

	Leitura l = new Leitura();

	public void impNumNeg(){
		System.out.println("\n\tNumero deve ser positivo");
	}

	pubic Pessoa reparaNumNeg(Pessoa p1){
		try{//tentar
			p1.setCpf(Integer.parseInt(l.entDados("CPF - REPARA NEGATIVO: ")));
		}

		catch(NumNegException nne){//pegar
			nne.impNumNeg();
			p1 = nne.reparaCpfNeg(p1);
		}

		return p1;
	}
}
//geradora de objetos lançáveis