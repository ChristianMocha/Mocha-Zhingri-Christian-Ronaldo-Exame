package ec.edu.ups.jpa;

import ec.edu.ups.dao.DaoCliente;
import ec.edu.ups.dao.DaoVehiculo;
import ec.edu.ups.modelo.Vehiculo;

public class JPAVehiculoDAO extends JPAGenericDAO<Vehiculo, Integer> implements DaoVehiculo{

	public JPAVehiculoDAO(){
		super(Vehiculo.class);

	}

}