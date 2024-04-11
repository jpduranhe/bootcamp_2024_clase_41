package cohesion_acoplamiento_correcto;

import cohesion_acoplamiento_correcto.clase.*;
import cohesion_acoplamiento_correcto.db.*;

public class Main {
	
	private static BaseDato bd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bd= new MysqlDataBase();
		bd= new OracleDataBase();
		
		
		Mazda cx5= new Mazda("CX5","XX-00");
		Toyota supra= new Toyota("Supra","TT-00");
		
		guardar(cx5);
		guardar(supra);
	}

	
	public static void guardar(Automovil auto) {
		bd.guardar(auto);
	}
}
