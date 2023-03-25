package tarea10_14;

public class EmpleadoBaseMasComision {

private double salarioBase; 

	
	public EmpleadoBaseMasComision(String nombre, String apellido, String numerodess,
			double ventasBrutas, double tarifaComision, double salarioBase) 
	
	{
		super(nombre, apellido, numerodess, ventasBrutas, tarifaComision);

		if (salarioBase < 0.0) 
			throw new IllegalArgumentException("El salario base debe ser de >= 0.0");

		this.salarioBase = salarioBase;
	}


	public void establecerSalarioBase(double salarioBase) {
		if (salarioBase < 0.0) 
			throw new IllegalArgumentException("Salario base debe ser de >= 0.0");

		this.salarioBase = salarioBase;
	}

	
	public double optenerSalarioBase() {
		return salarioBase;
	}

	public double ingresos() {
		return getSalarioBase() + super.ingresos();
	}

	public String toString() {
		return String.format("", "con salario base", super.toString(), "salario base", getSalarioBase());
	}

	
}
