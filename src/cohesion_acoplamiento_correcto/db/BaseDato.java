package cohesion_acoplamiento_correcto.db;

import cohesion_acoplamiento_correcto.clase.Automovil;

public interface BaseDato {

	void guardar(Automovil auto);
	void editar(Automovil auto);
	Automovil obtenerPorPAtente(String patente);
}
