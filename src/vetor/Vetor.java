package vetor;

public class Vetor {
	
	private int tamanhoVetor;
	int[] v1;
	
	public Vetor(int tamanhoVetor) {
		this.tamanhoVetor = tamanhoVetor;
		v1 = new int[tamanhoVetor];
	}
	
	
	public void inserirDado(int dado) {
		for(int i=0; i < v1.length; i++) {
			if (v1[i] == 0) {
				v1[i] = dado;	
				break;
			} 
		}
	}
	
	public void alterarDado(int posicao, int dado) {
		v1[posicao] = dado;
	}
	
	public void pesquisarDado(int dado) {
		int encontrado = 0;
		for(int i=0; i < v1.length; i++) {
			if(v1[i] == dado) {
				System.out.println(dado + " encontrado na posicao " + i);
				encontrado++;
			}
		}
		if (encontrado == 0) {
			System.out.println("-1:  Valor não encontrado");
		}
	}
	
	public void mostrarDados() {
		for(int i=0; i < v1.length; i++) {
			System.out.println("Posicao " + i + "= " + v1[i]);
		}
	}
	
	
	
	
}
