package projet.sources;
import java.util.ArrayList;
import java.util.Iterator;


public class Cellule 
{
	// La ou les cellules qui suivent 
	public ArrayList<Cellule> suivants = new ArrayList<Cellule>();
	private boolean occupe = false;
	private String nomCellule = "";
	
	
	
	//CONSTRUCTEURS
	public Cellule(String nom)
	{
		//this.suivants = null;
		this.occupe = false;
		this.nomCellule = nom;
	}
	
	
	//toString
	public String toString()
	{
		String okp = null;
		int cpt = 0;
		String chaineRetour = "[";
		if(this.isOccupe() == false)
			okp = "Libre";
		else if(this.isOccupe() == true)
			okp = "Occupé";
		
		chaineRetour += this.nomCellule + ": " + okp + "\n";
		
		try
		{
			Iterator<Cellule> it = suivants.iterator();
			while(it.hasNext())
			{
				cpt++;
				chaineRetour += "n°"+cpt + " " + it.next().nomCellule + "\n";
			}
		}
		catch (Exception e)
		{
			chaineRetour += " Pas de suivants!";
			//System.out.println("Pas de suivants !!!");
		}
		chaineRetour += "]";
		return chaineRetour;
	}
	
	
	// MUTATEURS
	public boolean isOccupe() 
	{
		return this.occupe;
	}
	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}


	public String getNomCellule() {
		return nomCellule;
	}


	public void setNomCellule(String nomCellule) {
		this.nomCellule = nomCellule;
	}
}
