public class Seisma {
	private String firstName;
	private String lastName;
	private int annual;
	private float superRate;
	private String startDate;
	/***
	 * Constructor for this project
	 * @param firstName
	 * @param lastName
	 * @param annual
	 * @param superRate
	 * @param startDate
	 */
	
	public Seisma(String firstName, String lastName, int annual, float superRate, String startDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annual = annual;
		this.superRate = superRate;
		this.startDate = startDate;
		
	}
	
	/***
	 * 
	 * @param firstName
	 * @param lastName
	 * @return fullName
	 * use StringBuilder to constructor a String for full name
	 */
	public String getFullName(String firstName, String lastName) {
		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);
		return fullName.toString();
	}
	
	/***
	 * 
	 * @param period
	 * @return pay Period
	 */
	public String getPayPeriod(String period) {
		String payPeriod = period;
		return payPeriod;
	}
	
	/***
	 * 
	 * @param annual
	 * @return gross income based on the formula
	 */
	public int getGrossIncome(int annual) {
		int month = 12;
		int grossIncome = annual/month;
		return grossIncome;
	}
	
	/***
	 * 
	 * @param annual
	 * @return income tax based on the formula
	 */
	public int getIncomeTax(int annual) {
		int base = getBase(annual);
		float follow = getFollow(annual);
		int incomeTax = Math.round((base+(annual-getMin(annual))*follow)/12);
		return incomeTax;
	}
	
	/***
	 * 
	 * @param annual
	 * @return net Income based on the formula
	 */
	public int getNetIncome(int annual) {
		int netIncome = getGrossIncome(annual)-getIncomeTax(annual);
		return netIncome;
	}
	
	/***
	 * 
	 * @param annual
	 * @return super based on the formula and the given super rate 
	 */
	public int getSuper(int annual) {
		int supers = Math.round(getGrossIncome(annual)*superRate);
		return supers;
	}
	
	/***
	 * 
	 * @param annual
	 * @return base price based on the given table
	 */
	public int getBase(int annual) {
		int base = 0;
		if (annual<=18200||(annual<=37000&&annual>18200))  return 0;
		else if (annual<=87000&&annual>37000) base = 3572;
		else if (annual<=180000&&annual>87000) base = 19822;
		else if (annual>180000) base = 54232;
		return base;
	}
	
	/***
	 * 
	 * @param annual
	 * @return the following cents for each $1 based on the given table
	 */
	public float getFollow(int annual) {
		float follow = 0;
		if (annual<=37000&&annual>18200)  follow = 0.19f;
		else if (annual<=87000&&annual>37000) follow = 0.325f;
		else if (annual<=180000&&annual>87000) follow = 0.37f;
		else if (annual>180000) follow = 0.45f;
		return follow;
	}
	
	/***
	 * 
	 * @param annual
	 * @return the min that need to be subtract
	 */
	public int getMin(int annual) {
		int min = 0;
		if (annual<=18200||(annual<=37000&&annual>18200))  return min;
		else if (annual<=87000&&annual>37000) min = 37000;
		else if (annual<=180000&&annual>87000)min = 87000;
		else if (annual>180000) min = 180000;
		return min;
	}
	
	/***
	 * 
	 * @param args
	 * main class for performing tests
	 */
	public static void main(String[] args) {
		//test case one
		Seisma sample = new Seisma("Monica", "Tan", 60050,0.09f,"01 March - 31 March");
		System.out.print(sample.getFullName(sample.firstName, sample.lastName)+", ");
		System.out.print(sample.getPayPeriod(sample.startDate)+", ");
		System.out.print(sample.getGrossIncome(sample.annual)+", ");
		System.out.print(sample.getIncomeTax(sample.annual)+", " +sample.getNetIncome(sample.annual)+", ");
		System.out.println(sample.getSuper(sample.annual));
		
		//test case two
		Seisma sample2 = new Seisma("Brend", "Tulu", 120000,0.1f,"01 March - 31 March");
		System.out.print(sample2.getFullName(sample2.firstName, sample2.lastName)+", ");
		System.out.print(sample2.getPayPeriod(sample2.startDate)+", ");
		System.out.print(sample2.getGrossIncome(sample2.annual)+", ");
		System.out.print(sample2.getIncomeTax(sample2.annual)+", " +sample2.getNetIncome(sample2.annual)+", ");
		System.out.println(sample2.getSuper(sample2.annual));
		
		//test case three
		Seisma sample3 = new Seisma("Alice", "Tom", 10000,0.3f,"01 March - 31 March");
		System.out.print(sample3.getFullName(sample3.firstName, sample3.lastName)+", ");
		System.out.print(sample3.getPayPeriod(sample3.startDate)+", ");
		System.out.print(sample3.getGrossIncome(sample3.annual)+", ");
		System.out.print(sample3.getIncomeTax(sample3.annual)+", " +sample3.getNetIncome(sample3.annual)+", ");
		System.out.println(sample3.getSuper(sample3.annual));
	}

}
