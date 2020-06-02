package ec.edu.ups.jpa;

import ec.edu.ups.dao.DaoTicket;
import ec.edu.ups.modelo.Ticket;

public class JPATicketDao extends JPAGenericDAO<Ticket, Integer> implements DaoTicket {

	public JPATicketDao() {
		super(Ticket.class);
		// TODO Auto-generated constructor stub
	}

}
