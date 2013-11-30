package utilisateurs;

/**
 * 
 * @author Jérémy ROUMEGUE 
 *
 */

public abstract class Utilisateurs {
	
	private int numIdentifiant;
	
	public Utilisateurs(int numIdentifiant) {
		this.numIdentifiant = numIdentifiant;
	}
	
	public int getNumIdentifiant() {
		return numIdentifiant;
	}
	
	public void setNumIdentifiant(int numIdentifiant) {
		this.numIdentifiant = numIdentifiant;
	}
	
	@Override
	public String toString() {
		return "L'utilisateurs ayant l'identifiant N°" + numIdentifiant + ", est un" + this.getClass().getSimpleName() + "]";
	}
}
