package modelo;

public class Rectangulo {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		
		return base*altura;
		
	}

	public double perimetro() {
		
		return (2*base) + (2*altura); 
		
	}

}
