package tarea10_14;

public class EmpleadoPorComision {

	private double ventasBrutas; 
	private double tarifaComision; 


	public EmpleadoPorComision(String nombre, String apellido, String numerodess, 
			double ventasBrutas, double tarifaComision) {
		super(nombre, apellido, numerodess);

		if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
			throw new IllegalArgumentException("La tarifa de comision debe ser de > 0.0 and < 1.0");

		if (ventasBrutas < 0.0) 
			throw new IllegalArgumentException("Las ventas brutas deben ser de >= 0.0");

		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}


	public void setVentasBrutas(double ventasBrutas) {
		if (ventasBrutas < 0.0) 
			throw new IllegalArgumentException("Las ventas brutas deben ser de >= 0.0");

		this.ventasBrutas = ventasBrutas;
	}

	
	public double optenerVentasBrutas() {
		return ventasBrutas;
	}

	
	public void obtenerTarifaComision(double tarifaComision) {
		if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
			throw new IllegalArgumentException("La tarida de comision debe ser de> 0.0 and < 1.0");

		this.tarifaComision = tarifaComision;
	}


	public double optenerTarifaComision() {
		return tarifaComision;
	}

	public double ingresos() {
		return optenerTarifaComision() * optenerVentasBrutas();
	}

	
	public String toString() {
		return String.format("/////f", "comisiones por empleado", super.toString(), "ventas brutas",
				optenerVentasBrutas(), "tarifa de comision", optenerTarifaComision());
	}

	
}
