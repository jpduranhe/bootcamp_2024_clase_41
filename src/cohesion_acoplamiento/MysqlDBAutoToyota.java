package cohesion_acoplamiento;

public class MysqlDBAutoToyota {

	
	void crearAuto(AutomovilToyota automovil) {}
	void editarAuto(AutomovilToyota automovil) {}
	AutomovilToyota obtenerAutomovil(String patente) {
		return new AutomovilToyota();
	}
}
