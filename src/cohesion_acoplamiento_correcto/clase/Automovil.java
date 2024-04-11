package cohesion_acoplamiento_correcto.clase;

public abstract class Automovil {

	private String modelo;
	private String marca;
	private String patente;
	
	
	
	
	public Automovil(String marca,String modelo, String patente) {
		super();
		this.marca=marca;
		this.modelo = modelo;
		this.patente = patente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
}
