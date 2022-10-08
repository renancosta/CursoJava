import java.util.Scanner;

public class JogoDeDadoFaces {
	private Dado dado = new Dado();
	
	public void jogar() {
		Scanner entrada = new Scanner(System.in);
		int faces;
		System.out.println("Informe a quantidade de faces do dado: ");
		faces = entrada.nextInt();
		dado.lancar(faces);
		System.out.println(dado.obterValorDaFace());
	}
}
