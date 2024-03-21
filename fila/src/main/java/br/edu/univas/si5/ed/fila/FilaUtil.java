package br.edu.univas.si5.ed.fila;

public class FilaUtil {

	//modifica a fila original
	public static void dividirFilaV1(Fila original, Fila fila1, Fila fila2) {
		while(!original.estaVazia()) {
			Pessoa pessoa = original.remover();
			char letra = pessoa.nome.toUpperCase().charAt(0);
			if (letra < 'M') {
				fila1.inserir(pessoa);
			} else {
				fila2.inserir(pessoa);
			}
		}
	}
	
}
