package modelo;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
	
	this.ladoA = ladoA;
	this.ladoB = ladoB;
	this.ladoC = ladoC;
	
	
	}

	
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}
	
	public double area() {
		double sp = perimetro()/2;
		return Math.pow(sp* (sp-ladoA) * (sp-ladoB) * (sp-ladoC), 0.5);
		
		
	}
	
}
