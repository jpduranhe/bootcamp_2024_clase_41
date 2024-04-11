package cohesion_acoplamiento;

public class AutomovilToyota {
	
	private String modelo;
	private String marca;
	private MysqlDBAutoToyota db;
			
	public AutomovilToyota() {}
	public AutomovilToyota(String modelo, String marca, MysqlDBAutoToyota db) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.db = db;
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
	
	public void agregarAuto(AutomovilToyota auto) {
		db.crearAuto(auto);
	}
	
	public void editarAuto(AutomovilToyota auto) {
		db.crearAuto(auto);
	
	}

}
