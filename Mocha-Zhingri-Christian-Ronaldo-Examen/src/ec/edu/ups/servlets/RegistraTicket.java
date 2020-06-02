package ec.edu.ups.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.DaoCliente;
import ec.edu.ups.dao.DaoTelefono;
import ec.edu.ups.dao.DaoTicket;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.dao.DaoVehiculo;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.telefono;
import ec.edu.ups.modelo.user;

/**
 * Servlet implementation class RegistraTicket
 */
@WebServlet("/RegistraTicket")
public class RegistraTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistraTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cedula = request.getParameter("cedula");

		String placaVehiculo = request.getParameter("placaVehiculo");
		String marcaVehiculo = request.getParameter("marcaVehiculo");
		String modeloVehiculo = request.getParameter("modeloVehiculo");

		String numeroTicket = request.getParameter("numeroTicket");
		String fechaEntrada = request.getParameter("fechaEntrada");
		String horaEntrada = request.getParameter("horaEntrada");
		String fechaSalida = request.getParameter("fechaSalida");
		String horaSalida = request.getParameter("horaSalida");

		DaoTicket ticketDao = DAOFactory.getFactory().getDaoTicket();
		Ticket phone = new Ticket(numeroTicket, fechaEntrada, fechaSalida,horaSalida);

		DaoVehiculo vehicuoDao = DAOFactory.getFactory().getUsuarioDAO();
		user user = userDao.findById(String.valueOf(request.getSession().getAttribute("userId")));

		user.addTelefono(phone);
		userDao.update(user);
//        phone.setUser(user);
//        phoneDao.create(phone);

		response.sendRedirect("/AgendaTelefonica/Agenda");

	}

}
