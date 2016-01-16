package com.gestionnaire.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cette classe represente l'adresse d'un client
 * @author Pepe
 *
 */
@Entity
@Table (name = "ADRESS")
public class Adresse implements Serializable{
	@Id
	@Column (name = "ADRESSID", nullable = false)
    private int idADress;
	@Column (name = "STREETNAME", length = 255)
	private String streetName;
	@Column (name = "STREETNUMBER", length = 255)
	private String streetNumber;
	@Column (name = "CODEPOSTAL", length = 150)
	private String codePostal;
	
	
	/**
	 * L'objet adresse qui n'a pas de parametre
	 */
	public Adresse() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * L'objet adresse avec des parametres membre
	 * @param nomRue le nom de la rue
	 * @param nroRue le nro de la rue
	 * @param code le code postale de la rue
	 */
	public Adresse(String nomRue, String nroRue, String code){
		this.streetName = nomRue;
		this.streetNumber = nroRue;
		this.codePostal = code;
	}

	/**
	 * 
	 * @param nomStreet the nameStreet of the Adress to set 
	 */
	public void setStreetName(String nomStreet){
		this.streetName = nomStreet;
	}
	
	/**
	 * 
	 * @return the street name
	 */
	public String getStreetName(){
		return this.streetName;
	}
	
	/**
	 * 
	 * @param nroStreet the numberStreet of the adress to set
	 */
	public void setStreetNro(String nroStreet){
		this.streetName = nroStreet;
	}
	
	/**
	 * 
	 * @return the numberStreet of Adress
	 */
	public String setStreetNro(){
		return this.streetNumber;
	}
	/**
	 * 
	 * @param codePostale the codePostale of the adress to set
	 */

	public void setCodePostal(String codePostale){
		this.codePostal = codePostale;
	}
	
	/**
	 * 
	 * @return the codePostal of the adress
	 */
	public String setCodePostal(){
		return this.codePostal;
	}
}
