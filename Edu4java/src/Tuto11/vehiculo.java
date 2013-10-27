package Tuto11;

public class vehiculo {
	
	private String tipo;
	private String color;
	private int ruedas;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void imprimir(){
		System.out.println();
		System.out.print("Tipo: " + tipo);
		System.out.print(" Color: " + color);
		System.out.println(" Ruedas: " + ruedas);
	}

}
