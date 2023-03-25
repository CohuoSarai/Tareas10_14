package tarea10_14;

public class Empleado {


		private final String nombre;
		private final String apellido;
		private final String numerodess;
		

		
		public Empleado(String nombre, String apellido, String numerodess) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.numerodess = numerodess;
		
		}


		public String optenerNombre() {
			return nombre;
		}

		
		public String optenerApellido() {
			return apellido;
		}


		public String optenerNumerodesegurosocial() {
			return numerodess;
		}



		
		
		public String toString() {
			return String.format("%s %s%nNumero de seguro social es : %s",optenerNombre (), optenerApellido(),
					optenerNumerodesegurosocial());
		}


		private Object optenerNombre() {
			// TODO Auto-generated method stub
			return null;
		}


		public abstract double ingresos(); 
	
}
