package br.edu.univas.si5.ed.bank;

public abstract class Account {
	private int number;
	private float balance;//deveria ser float
	
	//atualização mensal
	public abstract void monthlyUpdateBalance();
	
	public void deposit(float value) {
		balance += value;
	}
	
	public void withdraw(float value) {
		balance -= value;
	}
	
	public float getBalance() {
		return balance;
	}
}
