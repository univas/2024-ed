package br.edu.univas.si5.ed.lista;

public class Lista {

	private No inicio;
	private No ultimo;

	public boolean estaVazia() {
		return inicio == null;
	}

	public void inserir(Entidade novo) {
		No novoNo = new No();
		novoNo.entidade = novo;
		if (estaVazia()) {
			inicio = novoNo;
			ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			ultimo = novoNo;
		}
	}

	public void imprimir() {
		No atual = inicio;
		while (atual != null) {
			System.out.print(atual.entidade + " | ");
			atual = atual.proximo;
		}
		System.out.println();
	}

	public Entidade buscarPorNome(String nome) {
		No atual = inicio;
		while (atual != null) {
			if (atual.entidade.nome.equals(nome)) {
				return atual.entidade;
			}
			atual = atual.proximo;
		}
		return null;
	}

	public Entidade buscarNaPosicao(int posicao) {
		No atual = inicio;
		int count = 1;
		while (atual != null) {
			if (count == posicao) {
				return atual.entidade;
			}
			atual = atual.proximo;
		}
		return null;
	}

	public Entidade remover(String nome) {
		// escrever os comentários com os passos da execução
		return null;
	}
}
