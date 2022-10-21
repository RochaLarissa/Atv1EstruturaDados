package lista;

public class No {

	private int valor;
	private No anterior;
	private No proximo;
	
	public No(int valor, No anterior, No proximo) {
		this.valor = valor;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	
	public No(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
