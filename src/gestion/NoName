import java.util.*;
import java.io.File;
import java.io.FileOutputStream;

import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;

public class NoName {

	public ArrayList<Materiel> lMateriel;
	public org.jdom.Document document;
	public Element racine;

	public NoName(String fichierXML) {
		lMateriel = new ArrayList<Materiel>();
		SAXBuilder sxb = new SAXBuilder(); // On crée une instance de SAXBuilder
											// (cf tuto)

		try {
			document = sxb.build(new File(fichierXML));
		} // On crée un nouveau document JDOM avec en argument le fichier XML

		catch (Exception e) {
		}

		racine = document.getRootElement(); // On récupère l' Element racine du
											// doc.xml

		List lObjet = racine.getChildren();

		Iterator i = lObjet.iterator(); // On crée un Iterator sur notre liste
										// d'Element XML

		while (i.hasNext()) {
			Element courant = (Element) i.next(); // L'element courant
													// correspond à un noeud
													// "materiel"
			//Avec, On crée un objet
			// Materiel et on l'ajoute à notre tableau:
			lMateriel.add(new Materiel (courant)); 
		}
	}

	public void AfficheAll() {
		Iterator<Materiel> iter = lMateriel.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + "\n");
		}
	}
	
	public void ajouterMateriel(String nom, String descrip, String date)
	{
		Materiel m = new Materiel (nom, descrip, date);
		lMateriel.add(m);
		
		racine.addContent(m.get_materiel());	//on ajoute m au document
	}
	
	/* à ameliorer car un peu fouilli... pour modifier un Materiel
	 * Le premier argument c'est le nom du Materiel à modifier
	 * Le deusième c'est ce qu'on veut modifier ( name, date ou description )
	 * Le troisième la nouvelle valeur
	 * NB: il faut gerer que le nom existe pas déjà
	 */
	public void modifier(String name, String tomodify, String newValue )
	{
		Iterator<Materiel> iter = lMateriel.iterator();
		while (iter.hasNext()) 
		{
			Materiel courant = iter.next();
			if ( name.equals(courant.get_name()) )
			{
				switch (tomodify)
				{
					case "name": courant.set_name(newValue);break;
					case "date": courant.set_disponibilité(newValue);break;
					case "description": courant.set_description(newValue);break;
				}
			}
		}
	}
	
	
	
	/*enregistre tous ce qu'il y a dans la liste de materiel
	 *@author http://cynober.developpez.com/tutoriel/java/xml/jdom/
	 */
	public void enregistrer(String fichierXML)
	{
		try
		   {
		      //On utilise ici un affichage classique avec getPrettyFormat()
		      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		      //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
		      //avec en argument le nom du fichier pour effectuer la sérialisation.
		      sortie.output(document, new FileOutputStream(fichierXML));
		   }
		   catch (java.io.IOException e){}
	}
}
