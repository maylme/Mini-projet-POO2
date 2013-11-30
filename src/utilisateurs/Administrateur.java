package utilisateurs;

import gestion.IHM;
import materiel.Materiel;

/**
 * 
 * @author rj105647
 *
 */

public class Administrateur extends Utilisateurs {

	public Administrateur(int numIdentifiant) {
		super(numIdentifiant);
	}
	
	public void ajouterStock(Materiel materiel, int nombre){
		IHM.ajoutMateriel(this, materiel, nombre);
	}
	
	public void retirerStock(Materiel materiel, int nombre){
		IHM.retirerMateriel(this, materiel, nombre);
	}

}
