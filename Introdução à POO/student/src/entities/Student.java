package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3; 
	
	
	
	public double Media() {
		return nota1 + nota2 + nota3;
	}
	
	
	
	public double PontosFaltantes() {
		if (Media()<60.00) {
			return 60.00 - Media();
		}
		else 
			return 0.0; 
	}
	
	

}
