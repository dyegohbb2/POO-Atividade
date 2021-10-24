package poo1;

public class programa {

	public static void main(String[] args) {
		MinhaClasse compara1 = new MinhaClasse(19999, 9844.00, Enumeros.AUMENTO_10);
		MinhaClasse compara2 = new MinhaClasse(800.00, 1944.00,Enumeros.AUMENTO_20);
		MinhaClasse compara3 = new MinhaClasse(5.99, 98.00);
		
		if (compara1.getSalario1() > compara1.getSalario2()) {
			System.out.println("O valor R$" + compara1.getSalario1() + " é maior que R$" + compara1.getSalario2());
		}else if(compara1.getSalario1() == compara1.getSalario2()) {
			System.out.println("O valor R$" + compara1.getSalario1() + " é igual que R$" + compara1.getSalario2());
		}else if(compara1.getSalario1() < compara1.getSalario2()) {
			System.out.println("O valor R$" + compara1.getSalario2() + " é maior que R$" + compara1.getSalario1());
		}
		
		if((compara1.getPorc() != null) && (compara1.getSalario1() > 0 || compara1.getSalario2() > 0)) {
			System.out.println("O valor R$" + compara1.getSalario1() + " com aumento de " + compara1.getAumento() + "%, ficará: R$" + (compara1.getSalario1()*(compara1.getAumento()/100)+compara1.getSalario1()));
			System.out.println("O valor R$" + compara1.getSalario2() + " com aumento de " + compara1.getAumento() + "%, ficará: R$" + (compara1.getSalario2()*(compara1.getAumento()/100)+compara1.getSalario2()));
		}
		
		double x = compara1.getSalario1();
		
		int i = x > 2000.00 ? 0 : 1;
		if(i == 0) {
			System.out.println("O salario R$" + compara1.getSalario1() + " é maior que 2000" );
		}else {
			System.out.println("O salario R$" + compara1.getSalario1() + " é menor que 2000" );
		}
		
		System.out.println("--------------------------");
		
		if (compara2.getSalario1() > compara2.getSalario2()) {
			System.out.println("O valor R$" + compara2.getSalario1() + " é maior que R$" + compara2.getSalario2());
		}else if(compara2.getSalario1() == compara2.getSalario2()) {
			System.out.println("O valor R$" + compara2.getSalario1() + " é igual que R$" + compara2.getSalario2());
		}else if(compara2.getSalario1() < compara2.getSalario2()) {
			System.out.println("O valor R$" + compara2.getSalario2() + " é maior que R$" + compara2.getSalario1());
		}
		
		if((compara2.getPorc() != null) && (compara2.getSalario1() > 0 || compara2.getSalario2() > 0)) {
			System.out.println("O valor R$" + compara2.getSalario1() + " com aumento de " + compara2.getAumento() + "%, ficará: R$" + (compara2.getSalario1()*(compara2.getAumento()/100)+compara2.getSalario1()));
			System.out.println("O valor R$" + compara2.getSalario2() + " com aumento de " + compara2.getAumento() + "%, ficará: R$" + (compara2.getSalario2()*(compara2.getAumento()/100)+compara2.getSalario2()));
		}
		
		System.out.println("--------------------------");
		
		if (compara3.getSalario1() > compara3.getSalario2()) {
			System.out.println("O valor R$" + compara3.getSalario1() + " é maior que R$" + compara3.getSalario2());
		}else if(compara3.getSalario1() == compara3.getSalario2()) {
			System.out.println("O valor R$" + compara3.getSalario1() + " é igual que R$" + compara3.getSalario2());
		}else if(compara3.getSalario1() < compara3.getSalario2()) {
			System.out.println("O valor R$" + compara3.getSalario2() + " é maior que R$" + compara3.getSalario1());
		}
		
		if((compara3.getPorc() != null) && (compara3.getSalario1() > 0 || compara3.getSalario2() > 0)) {
			System.out.println("O valor R$" + compara3.getSalario1() + " com aumento de " + compara3.getAumento() + "%, ficará: R$" + (compara3.getSalario1()*(compara3.getAumento()/100)+compara3.getSalario1()));
			System.out.println("O valor R$" + compara3.getSalario2() + " com aumento de " + compara3.getAumento() + "%, ficará: R$" + (compara3.getSalario2()*(compara3.getAumento()/100)+compara3.getSalario2()));
		}
		
		System.out.println("--------------------------");
		
		for (int xyz = 0; xyz < 5; xyz++) {
			for (int zyx = 0; zyx < 40; zyx++) {
				System.out.print("x");
			}
			System.out.println("x");
		}

	}
}
	
