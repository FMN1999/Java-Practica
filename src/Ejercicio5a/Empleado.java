package Ejercicio5a;

public class Empleado {
	private Integer dni;
	private String nombre, apellido, email;
	private Float sueldoBase;
	
	public Empleado(int dni, String nombre, String apellido, String email, float sueldo) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setSueldoBase(sueldo);
	}
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public void getDetalle(boolean mostrarDatosSensibles) {
		String detalle= "Empleado -";
		if(mostrarDatosSensibles) {
			detalle+=this.getDni()+": ";
		}
		detalle+= this.getApellido()+ ", "+ this.getNombre() + ". Email: " + this.getEmail()+ ".";
		System.out.println(detalle); 
	}
}
