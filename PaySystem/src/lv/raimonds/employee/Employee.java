package lv.raimonds.employee;

import lv.raimonds.paysystem.Payee;

public abstract class Employee implements Payee{
	private String name;
	private Integer bankAccount;
	protected Double grossWage;
	
	public Employee(String name, Integer bankAccount, Double grossWage) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}
}
