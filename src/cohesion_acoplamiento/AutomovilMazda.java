package cohesion_acoplamiento;

public class AutomovilMazda {
	
	private String modelo;
	private String marca;
	private MysqlDBAuto db;
			
	public AutomovilMazda() {}
	public AutomovilMazda(String modelo, String marca, MysqlDBAuto db) {
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
	
	public void agregarAuto(AutomovilMazda auto) {
		db.crearAuto(auto);
	}
	
	public void editarAuto(AutomovilMazda auto) {
		db.crearAuto(auto);
	
	}

}
