package utilisateurs;

import materiel.Materiel;
import gestion.IHM;
import java.util.GregorianCalendar;

/**
 * 
 * @author rj105647
 *
 */

public class Emprunteur extends Utilisateurs {
	private int dureeMaxEmprunt;

	public Emprunteur(int numIdentifiant) {
		super(numIdentifiant);
		this.setDureeMaxEmprunt(10);
	}

	public Emprunteur(int numIdentifiant, int dureeMaxEmprunt) {
		super(numIdentifiant);
		this.setDureeMaxEmprunt(dureeMaxEmprunt);
	}

	public int getDureeMaxEmprunt() {
		return dureeMaxEmprunt;
	}

	protected void setDureeMaxEmprunt(int dureeMaxEmprunt) {
		this.dureeMaxEmprunt = dureeMaxEmprunt;
	}
	
	public void emprunter(Materiel materiel, GregorianCalendar dateEmprunt, GregorianCalendar dateRetour) {
		IHM.emprunter(this,materiel,dateEmprunt,dateRetour);
	}
}
