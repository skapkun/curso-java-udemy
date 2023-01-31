package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate contractDate; 
	private double contractValue;
	 
	public Installment() { 
	}
	public Installment(LocalDate contractDate, double contractValue) {
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}
	public LocalDate getContractDate() {
		return contractDate;
	}
	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}
	public double getContractValue() {
		return contractValue;
	}
	public void setContractValue(double contractValue) {
		this.contractValue = contractValue;
	}
	@Override
	public String toString() {
		return contractDate.format(fmt) + "- R$" + String.format("%.2f", contractValue);
	}
	

}
