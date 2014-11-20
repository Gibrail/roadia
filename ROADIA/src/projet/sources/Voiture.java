package projet.sources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Voiture 
{
	private String nomVoiture = "";
	private Cellule celluleCourante = null;
	
	/**
	 * Retourne les suivants de la cellule courante dans le désordre
	 * */
	public ArrayList<Cellule> suivantsAleatoire()
	{
		ArrayList<Cellule> maliste = new ArrayList<Cellule>(this.celluleCourante.suivants);
		Collections.shuffle(maliste);
		return maliste;
		
	}
	
	public Cellule choixSuivant()
	{
		
		ArrayList<Cellule> suivantsDesordre = suivantsAleatoire();
		Iterator<Cellule> it = suivantsDesordre.iterator();
		Cellule toReturn = it.next();
		while ( (it.hasNext()) )
		{
			if(it.next().isOccupe() == true)
			{
				suivantsDesordre.remove(0);
			}
			else if (it.next().isOccupe() == false)
			{
				toReturn=it.next();
				break;
			}
		}
		return toReturn;
	}
	
	
	
	
	//METHODE
	
	public boolean seDeplace()
	{
		boolean toReturn = false;
		//on test si celluleCourante pas null sinon erreur
		if(this.celluleCourante != null)
		{
			//on test si celluleSuivantes pas null sinon bouge pas
			
			if(this.choixSuivant() != null)
			{
				this.celluleCourante=choixSuivant();
				toReturn = true;
			}
			else
			{
				System.out.println("La voiture reste sur place");
			}
		}
		else
		{
			System.out.println("ERREUR ! Cellule courante nulle !");
		}
		return toReturn;
	}
	
	// CONSTRUCTEURS
	
	
	public Voiture(String nouveauNomVoiture, Voie voie)
	{
		this.nomVoiture = nouveauNomVoiture;
		//TODO la voiture ne doit pas s'instancier là où il y en a une
		int nombreAleatoire = 1 + (int)(Math.random() * ((voie.getVoie().length - 1) ));
		this.celluleCourante = voie.getVoie()[nombreAleatoire];
		this.celluleCourante.setOccupe(true);
	}
	
	public Voiture(Cellule cell)
	{
		this.celluleCourante = cell;
		this.celluleCourante.setOccupe(true);
	}

	
	// MUTATEURS
	public Cellule getCelluleCourante() 
	{
		return celluleCourante;
	}

	public void setCelluleCourante(Cellule celluleCourante) 
	{
		this.celluleCourante = celluleCourante;
	}

	public String getNomVoiture()
	{
		return nomVoiture;
	}

	public void setNomVoiture(String nomVoiture)
	{
		this.nomVoiture = nomVoiture;
	}
}
