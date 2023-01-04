package entities;

public class OutsourcedEmployee extends Employee{
	private double additionalCharge; 
	
	public OutsourcedEmployee() {

	}
	public OutsourcedEmployee (String name, Integer hours, double valuePerHour, double additionalCharge) {
		super (name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	public double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment () {
		return super.payment() + additionalCharge * 1.1;
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder (); 
		sb.append(name);
		sb.append(" - $");
		sb.append(String.format("%.2f", payment()));
		return sb.toString();
	}
	
}
