package br.edu.univas.si5.ed.fila;

public class StartApp {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Júlia");
		Pessoa p3 = new Pessoa("Jane");
		
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		fila.inserir(p1);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();

		fila.inserir(p2);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		fila.inserir(p3);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		fila.imprimir();
		
		Pessoa atendido = fila.remover();
		System.out.println("Removeu");
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		System.out.println("Atendido: " + atendido.nome);
		
		atendido = fila.remover();
		System.out.println("Removeu");
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		System.out.println("Atendido: " + atendido.nome);

		atendido = fila.remover();
		System.out.println("Removeu");
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		System.out.println("Atendido: " + atendido.nome);

		atendido = fila.remover();
		System.out.println("Removeu");
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		//System.out.println("Atendido: " + atendido.nome); //NullPointerException

	}
}
