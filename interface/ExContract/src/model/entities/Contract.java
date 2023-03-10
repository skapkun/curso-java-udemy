 package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private int contractNumber; 
	private LocalDate contractDate; 
	private double contractValue;
	
	private List <Installment> installments = new ArrayList<>();
	public Contract() {
		 
	}
	public Contract(int contractNumber, LocalDate contractDate, double contractValue) { 
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}
	public int getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
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
	public List<Installment> getInstallments() {
		return installments;
	}
	 
	
	
	

}
