package poo1;

public enum Enumeros {
	AUMENTO_10(10), AUMENTO_15(15), AUMENTO_20(20);

	private int aumento;
	
	private Enumeros(int porc) {
		this.aumento = porc;
	}
	
	public int getPorc() {
		return aumento;
	}
	
}
