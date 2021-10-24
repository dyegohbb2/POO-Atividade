package poo1;

public class MinhaClasse {
	
	private double salario1;
	private double salario2;
	private int aumento;
	private Enumeros porc;
		
	public MinhaClasse (double salario1, double salario2) {
		this.salario1 = salario1;
		this.salario2 = salario2;
	}
	
	public MinhaClasse (double salario1, double salario2, Enumeros aumento) {
		this.salario1 = salario1;
		this.salario2 = salario2;
		this.aumento = aumento.getPorc();
		this.porc = aumento;
	}

	public double getSalario1() {
		return salario1;
	}

	public void setSalario1(double salario1) {
		this.salario1 = salario1;
	}

	public double getSalario2() {
		return salario2;
	}

	public void setSalario2(double salario2) {
		this.salario2 = salario2;
	}

	public Enumeros getPorc() {
		return porc;
	}

	public void setPorc(Enumeros porc) {
		this.porc = porc;
	}
	
	public void setAumento(int aumento) {
		this.aumento = aumento;
	}
	
	public double getAumento() {
		return aumento;
	}
		
}
