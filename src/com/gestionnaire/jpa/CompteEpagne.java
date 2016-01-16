package com.gestionnaire.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * Cette classe represente un compte d'epargne
 * @author Pepe
 *
 */
@Entity
@Table (name = "COMPTEEPAGNE")
@PrimaryKeyJoinColumn (name = "COMPTEID")
public class CompteEpagne extends Compte {

	public CompteEpagne() {
		// TODO Auto-generated constructor stub
	}
	


}
