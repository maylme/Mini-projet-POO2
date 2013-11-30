package utilisateurs;

/**
 * 
 * @author Jérémy ROUMEGUE 
 *
 */

public abstract class Utilisateurs {
	
	private int numIdentifiant;
        private String password;
	
	public Utilisateurs(int numIdentifiant) {
		this.numIdentifiant = numIdentifiant;
	}
	
	public int getNumIdentifiant() {
		return numIdentifiant;
	}  
	
	@Override
	public String toString() {
		return "L'utilisateurs ayant l'identifiant N°" + numIdentifiant + ", est un" + this.getClass().getSimpleName() + "]";
	}
}
