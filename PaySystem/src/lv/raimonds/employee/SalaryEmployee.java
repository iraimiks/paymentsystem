package lv.raimonds.employee;

import lv.raimonds.paysystem.Payee;

public class SalaryEmployee implements Payee {
	
	private String name;
	private Integer bankAccount;
	protected Double grossWage;
	

	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Double grossPaymeny() {
		return grossWage;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}
	
	
	
	
}
