package examen.finall;

public class Poliza {
	String nombre;
	String descripcion;
	int anioVigencia;
	int codigoPoliza;
	int valorPoliza;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getAnioVigencia() {
		return anioVigencia;
	}
	public void setAnioVigencia(int anioVigencia) {
		this.anioVigencia = anioVigencia;
	}
	public int getCodigoPoliza() {
		return codigoPoliza;
	}
	public void setCodigoPoliza(int codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
	}
	public double getValorPoliza() {
		return valorPoliza;
	}
	public void setValorPoliza(int valorPoliza) {
		this.valorPoliza = valorPoliza;
	}
	@Override
	public String toString() {
		return "Poliza [nombre=" + nombre + ", descripcion=" + descripcion + ", anioVigencia=" + anioVigencia
				+ ", codigoPoliza=" + codigoPoliza + ", valorPoliza=" + valorPoliza + "]";
	}
	

}
