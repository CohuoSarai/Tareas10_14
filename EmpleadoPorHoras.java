package tarea10_14;

public class EmpleadoPorHoras {

	
		private double sueldo; 
		private double horas; 

		
		public EmpleadoPorHoras(String nombre, String apellido, String numerodess,  double sueldo,
				double horas) {
			super(nombre, apellido, numerodess);

			if (sueldo < 0.0) 
				throw new IllegalArgumentException("Sueldo por hora debe ser de >= 0.0");

			if ((horas < 0.0) || (horas > 168.0)) 
				throw new IllegalArgumentException("Horas trabajada debe ser de >= 0.0 y <= 168.0");

			this.sueldo = sueldo;
			this.horas = horas;
		}

		

		public void setSueldo(double sueldo) {
			if (sueldo < 0.0) 
				throw new IllegalArgumentException("Sueldo por hora debe ser de >= 0.0");

			this.sueldo = sueldo;
		}

		
		public double obtenerSueldo() {
			return sueldo;
		}

		
		public void optenerHoras(double horas) {
			if ((horas < 0.0) || (horas > 168.0)) 
				throw new IllegalArgumentException("Horas trabajadas debe se de >= 0.0 and <= 168.0");

			this.horas = horas;
		}

		
		public double optenerHoras() {
			return horas;
		}

		
		public double ingresos() {
			if (obtenerHoras() <= 40) 
				return optenerSueldo() * optenerHoras();
			else
				return 40 * optenerSueldo() + (optenerHoras() - 40) * optenerSueldo() * 1.5;
		}


		public String toString() {
			return String.format("Empleado por horas: ", super.toString(), "Sueldo por horas", optenerSueldo(),
					"Horas trabajadas", optenerHoras());
		}
	
}
