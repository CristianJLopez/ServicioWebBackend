package com.salle.entities;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Dependencia implements Serializable {
	//--------------------------------
		//Constantes de la Clase.
		//--------------------------------
		/**
		* Constante de Serializaci�n.
		*/
		private static final long serialVersionUID = -6362794385792247263L;
		//--------------------------------
		//Atributos de la Clase.
		//--------------------------------
		/**
		* Identificador de la entidad Dependencia
		*/
		private int id;
		/**
		* Codigo de la dependencia
		*/
	private String codigo;
	/**
	* Descripci�n de la dependencia
	*/
	private String descripcion;
	/**
	* Cargo que dirije la deendencia.
	*/
	private String cargo;
	/**
	* Estado de la dependencia
	*/
	private boolean estado;
	private String siglaDependencia;

	//--------------------------------
	//Constructor de la Clase.
	//--------------------------------
	/**
	* Constructor por Defecto.
	*/
	public Dependencia( ) {
	}
	//--------------------------------
		//Metodos de la Clase.
		//--------------------------------
		/**
		* @return the idDependencia
		*/
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "ID_DEPENDENCIA_PK", nullable = false )
	public int getId( ) {
	return id;
	}
	/**
	* @param idDependencia the idDependencia to set
	*/
	public void setId( int idDependencia ) {
	this.id = idDependencia;
	}
	/**
	* @return the codigo
	*/
	@Column( name = "DESCRIPCION", nullable = false )
	public String getDescripcion( ) {
	return descripcion;
	}
	/**
	* @param descripcion the descripcion to set
	*/
	public void setDescripcion( String descripcion ) {
	this.descripcion = descripcion;
	}
	@Column( name = "CODIGO", nullable = false )
	public String getDescripcion1( ) {
	return codigo;
	}
	/**
	* @param codigo the descripcion to set
	*/
	@Column( name = "CARGO", nullable = false )
	public String getcargo( ) {
	return cargo;
	}
	/**
	* @param descripcion the descripcion to set
	*/
	public void setDescripcion1( String descripcion ) {
	this.descripcion = descripcion;
	}
	public void setCodigo( String codigo ) {
		this.codigo = codigo;
		}
		/**
		* @return the siglaDependencia
		*/
		@Column( name = "SIGLA_DEPENDENCIA")
		public String getSiglaDependencia( ) {
		return getSiglaDependencia();
		}
		/**
		* @param siglaRol the siglaRol to set
		*/
		public void setSiglaDependencia(String siglaDependencia) {
		this.siglaDependencia = siglaDependencia;
		}
		/**
		* @return the estado
		*/
		@Column( name = "ESTADO", nullable = false )
		public boolean getEstado( ) {
		return estado;
		}
		/**
		* @param estado the estado to set
		*/
		public void setEstado( boolean estado ) {
		this.estado = estado;
		}
		/* (non-Javadoc)
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
		return "Dependencia [id=" + id + ", descripcion=" + descripcion + ", siglaDependencia="
		+ siglaDependencia + ", estado=" + estado + ", cargo=" + cargo +", codigo=" + codigo +" ]";
		}
	}