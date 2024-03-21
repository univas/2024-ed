package br.edu.univas.si5.ed.fila;

public class Fila {
	// private Pessoa inicio = null;
	// private Pessoa ultimo = null;

	// substituir os 2 atributos pelos correspondentes:
	private No inicio = null;
	private No ultimo = null;
	// Fazer os ajustes necessários na classe fila

	private int tamanho = 0;

	public void inserir(Pessoa novaPessoa) {
		No novoNo = new No();
		novoNo.pessoa = novaPessoa;
		if (estaVazia()) {
			inicio = novoNo;
		} else {
			ultimo.proximo = novoNo;
		}
		ultimo = novoNo;
		tamanho++;
	}

	public boolean estaVazia() {
		return inicio == null;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void imprimir() {
		// loop que começa no início e termina no último
		No noDaVez = inicio;
		while (noDaVez != null) {
			System.out.print(noDaVez.pessoa.nome + " ");
			noDaVez = noDaVez.proximo;
		}
		System.out.println();
	}

	public Pessoa remover() {
		No noRemovido = inicio;
		if (!estaVazia()) {
			inicio = inicio.proximo; // move o início para o 2o
			tamanho--;
		} else {
			ultimo = null;
			return null;
		}
		return noRemovido.pessoa;
	}

	// exercício
	public int comprimento() {
		int count = 0;

		No noDaVez = inicio;
		while (noDaVez != null) {
			count++;
			noDaVez = noDaVez.proximo;
		}
		return count;
	}

	// a versão 1 está na classe FilaUtil

	// não modifica a fila original
	public void dividirFilaV2(Fila original, Fila fila1, Fila fila2) {
		No noDaVez = original.inicio;
		while (noDaVez != null) {
			Pessoa pessoa = noDaVez.pessoa;
			char letra = pessoa.nome.toUpperCase().charAt(0);
			if (letra < 'M') {
				fila1.inserir(pessoa);
			} else {
				fila2.inserir(pessoa);
			}
		}
	}

}
