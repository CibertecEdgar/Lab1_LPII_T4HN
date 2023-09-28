package Views;

import Controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		  // Crear Empleado
		//String empleado = new EmpleadoController().createEmpleado("Ben", "Tenison", 10, "Masculino", 1500.5);
		//String empleado = new EmpleadoController().createEmpleado("Juan", "Juanito", 25, "Masculino", 450.6);
		//String empleado = new EmpleadoController().createEmpleado("Lara", "Croft", 21, "Femenino", 952.0);
		//String empleado = new EmpleadoController().createEmpleado("Carol", "Peletier", 35, "Femenino", 845.5);
		
		  // Eliminar Empleado 
		//String empleado = new EmpleadoController().deleteEmpleado(2);
		
		  // Actualizar Empleado
		//String empleado = new EmpleadoController().updateEmpleado(3, "Croft", "Lara", 22, "Femenino", 952.0);
		//String empleado = new EmpleadoController().updateEmpleado(1, "Tenison", "Ben", 10, "Masculino", 1500.5);
		//String empleado = new EmpleadoController().updateEmpleado(4, "Peletier", "Carol", 35, "Femenino", 845.5);
		
		  // Leer Empleado
		String empleado = new EmpleadoController().getEmpleado(1);
		System.out.println(empleado);
	}

}
