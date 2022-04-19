package Ejercicio5a;

public class Vendedor extends Empleado {
	private Float procenComision;
	private Integer totalVentas;
	
	public Vendedor(int dni, String nombre, String apellido, String email, float sueldo, float porcen, int ventas) {
		super(dni, nombre, apellido, email, sueldo);
		this.setProcenComision(porcen);
		this.setTotalVentas(ventas);
	}
	
	public Float getProcenComision() {
		return procenComision;
	}
	public void setProcenComision(Float procenComision) {
		this.procenComision = procenComision;
	}
	public Integer getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(Integer totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public float getSueldo() {
		return this.getSueldoBase() + (this.getProcenComision()*this.getTotalVentas()/100);
	}
}
