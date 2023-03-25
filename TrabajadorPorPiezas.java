package tarea10_14;

public class TrabajadorPorPiezas {

	private double sueldo; private int piezas;

	public TrabajadorPorPiezas(String nombre, String apellido, String numerodess, double sueldo, int piezas) {
		super();
		this.sueldo = sueldo; this.piezas = piezas;
	}

	public double optenerSueldo() {
		return sueldo;
	}

	public void optenerSueldo(double sueldo) {
		if (sueldo > 0) {
			this.sueldo = sueldo;
		} else {
			throw new IllegalArgumentException("Sueldo");

	}
	}

	public int optenerPiezas() {
		return piezas;
	}

	public void optenerPiezas(int piezas) {
		if (piezas > 0) {
			this.piezas = piezas;
	} else {
			throw new IllegalArgumentException("Piezas");
	}
	}

	
	public double ingresos() {
		return piezas * sueldo;
	}

	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %d", "Empleado", super.toString(), "Suedlo", optenerSueldo(), "piezas",
				optenerPiezas());
	}

	
}
