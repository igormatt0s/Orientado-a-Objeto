//Nome: Igor Araujo de Mattos - RA: 2346443

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TstVeic{

	public static void main(String arg[]){

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Leitura l = new Leitura();

		Carga cg = new Carga();

		Passeio ps = new Passeio();

		cg.setDataCadastro(sdf.format(date));
		
		cg.setPlaca(l.entDados("\nInforme a placa do veiculo de carga: "));
		cg.setMarca(l.entDados("\nInforme a marca do veiculo de carga: "));
		cg.setModelo(l.entDados("\nInforme o modelo do veiculo de carga: "));
		cg.setCor(l.entDados("\nInforme a cor do veiculo de carga: "));

		try{
			cg.setQtdRodas(Integer.parseInt(l.entDados("\nInforme a quantidade de rodas do veiculo de carga: ")));
			cg.setVelocMax(Integer.parseInt(l.entDados("\nInforme a velocidade maxima em Km/h do veiculo de carga: ")));

			cg.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("\nInforme a quantidade de pistoes do motor do veiculo de carga: ")));
			cg.getMotor().setPotencia(Integer.parseInt(l.entDados("\nInforme a potencia do motor em cavalo-vapor (CV) do veiculo de carga: ")));
			cg.setTara(Integer.parseInt(l.entDados("\nInforme a tara do veiculo de carga: ")));
			cg.setCargaMax(Integer.parseInt(l.entDados("\nInforme a carga maxima do veiculo de carga: ")));
		}

		catch(NumNegException nne){
			nne.impCpfNeg();
			cg = nne.reparaNumNeg(cg);
		}

		System.out.println("\nDATA DE CADASTRO: "+cg.getDataCadastro());

		System.out.println("\nA placa do veiculo de carga: "+cg.getPlaca());
		System.out.println("\nA marca do veiculo de carga: "+cg.getMarca());
		System.out.println("\nO modelo do veiculo de carga: "+cg.getModelo());
		System.out.println("\nA cor do veiculo de carga: "+cg.getCor());
		System.out.println("\nQuantidade de rodas do veiculo de carga: "+cg.getQtdRodas());
		System.out.println("\nVelocidade maxima do veiculo de carga: "+cg.calcVel(cg.getVelocMax())+" cm/h");

		System.out.println("\nQuantidade de pistoes do motor do veiculo de carga: "+cg.getMotor().getQtdPistoes());
		System.out.println("\nPotencia do motor do veiculo de carga: "+cg.getMotor().getPotencia()+" CV");

		System.out.println("\nA tara do veiculo de carga: "+cg.getTara());
		System.out.println("\nA carga maxima do veiculo de carga: "+cg.getCargaMax());
		
		System.out.println("\nSoma de todos os valores numericos contidos nos atributos: : "+cg.calcular());

		//-------------------------------------------------------------------------------------------------------------------------------------------

		ps.setDataCadastro(sdf.format(date));

		ps.setPlaca(l.entDados("\nInforme a placa do veiculo de passeio: "));
		ps.setMarca(l.entDados("\nInforme a marca do veiculo de passeio: "));
		ps.setModelo(l.entDados("\nInforme o modelo do veiculo de passeio: "));
		ps.setCor(l.entDados("\nInforme a cor do veiculo de passeio: "));

		try{
			ps.setQtdRodas(Integer.parseInt(l.entDados("\nInforme a quantidade de rodas do veiculo de passeio: ")));
			ps.setVelocMax(Integer.parseInt(l.entDados("\nInforme a velocidade maxima em Km/h do veiculo de passeio: ")));

			ps.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("\nInforme a quantidade de pistoes do motor do veiculo de passeio: ")));
			ps.getMotor().setPotencia(Integer.parseInt(l.entDados("\nInforme a potencia do motor em cavalo-vapor (CV) do veiculo de passeio: ")));
			ps.setQtdePassageiro(Integer.parseInt(l.entDados("\nInforme a quantidade de passageiros no veiculo de passeio: ")));
		
		}

		catch(NumNegException nne){
			nne.impCpfNeg();
			ps = nne.reparaNumNeg(ps);
		}

		System.out.println("\nDATA DE CADASTRO: "+ps.getDataCadastro());

		System.out.println("\nA placa do veiculo de passeio: "+ps.getPlaca());
		System.out.println("\nA marca do veiculo de passeio: "+ps.getMarca());
		System.out.println("\nO modelo do veiculo de passeio: "+ps.getModelo());
		System.out.println("\nA cor do veiculo de passeio: "+ps.getCor());
		System.out.println("\nQuantidade de rodas do veiculo de passeio: "+ps.getQtdRodas());
		System.out.println("\nVelocidade maxima do veiculo de passeio: "+ps.calcVel(ps.getVelocMax())+" m/h");

		System.out.println("\nQuantidade de pistoes do motor do veiculo de passeio: "+ps.getMotor().getQtdPistoes());
		System.out.println("\nPotencia do motor do veiculo de passeio: "+ps.getMotor().getPotencia()+" CV");

		System.out.println("\nQuantidade de passageiros no veiculo de passeio: "+ps.getQtdePassageiro());

		System.out.println("\nSoma da quantidade de letras em todos os atributos String: "+ps.calcular());
	}

}

	