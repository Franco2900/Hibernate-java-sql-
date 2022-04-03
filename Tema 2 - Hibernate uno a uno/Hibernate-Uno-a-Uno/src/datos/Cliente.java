package datos;

import java.time.LocalDate;
import funciones.Funciones;

public class Cliente {
	
	//Atributos
	private long idCliente ;
	private String apellido ;
	private String nombre ;
	private int dni ;
	private LocalDate fechaDeNacimiento ;
	private boolean baja ;
	private Contacto contacto ;
	
	
	//Constructores
	public Cliente(){}
	
	public Cliente(String apellido, String nombre, int dni ,LocalDate fechaDeNacimiento, Contacto contacto){
		super ();
		this.apellido = apellido ;
		this.nombre = nombre ;
		this.dni = dni ;
		this.fechaDeNacimiento = fechaDeNacimiento ;
		this.baja = false ;
		this.setContacto( contacto );
	}
	
	
	//Getters y Setters
	public long getIdCliente() {
		return idCliente ;
	}
	protected void setIdCliente( long idCliente ) {
		this.idCliente = idCliente ;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido ) {
		this.apellido = apellido ;
	}
	
	public String getNombre() {
		return nombre ;
	}
	public void setNombre(String nombre ) {
		this.nombre = nombre ;
	}
	
	public int getDni() {
		return dni ;
	}
	public void setDni( int dni ) {
		this.dni = dni ;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento ;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento ) {
		this.fechaDeNacimiento = fechaDeNacimiento ;
	}
	
	public boolean isBaja() {
		return baja ;
	}
	public void setBaja( boolean baja ) {
		this.baja = baja ;
	}
	
	public Contacto getContacto() {
		return contacto ;
	}
	public void setContacto(Contacto contacto ) {
		this.contacto = contacto ;
	}

	public String toString(){
		return (idCliente + " " + apellido + " " + nombre + " DNI: " + dni + " F.de Nacimiento:"+ Funciones.traerFechaCorta(fechaDeNacimiento)+ " " + baja );
	}
	
}