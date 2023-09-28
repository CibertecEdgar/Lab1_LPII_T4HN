package Controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Models.Empleado;

public class EmpleadoController {
	
	// CREAR EMPLEADO
	public String createEmpleado(String apellidos, String nombres, int edad, String sexo, Double salario) {
		SessionFactory sessionFactory = new Configuration().configure("cl1.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			Empleado empleado = new Empleado(apellidos, nombres, edad, sexo, edad);
			
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado creado correctamente";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al crear empleado";
	}
	
	// ELIMINAR EMPLEADO
	public String deleteEmpleado(int idEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("cl1.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Empleado eliminado correctamente";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al eliminar Empleado";
	}
	
	// ACTUALIZAR EMPLEADO
	public String updateEmpleado(int idEmpleado, String Apellidos, String Nombres, int Edad, String Sexo, double Salario) {
		SessionFactory sessionFactory = new Configuration().configure("cl1.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			empleado.setApellidos(Apellidos);
			empleado.setNombres(Nombres);
			empleado.setEdad(Edad);
			empleado.setSexo(Sexo);
			empleado.setSalario(Salario);
			
			session.update(empleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Empleado actualizado Correctamente";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al actualizar Empleado";
	}
	
	// LEER EMPLEADO
	public String getEmpleado(int idEmpleado) {
        SessionFactory sessionFactory = new Configuration().configure("cl1.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado encontrado correctamente";
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al leer Empleado";
	}
	
	
}
