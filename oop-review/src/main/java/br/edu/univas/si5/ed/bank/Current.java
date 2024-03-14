package br.edu.univas.si5.ed.bank;

public class Current extends Account {

	float maintenanceValue = 23.0f;
	
	@Override
	public void monthlyUpdateBalance() {
		super.withdraw(maintenanceValue);
	}
}
