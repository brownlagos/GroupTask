
public class CompoundInterest{

	private double amountRate;
	private int compoundPrincipal;
	private int numberOfYears;
	/**
	 * @return the amountRate
	 */
	

	public CompoundInterest(double amountRate, int compoundPrincipal, int numberOfYears) {
		this.amountRate = amountRate;
		this.compoundPrincipal = compoundPrincipal;
		this.numberOfYears = numberOfYears;
	}
	/**
	 * @param amountRate the amountRate to set
	 */
	public double getAmountRate() {
		return amountRate;
	}
	/**
	 * @param amountRate
	 * @param compoundPrincipal
	 * @param numberOfYears
	 */
	
	public void setAmountRate(double amountRate) {
		this.amountRate = amountRate;
	}
	/**
	 * @return the compoundPrincipal
	 */
	public int getCompoundPrincipal() {
		return compoundPrincipal;
	}
	/**
	 * @param compoundPrincipal the compoundPrincipal to set
	 */
	public void setCompoundPrincipal(int compoundPrincipal) {
		this.compoundPrincipal = compoundPrincipal;
	}
	/**
	 * @return the numberOfYears
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	/**
	 
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	public double getCompoundInterest() {
		double store = 1;
		
		//double value = 1 + amountRate;
		double amount = 0;

		System.out.println();
		System.out.printf("%s%20.16s%17s%n","Year","Interest rate","Interest");
		
		
		for(double j = 0.05; j <= amountRate; j+=0.01) {
			for(int i = 1; i <= numberOfYears; i++) {
			
				//System.out.println(j);
			store = store * (1 + j);

			amount = compoundPrincipal * store;

			System.out.printf("%d\t%10d%22.2f%n",i,(int)(j*100),amount);
			if(i == numberOfYears) {
				store = 1;
			}
		
		}
			System.out.println();
	}
		
		return amount;
	}
	
	
}
