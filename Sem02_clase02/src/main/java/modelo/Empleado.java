package modelo;

public class Empleado {

	private String nombre;
	private int cantidadHijos;
	private double salarioBruto;
	
	
	public Empleado(String nombre, int cantidadHijos, double salarioBruto) {
		super();
		this.nombre = nombre;
		this.cantidadHijos = cantidadHijos;
		this.salarioBruto = salarioBruto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidadHijos() {
		return cantidadHijos;
	}


	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	
	public double bonificacion() {
		
		double bonificacion = 0;
		
		if(cantidadHijos <3) {
			
			bonificacion = salarioBruto*0.10;
		
		}else if(cantidadHijos >=3 && cantidadHijos <5) {
			
			bonificacion = salarioBruto*0.15;
			
		}else if(cantidadHijos >=5) {
			
			bonificacion = salarioBruto*0.20;
			
		}
		
		return bonificacion;
		
	}
	
	
	public double salarioNeto() {
		
		return salarioBruto+bonificacion();
		
	}
	
}
