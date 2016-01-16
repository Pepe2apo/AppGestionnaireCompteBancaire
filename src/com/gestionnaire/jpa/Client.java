package com.gestionnaire.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Cette classe represente un client
 * @author Pepe
 *
 */
@Entity
@Table (name = "CLIENT")
public class Client implements Serializable {

	@Id
	@Column (name = "CLIENTID", nullable = false)
	private int idClient;
	@Column (name = "NAME", length = 255)
	private String name;
	@Column (name = "SURNAME", length = 255)
	private String surname;
	@Column (name = "NNI", length = 150)
	private String NNI;
	
	//Un client possede un unique adresse
	@OneToOne
	@JoinColumn (name = "ADRESSCLIENT")
	private Adresse adressClient;
	
	//Un client possede un ou plusieur cc
	@OneToMany
	@JoinColumn (name = "CLIENTCC")
	private List<CompteCourant> clientCC;
	
	//Un client possede zero ou un seul ce
	@OneToOne
	@JoinColumn (name = "CLIENTCE")
	private CompteEpagne clientCE;
	
	/**
	 * L'objet client ne prenant pas de parametre
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**m
	 * L'objet client avec ses parametres mebre
	 * @param name le nom du client		
	 * @param surname le prenom du client
	 * @param nNI l'identifiant unique du client
	 * @param adressClient l'adresse du client
	 * @param clientCC le cc du client
	 * @param clientCE le ce du client
	 */
	public Client(String name, String surname, String nNI,
			Adresse adressClient, List<CompteCourant> clientCC,
			CompteEpagne clientCE) {
		super();
		this.name = name;
		this.surname = surname;
		NNI = nNI;
		this.adressClient = adressClient;
		this.clientCC = clientCC;
		this.clientCE = clientCE;
	}

	/**
	 * 
	 * @param nameClient the name of the client to set
	 */
	public void setName(String nameClient )
	{
		this.name = nameClient;
	}
	
	/**
	 * 
	 * @return the name of the client
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * 
	 * @param surnameClient the surname of the client to set 
	 */
	public void setSurname(String surnameClient )
	{
		this.name = surnameClient;
	}
	
	/**
	 * 
	 * @return the surname of the client 
	 */
	public String getSurname()
	{
		return this.surname;
	}

	/**
	 * @return the nNI
	 */
	public String getNNI() {
		return NNI;
	}

	/**
	 * @param nNI the nNI to set
	 */
	public void setNNI(String nNI) {
		NNI = nNI;
	}

	/**
	 * @return the adressClient
	 */
	public Adresse getAdressClient() {
		return adressClient;
	}

	/**
	 * @param adressClient the adressClient to set
	 */
	public void setAdressClient(Adresse adressClient) {
		this.adressClient = adressClient;
	}
	
}
