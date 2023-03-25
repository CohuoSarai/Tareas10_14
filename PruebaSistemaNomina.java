package tarea10_14;

public class PruebaSistemaNomina {

	public static void main(String[] args) 
	   {

		 
	      EmpleadoAsalariado empleadoAsalariado = 
	         new EmpleadoAsalariado("Pedro", "Pablo", "111-11-1111", 800.00);
	      
	      
	      EmpleadoPorHoras empleadoPorHoras = 
	         new EmpleadoPorHoras("seju", "Prak", "222-22-2222",  16.75, 40);
	      
	      
	      EmpleadoPorComision empleadoPorComision = 
	         new EmpleadoPorComision("Jose", "Javier", "333-33-3333", 10000, .06);
	      
	      
	      EmpleadoBaseMasComision empleadoBaseMasComision = 
	         new EmpleadoBaseMasComision("sergio", "ho", "444-44-4444", 5000, .04, 300);
	      TrabajadorPorPiezas trabajadorPorPiezas = new TrabajadorPorPiezas("Boris","Krakken","555-55-5555", 300, 80);

	      
	      
	      Empleado[] empleados = new Empleado[5]; 

	      empleados[0] = empleadoAsalariado;
	      empleados[1] = empleadoPorHoras;
	      empleados[2] = empleadoPorComision; 
	      empleados[3] = empleadoBaseMasComision;
	      empleados[4] = trabajadorPorPiezas;


	      System.out.printf("Empleados procesados en forma polimorfica:");
	      
	    
	      for (Empleado empleadoActual : empleados) 
	      {
	         System.out.println(empleadoActual); 

	         
	         if (empleadoActual instanceof EmpleadoBaseMasComision) 
	         {
	            
	            EmpleadoBaseMasComision empleado = 
	               (EmpleadoBaseMasComision) empleadoActual;

	            empleado.establecerSalarioBase(1.10 * empleado.establecerSalarioBase());

	            System.out.printf(
	               "el nuevo salario base con 10%% de aumento es:",
	               empleado.establecerSalarioBase());
	         } 
	   
	             System.out.printf(
	                     "ganado", empleadoActual.ingresos());
	         }
	      } 
	
}
