
public class Dado {
	private int valorDaFace;
	
	public Dado() {
		
	}
	
	public Dado(int valorDaFace) {
		this.valorDaFace = valorDaFace;
	}
	
	public void lancar() {
		do {
			valorDaFace = (int)(Math.random()*(6+1));
		} while(valorDaFace==0);
	}
	
	public void lancar(int faces) {
		do {
			valorDaFace = (int)(Math.random()*(faces+1));
		} while(valorDaFace==0);
	}
	
	public int obterValorDaFace() {
		return valorDaFace;
	}
}
