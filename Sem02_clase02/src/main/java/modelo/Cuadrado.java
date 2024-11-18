package modelo;

public class Cuadrado {
	private double lado;
	
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return lado*4;
	}
	
	
}
