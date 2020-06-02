package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPAVehiculoDAO;
import ec.edu.ups.jpa.JPAClienteDAO;
import ec.edu.ups.jpa.JPATicketDao;

public class JPADAOFactory extends DAOFactory {

	
	@Override
	public DaoCliente getDaoCliente() {
		// TODO Auto-generated method stub
		return new JPAClienteDAO();
	}

	@Override
	public DaoVehiculo getDaoVehiculo() {
		// TODO Auto-generated method stub
		return new JPAVehiculoDAO();
	}

	@Override
	public DaoTicket getDaoTicket() {
		// TODO Auto-generated method stub
		return new JPATicketDao();
	}
	

}
