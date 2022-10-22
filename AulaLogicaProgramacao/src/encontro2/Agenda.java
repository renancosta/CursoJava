package encontro2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Contato> agenda = new ArrayList<Contato>();
	//Criando com tamanho definido
	//int[] vetor2 = {1,10,5,8};
	
	public void armazenaPessoa(String nome, String telefone, String email) {
		agenda.add(new Contato(nome,telefone,email));
	}
	public void removePessoa(String nome) {
		agenda.remove(buscaPessoa(nome));
	}
	// informa em que posição da agenda está a pessoa
	private Integer buscaPessoa(String nome){
		for(int i=0;i<agenda.size();i++) {
			if(agenda.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return null;
	} 
	// imprime os dados de todas as pessoas da agenda
	public void imprimeAgenda() {
		agenda.forEach(contato -> {
			System.out.println(contato.getNome());
			System.out.println(contato.getTelefone());
		});
			
		
	}
	// imprime os dados da pessoa que está na posição “i” da agenda
	public void imprimePessoa(int index) {
		System.out.println(agenda.get(index).getNome());
	}
}
