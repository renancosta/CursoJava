package logicaDeProgramacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao;
		System.out.println("Aprendendo Java\n"
				+ "1 - Usando IF\n"
				+ "2 - Usando FOR\n"
				+ "3 - Usando WHILE");
		opcao = entrada.next();
		switch(opcao) {
			case "1":
				System.out.println("Informe uma idade: ");
				usandoIf(entrada.nextInt());
				break;
			case "2":
				usandoFor();
				break;
			case "3":
				usandoWhile();
				break;
			default:
				System.out.println("Opção inválida!");
		}
		
	}
	
	private static void usandoWhile() {
		System.out.println("#####Usando WHILE");
		String[] alunos = {"Renan","Maria","João","José"};
		int i=0;
		while(i<alunos.length) {
			System.out.println(alunos[i]);
			i++;
		}
		
		System.out.println("\n");
		
	}

	private static void usandoFor() {
		System.out.println("#####Usando FOR");
		String [] alunos = new String[5];
		alunos[0]="Renan";
		alunos[1]="Maria";
		alunos[2]="João";
		alunos[3]="José";
		for(int i=0;i<alunos.length;i++) {
			if(alunos[i]!=null) {
				System.out.println(alunos[i]);
			}
		}
		for(String aluno:alunos) {
			if(aluno!=null) {
				System.out.println(aluno);
			}
		}
		System.out.println("\n");
	}

	public static void usandoIf(int idade) {
		System.out.println("#####Usando IF");
		if(idade>=18) {
			System.out.println("Pode entrar no site!");
			System.out.println("Meu site!");
			if(idade>40) {
				System.out.println("Promoção");
			} else {
				System.out.println("Sem promoção");
			}
		} else if(idade>0) {
			System.out.println("Saindo do site!");
		}
		else {
			System.out.println("Idade inválida!");
		}
		System.out.println("\n");
	}

}
