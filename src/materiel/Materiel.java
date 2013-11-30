import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;


public class Materiel {
	
	String materiel_type = "materiel" ; 
	String name;
	String disponibilité;
	String description;
	Element materiel;
	
	
	//un materiel est un objet xml 
	//à changer date!!!
	
	public Materiel(Element e){
		materiel = e;
		name = materiel.getAttributeValue("name");
		description = materiel.getChild("description").getText();
		disponibilité = materiel.getChild("disponibilité").getText();
	}

	public Materiel(String nom, String descrip, String date)
	{
		description = descrip;
		disponibilité = date;
		name = nom;
		
	
		//On crée un nouvel Element materiel et on l'ajoute
	      //en tant qu'Element de racine
	     materiel = new Element(materiel_type);

	      //On crée un nouvel Attribut name et on l'ajoute à materiel
	     //grâce à la méthode setAttribute
	      Attribute title = new Attribute("name",name);
	      materiel.setAttribute(title);

	      //On crée un nouvel Element nom, on lui assigne du texte
	      //et on l'ajoute en tant qu'Element de materiel
	      Element dispo = new Element("disponibilité");
	      dispo.setText(date);
	      materiel.addContent(dispo);
		
	      Element info = new Element("description");
	      info.setText(description);
	      materiel.addContent(info);
	}
	
	public Materiel()
	{ 
		new Materiel ("no Information", "no Information", "no Information");
	}

	public Element get_materiel()
	{
		return materiel;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public String get_description()
	{
		return description;
	}
	
	public String get_materiel_type()
	{
		return materiel_type;
	}
	
	public void set_name(String nom)
	{
		name = nom;	
		Attribute title = new Attribute("name",name);
	    materiel.setAttribute(title);
	}
	
	public void set_description(String descr)
	{
		description = descr;
		materiel.removeChild("description");
		Element newinfo = new Element("description");
	    newinfo.setText(description);
	    materiel.addContent(newinfo);
	}
	
	public void set_disponibilité(String date)
	{
		disponibilité = date;
		materiel.removeChild("dispo");
		Element newdispo = new Element("disponibilité");
	    newdispo.setText(disponibilité);
	    materiel.addContent(newdispo);
	}
	
	public void printXML()
	{
		Element racine = new Element("root");

		//On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
		org.jdom.Document document = new Document(racine);
		
		//On rattache tout le reste à la racine:
		racine.addContent(materiel);
		//On utilise ici un affichage classique avec getPrettyFormat()
	    XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	    try{sortie.output(document, System.out);}
	    catch(Exception e){}
	}

	@Override
	public String toString() {
		return "Materiel [name=" + name + ", disponibilité=" + disponibilité
				+ ", description=" + description + "]";
	}
	
	
	

}
