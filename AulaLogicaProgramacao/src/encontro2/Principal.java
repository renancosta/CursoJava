package encontro2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner entrada = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Agenda de Contatos\n"
					+ "1 - Inserir contato\n"
					+ "2 - Remover contato\n"
					+ "3 - Listar todos os contatos\n"
					+ "4 - Listar um contato\n"
					+ "5 - Sair");
			opcao = entrada.next();
			switch(opcao) {
				case "1":
					agenda.armazenaPessoa("Renan", "9999", "renan@");
					break;
				case "2":
					System.out.println("Informe um nome: ");
					agenda.removePessoa(entrada.next());
					break;
				case "3":
					agenda.imprimeAgenda();
					break;
				case "4":
					agenda.imprimePessoa(0);
					break;
				case "5":
					System.out.println("Saindo do sistema...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(opcao!="5");
	}

}
