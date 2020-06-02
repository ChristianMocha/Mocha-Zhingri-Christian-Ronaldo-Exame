package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private Date fechaHoraIngreso;
	private Date fechaHoraSalida;
	@OneToOne
	private Vehiculo vehiculo;
	public Ticket() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFechaHoraIngreso() {
		return fechaHoraIngreso;
	}
	public void setFechaHoraIngreso(Date fechaHoraIngreso) {
		this.fechaHoraIngreso = fechaHoraIngreso;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaHoraIngreso == null) ? 0 : fechaHoraIngreso.hashCode());
		result = prime * result + ((fechaHoraSalida == null) ? 0 : fechaHoraSalida.hashCode());
		result = prime * result + id;
		result = prime * result + numero;
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (fechaHoraIngreso == null) {
			if (other.fechaHoraIngreso != null)
				return false;
		} else if (!fechaHoraIngreso.equals(other.fechaHoraIngreso))
			return false;
		if (fechaHoraSalida == null) {
			if (other.fechaHoraSalida != null)
				return false;
		} else if (!fechaHoraSalida.equals(other.fechaHoraSalida))
			return false;
		if (id != other.id)
			return false;
		if (numero != other.numero)
			return false;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", numero=" + numero + ", fechaHoraIngreso=" + fechaHoraIngreso
				+ ", fechaHoraSalida=" + fechaHoraSalida + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
	

}
