
public class ListaEstaticaOrdenada {
	private int[] vetor;
	private int tamanho;
	
	public ListaEstaticaOrdenada() {
		this.vetor = new int[1000];
		this.tamanho = 0;
	}
	
	public void inserir(int elemento) {
		if (tamanho < 1000) {
			
			// Passo 1: Localizar a posicao
			int pos = 0;
			for (pos = 0; pos < this.tamanho; pos++) {
				if (this.vetor[pos] > elemento) {
					break;
				}
			}
						
			// Passo 2: Deslocar a partir da posicao
			for (int i = this.tamanho; i > pos; i--) { 
				this.vetor[i] = this.vetor[i - 1];
			}
			
			// Passo 3: Alocar o novo valor na posicao
			vetor[pos] = elemento;			
			
			this.tamanho++; // this.tamanho = this.tamanho + 1;
		} else {
			System.out.println("Lista cheia!");
		}
	}
	
	public void mostrar() {
		for (int i = 0; i < this.tamanho; i++) {
			System.out.print(this.vetor[i] + " ");
		}
	}
	
	public int remover(int posicao) {
		if (posicao < tamanho) {
			// Caso 1: Posicao eh o final da lista
			if (posicao == tamanho - 1) {
				int elemento = this.vetor[posicao];
				tamanho--;
				return elemento;		
			} else if (posicao == 0) {
			// Caso 2: Posicao eh o inicio da lista
				int elemento = this.vetor[posicao];			
				for (int i = 0; i < tamanho - 1; i++) {
					vetor[i] = vetor[i + 1];
				}
				tamanho--;
				return elemento;
			} else {
			// Caso 3: Posicao estah no meio da lista
				int elemento = this.vetor[posicao];
				for (int i = posicao; i < this.tamanho - 1; i++) {
					vetor[i] = vetor[i + 1];
				}
				tamanho--;
				return elemento;
			}
		} else {
			System.out.println("Posicao invalida!");
			return -1;			
		}
	}
	
	public int buscar(int elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.vetor[i] == elemento) {
				System.out.println("Elemento encontrado na posicao: " + i);
				return i;
			}
		}
		System.out.println("Elemento nao encontrado!");
		return -1;
	}
}
