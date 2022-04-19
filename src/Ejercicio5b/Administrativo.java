package Ejercicio5b;

public class Administrativo extends Empleado {
	private Integer hsExtra;
	private Integer hsMes;
	
	public Administrativo(int dni, String nombre, String apellido, String email, float sueldo, int extra, int mes) {
		super(dni, nombre, apellido, email, sueldo);
		this.setHsExtra(extra);
		this.setHsMes(mes);
	}
	
	public Integer getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(Integer hsExtra) {
		this.hsExtra = hsExtra;
	}
	public Integer getHsMes() {
		return hsMes;
	}
	public void setHsMes(Integer hsMes) {
		this.hsMes = hsMes;
	}
	
	public float getSueldo() {
		return (float) (this.getSueldoBase()*((this.getHsExtra()*1.5)+this.getHsMes())/this.getHsMes());
	}
	
	@Override
	public String getDetalle(boolean mostrarDatosSensibles) {
		return super.getDetalle(mostrarDatosSensibles) +", Sueldo: "+ this.getSueldo();
	}
}
