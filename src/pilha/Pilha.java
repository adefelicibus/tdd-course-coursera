package pilha;

public class Pilha {
	
	private Object[] elementos;
	private int quantidade = 0;

	public Pilha(int i) {
		elementos = new Object[i];
	}

	public boolean estaVazia() {
		return quantidade == 0;
	}

	public int tamanho() {	
		return this.quantidade;
	}

	public void empilha(Object elemento) {
		if(quantidade == elementos.length)
			throw new PilhaCheiaException("Pilha cheia");

		this.elementos[quantidade] = elemento;
		this.quantidade++;
	}

	public Object topo() {
		return this.elementos[quantidade - 1];
	}

	public Object desempilha() {
		if(estaVazia())
			throw new PilhaVaziaException("Pilha vazia");
		Object topo = this.topo();
		this.quantidade--;
		return topo;
	}

}
