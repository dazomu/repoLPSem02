package modelo;

public class Resultado {

	private double perimetro, area;
	private String tipo;
	
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	
	public Resultado(double perimetro, double area, String tipo) {
		super();
		this.perimetro = perimetro;
		this.area = area;
		this.tipo = tipo;
	}
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
