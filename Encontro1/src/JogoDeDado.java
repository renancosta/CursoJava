
public class JogoDeDado {
	private Dado dado1 = new Dado();
	private Dado dado2 = new Dado();
	
	public void jogar() {
		int vf1,vf2;
		dado1.lancar();
		vf1 = dado1.obterValorDaFace();
		
		dado2.lancar();
		vf2 = dado2.obterValorDaFace();
		
		if(vf1+vf2==7) {
			System.out.println("Você ganhou!\n");
		} else {
			System.out.println("Você perdeu!\n");
		}
		
		System.out.println("Valor dos dados "+vf1+" e "+vf2);
	}
}
