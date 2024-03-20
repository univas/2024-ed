package br.edu.univas.si5.ed.fila;

public class Fila {
	//	private Pessoa inicio = null;
	//	private Pessoa ultimo = null;

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
}
