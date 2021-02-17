class AccountingNew {
	
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend1 : " + getDividend1());
		System.out.println("Dividend2 : " + getDividend2());
		System.out.println("Dividend3 : " + getDividend3());
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}
}


public class AccountingInstanceApp {

	public static void main(String[] args) {
		
		// instance
		System.out.println("A1");
		AccountingNew a1 = new AccountingNew();
		a1.valueOfSupply = 30000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		System.out.println("A2");
		AccountingNew a2 = new AccountingNew();
		a2.valueOfSupply = 10000.0;
		a2.vatRate = 0.3;
		a2.expenseRate = 0.3;
		a2.print();
		
	}
	
	
}
