package utilisateurs;

import gestion.IHM;
import java.util.GregorianCalendar;
import materiel.Materiel;

/**
 * 
 * @author rj105647
 *
 */

public class Professeurs extends Emprunteur {

	public Professeurs(int numIdentifiant) {
		super(numIdentifiant,15);
	}
	
	public void reserver(Materiel materiel, GregorianCalendar dateEmprunt, GregorianCalendar dateRetour){
		IHM.reserver(this,materiel,dateEmprunt,dateRetour);
	}
}
