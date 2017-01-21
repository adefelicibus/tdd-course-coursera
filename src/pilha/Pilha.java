package pilha;

public class Pilha {
	
	private Object elemento;
	private int quantidade;

	public boolean estaVazia() {
		return (this.elemento == null);
	}

	public int tamanho() {	
		return this.quantidade;
	}

	public void empilha(Object elemento) {
		this.elemento = elemento;
		this.quantidade++;
	}

	public Object topo() {
		return this.elemento;
	}

}
