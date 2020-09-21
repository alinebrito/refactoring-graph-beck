
abstract class Money {

	protected int amount;
	
	private String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object)  {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}   
	
	static Dollar dollar(int amount)  {
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	abstract Money times(int multiplier); 
	
	String currency() {
		return currency;
	}
}
