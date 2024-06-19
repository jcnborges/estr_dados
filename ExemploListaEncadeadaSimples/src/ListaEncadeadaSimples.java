
public class ListaEncadeadaSimples {
	private NoSimples inicio;
	private NoSimples fim;
	
	public ListaEncadeadaSimples() {
		this.inicio = null;
		this.fim = null;
	}
	
	public boolean estaVazia() {
		return this.inicio == null;
	}
	
	public void inserir(String info) {
		NoSimples novo = new NoSimples(info);
		if (estaVazia()) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			novo.setProx(this.inicio);
			this.inicio = novo;
		}
	}
	
	public void inserirNoFim(String info) {
		NoSimples novo = new NoSimples(info);
		if (estaVazia()) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.setProx(novo);
			this.fim = novo;
		}
	}
	
	public void mostrar() {
		if (estaVazia()) {
			System.out.println("Lista vazia!");
		} else {
			NoSimples no = this.inicio;
			do {
				System.out.println(no.getInfo());
				no = no.getProx();
			} while (no != null);
		}
	}
}
