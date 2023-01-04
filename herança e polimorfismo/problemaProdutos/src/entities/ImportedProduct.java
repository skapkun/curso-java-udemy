package entities;

public class ImportedProduct extends Product {
	private double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	public double totalPrice() {
		price +=customsFee; 
		return price;
	}
	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + " (" + "Customs fee: $ " + String.format("%.2f", customsFee)+")"; 
	}
	
}
