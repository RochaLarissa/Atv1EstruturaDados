package lista;

public class Lista {
	
	private No primeiro;
	private No ultimo;
	private int tamanho;
		
	public Lista(No primeiro, No ultimo, int tamanho) {
		this.primeiro = primeiro;
		this.ultimo = ultimo;
		this.tamanho = tamanho;
	}
	
	public No getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void inserirDado(int valor) {
		No novoNo = new No(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = novoNo;
			ultimo = novoNo;
			tamanho++;
		} else {
			No n = ultimo;
			ultimo.setProximo(novoNo);
			ultimo = novoNo;
			ultimo.setAnterior(n);
			tamanho++;
		}
	}
	
	public void alterarDado(int indice, int valor) {
		
	}
	
	public void excluirDado(int novoValor) {
		
	}
	
	public void pesquisarDado(int novoValor) {
		
	}
	
	public No selecionarDado(int posicao) {
		No atual = primeiro;
		for(int i=0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();				
			}
		}
		return atual;
	}
	
	public void mostrarDados() {
		System.out.println("Primeiro:" + primeiro.getValor());
		System.out.println("Ultimo:" + ultimo.getValor());
		System.out.println("Tamanho:" + tamanho);
			for (int i = 0; i < tamanho; i++) {
				System.out.print("Posição " + i + " = " + selecionarDado(i).getValor());
				if (selecionarDado(i).getAnterior() != null) {
					System.out.print(" | Anterior = " + selecionarDado(i).getAnterior().getValor());					
				}
				if (selecionarDado(i).getProximo() != null) {
					System.out.println(" | Próximo = " + selecionarDado(i).getProximo().getValor());					
				}
			}
		}
	
}
