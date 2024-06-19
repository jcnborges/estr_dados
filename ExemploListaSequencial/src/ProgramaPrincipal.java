
public class ProgramaPrincipal {

	public static void main(String[] args) {
		ListaEstaticaOrdenada lista = new ListaEstaticaOrdenada();
		lista.inserir(10);
		lista.inserir(76);
		lista.inserir(5);
		lista.inserir(93);
		lista.inserir(17);
		lista.inserir(44);
		lista.inserir(100);
		lista.inserir(11);
		lista.inserir(23);
		lista.inserir(56);
		lista.mostrar();
		lista.remover(9);
		System.out.println();
		lista.mostrar();
		lista.remover(0);
		System.out.println();
		lista.mostrar();		
		lista.remover(3);
		System.out.println();
		lista.mostrar();
		System.out.println();
		lista.remover(9);
		lista.remover(8);
		lista.remover(7);
		lista.buscar(44);
		lista.buscar(76);
		lista.buscar(103);
	}

}
