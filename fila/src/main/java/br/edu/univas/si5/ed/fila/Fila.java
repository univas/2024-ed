package br.edu.univas.si5.ed.fila;

public class Fila {
	private Pessoa inicio = null;
	private Pessoa ultimo = null;
	// substituir os 2 atributos pelos correspondentes:
	// private No inicio = null;
	// private No ultimo = null;
	// Fazer os ajustes necessários na classe fila

	private int tamanho = 0;

	public void inserir(Pessoa novo) {
		if (estaVazia()) {
			inicio = novo;
		} else {
			ultimo.proximo = novo;
		}
		ultimo = novo;
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
		Pessoa pessoaDaVez = inicio;
		while (pessoaDaVez != null) {
			System.out.print(pessoaDaVez.nome + " ");
			pessoaDaVez = pessoaDaVez.proximo;
		}
		System.out.println();
	}

	public Pessoa remover() {
		Pessoa removido = inicio;
		if (!estaVazia()) {
			inicio = inicio.proximo; // move o início para o 2o
			tamanho--;
		} else {
			ultimo = null;
		}
		return removido;
	}
}
