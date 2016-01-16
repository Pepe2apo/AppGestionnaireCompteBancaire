package com.gestionnaire.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * Cette classe represente un compte courrant
 * @author Pepe
 *
 */
@Entity
@Table (name = "COMPTECOURANT")
@PrimaryKeyJoinColumn (name = "COMPTEID")
public class CompteCourant extends Compte {

	/**
	 * Le montant repressentant le decouvert d'un compte
	 */
	
	@Column (name = "DECOUVERT")
	private float decouvert;
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}


	
}
