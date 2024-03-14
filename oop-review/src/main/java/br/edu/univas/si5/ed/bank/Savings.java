package br.edu.univas.si5.ed.bank;

public class Savings extends Account {

	private float incomeTax; //deveria ser float
	
	@Override
	public void monthlyUpdateBalance() {
		super.deposit(super.getBalance() * incomeTax);
	}
}
