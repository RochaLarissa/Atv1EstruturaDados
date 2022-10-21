import java.util.Scanner;

import lista.Lista;
import menu.Menus;
import vetor.Vetor;

public class Principal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Menus.menuInicial();
		int opcaoInicial = s.nextInt();

		while (true) {
			switch (opcaoInicial) {
			case 1: // opçao vetor
				Vetor meuVetor = new Vetor(10);
				int opcaoVetor = 0;

				while (opcaoVetor != 5) {
					Menus.menuVetor();
					opcaoVetor = s.nextInt();

					switch (opcaoVetor) {
					case 1: // INSERIR DADO
						System.out.println("Informe um valor inteiro para inserir no vetor: ");
						int valor1 = s.nextInt();
						meuVetor.inserirDado(valor1);
						break;

					case 2: // ALTERAR DADO
						System.out.println("Informe o índice que receberá a alteração:");
						int indice = s.nextInt();
						System.out.println("Informe o novo valor inteiro:");
						int valor2 = s.nextInt();

						meuVetor.alterarDado(indice, valor2);
						break;

					case 3: // PESQUISAR DADO
						System.out.println("Qual o valor deseja pesquisar no vetor?");
						int d = s.nextInt();
						meuVetor.pesquisarDado(d);
						break;

					case 4: // MOSTRAR DADOS
						meuVetor.mostrarDados();
						break;

					case 5: // VOLTAR
						Menus.menuInicial();
						opcaoInicial = s.nextInt();
						break;
					}
				}
				break;

			case 2: // opção lista			
				Lista minhaLista = new Lista(null, null, 0);
				int opcaoLista = 0;

				while (opcaoLista != 6) {
					Menus.menuLista();;
					opcaoLista = s.nextInt();					

					switch (opcaoLista) {
					case 1: // INSERIR DADO
						System.out.println("Informe um valor inteiro para inserir um nó na lista: ");
						int valor3 = s.nextInt();						
						minhaLista.inserirDado(valor3);					
						break;

					case 2: // ALTERAR DADO
						System.out.println("Informe a posição que receberá a alteração:");
						int posicao = s.nextInt();
						System.out.println("Informe um novo valor inteiro para o nó:");
						int valor4 = s.nextInt();
						minhaLista.alterarDado(posicao, valor4);
						break;

					case 3: // EXCLUIR DADO
						System.out.println("Informe a posição a ser excluída da lista de nós: ");
						int valor5 = s.nextInt();
						minhaLista.excluirDado(valor5);
						break;

					case 4: // PESQUISAR DADOS
						System.out.println("Informe o valor inteiro que deseja pesquisar no vetor: ");
						int d = s.nextInt();
						minhaLista.pesquisarDado(d);
						break;

					case 5: // MOSTRAR						
						minhaLista.mostrarDados();						
						break;
						
					case 6: // VOLTAR
						Menus.menuInicial();
						opcaoInicial = s.nextInt();
						break;
					}
				}
				break;
			}
		}
	}

}
