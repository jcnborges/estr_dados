import java.util.Scanner;

public class ProgramaTeste {

	public static void main(String[] args) {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		Scanner input = new Scanner(System.in);
		System.out.print(":>");
		String frase = input.nextLine();
		while (!frase.toLowerCase().equals("pare")) {
			lista.inserirNoFim(frase);
			System.out.println();
			System.out.print(":>");
			frase = input.nextLine();
		}
		lista.mostrar();
	}

}
