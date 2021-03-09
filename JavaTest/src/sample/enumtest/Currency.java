package sample.enumtest;

public final class Currency {
	// Currency.PENNY
	public static final  Currency PENNY;
	public static final  Currency QUARTER;
	static {
		PENNY=new Currency("PENNY", 1);
		QUARTER=new Currency("QUARTER", 25);
	}
	public final String name;
	public final int value;

	static public Currency[] values() {
		return new Currency[] {PENNY,QUARTER};
	}
	static public int valueOf(String name) {
		Currency[] cs= values();
		for( Currency  c : cs  ) {
			if(c.name.equals(name)) {
				return c.value;
			}
		}
		return 0;
	}
	
	public static int valueOf(Currency c) {
		// TODO Auto-generated method stub
		return valueOf(c.name);
	}
	
	private Currency(String name, int value) {
		this.name = name;
		this.value = value;
	}
	@Override
	public String toString() {
		return name ;
	}
	
	
}