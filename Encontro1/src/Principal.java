import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		JogoDeDado jd = new JogoDeDado();
		JogoDeDadoFaces jdf = new JogoDeDadoFaces();
		Scanner entrada = new Scanner(System.in);
		String opcao;
		
		while(true) {
			System.out.println("Escolha uma op��o:\n"
					+ "1 - Jogo dos 7\n"
					+ "2 - Dado de v�rias faces\n"
					);
			opcao = entrada.next();
			
			switch(opcao) {
				case "1":
					jd.jogar();
					break;
				case "2":
					jdf.jogar();
					break;
				default:
					System.out.println("Op��o incorreta!");
					break;
			}
		}
			
	}

}
