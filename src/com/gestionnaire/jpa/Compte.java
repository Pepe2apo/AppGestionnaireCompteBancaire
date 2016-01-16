package com.gestionnaire.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *  Cette classe represente un Compte bancaire (classe de base)
 * @author Pepe 
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte implements Serializable{
	@Id
	@Column (name = "COMPTEID", nullable = false)
	private int idCompte;
	/**
	 * Le solde du compte
	 */
	protected float solde;
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param solde
	 */
	public Compte(float solde) {
		super();
		this.solde = solde;
	}



}
