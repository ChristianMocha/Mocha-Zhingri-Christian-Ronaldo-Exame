package ec.edu.ups.jpa;


import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.DaoCliente;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JPAClienteDAO extends JPAGenericDAO<Cliente, String> implements DaoCliente {

	public JPAClienteDAO() {
		//super(user.class);
		super(Cliente.class);
	}
//	
//	@Override
//	public user findPrsona(String correo, String contrasena) {
//		// TODO Auto-generated method stub
//		System.out.println("Correo " + correo + " Contrasena " + contrasena);
//		String  sql = "FROM user u WHERE u.email = '" + correo + "' AND u.password = '" + contrasena + "'";
//		user user = (user) em.createQuery(sql).getSingleResult();
//		user.getTelefono().size();
//		return user;
//	}
//
//	@Override
//	public List<user> findByIdOrMail(String context) {
//		List<user> users = new ArrayList<user>();//creo q sta mal
//		if (context.equals("all")) {
//			users = (List<user>) em.createQuery("FROM user u").getResultList();
//		}else {
//			String spql = "FROM user u WHERE u.cedula = '" + context + "' OR u.email = '" + context + "'";
//			users = (List<user>) em.createQuery(spql).getResultList();
//		}
//		return users;
//	}
//
//  


}
