import java.util.Scanner;
import vetor.Vetor;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		Vetor v2 = new Vetor(10);
		
		Scanner s = new Scanner(System.in);

		System.out.println("-------------------");
		System.out.println("|  1 - Vetor      |");
		System.out.println("|  2 - Lista      |");
		System.out.println("-------------------");
		System.out.println("\nSelecione a opção desejada:");

		opcao = s.nextInt();

		switch (opcao) {
			case 1: 
				int opcaoVetor = 0;
				
				while(opcaoVetor != 5) {					
					
					
					System.out.println("---------------------");
					System.out.println("|        Vetor       |");
					System.out.println("---------------------");
					System.out.println("| 1 - Inserir dado   |");
					System.out.println("| 2 - Alterar dado   |");
					System.out.println("| 3 - Pesquisar dado |");
					System.out.println("| 4 - Mostrar dados  |");
					System.out.println("| 5 - Voltar         |");
					System.out.println("\nSelecione a opção desejada:");
					
					opcaoVetor = s.nextInt();
					
					switch (opcaoVetor) {
						case 1: 
							System.out.println("Digite um valor inteiro para inserir no vetor: ");
							int valor1 = s.nextInt();
							v2.inserirDado(valor1);
							break;	
							
						case 2: 						
							System.out.println("Digite o índice:");
							int indice = s.nextInt();							
							System.out.println("Digite o valor:");
							int valor2 = s.nextInt();
							
							v2.alterarDado(indice, valor2);
							break;	
							
						case 3: 
							System.out.println("Qual o valor deseja pesquisar no vetor?");
							int d = s.nextInt();
							v2.pesquisarDado(d);
							break;
							
						case 4: 						
							v2.mostrarDados();
							break;
							
						case 5:
							break;				
					}
				
				
				System.out.println("-------------------");
				System.out.println("|  1 - Vetor      |");
				System.out.println("|  2 - Lista      |");
				System.out.println("-------------------");
				System.out.println("\nSelecione a opção desejada:");
			}
				break;
			case 2: 
				System.out.println("---------------------");
				System.out.println("|        Lista       |");
				System.out.println("---------------------");
				System.out.println("| 1 - Inserir dado   |");
				System.out.println("| 2 - Alterar dado   |");
				System.out.println("| 3 - Excluir dado   |");
				System.out.println("| 4 - Pesquisar dado |");
				System.out.println("| 5 - Mostrar dados  |");
				System.out.println("| 6 - Voltar         |");
				System.out.println("\nSelecione a opção desejada:");
				break;
		}

		
	}

}
