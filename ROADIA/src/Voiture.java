import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Voiture 
{
	private String nomVoiture = "";
	private Cellule celluleCourante = null;
	
	/**
	 * Retourne les suivants de la la cellule courante dans le désordre
	 * */
	public ArrayList<Cellule> suivantsAleatoire()
	{
		ArrayList<Cellule> maliste = new ArrayList<Cellule>(this.celluleCourante.suivants);
		Collections.shuffle(maliste);
		return maliste;
		
	}
	/*
	public boolean checkSuivants()
	{
		ArrayList<Cellule> suivantsDesordre = suivantsAleatoire();
		Iterator<Cellule> it = suivantsDesordre.iterator();
		
		while(it.hasNext())
		{
			
		}
	}
	
	
	
	
	//METHODE
	
	public boolean seDeplace()
	{
		
		//on test si celluleCourante pas null sinon erreur
		if(this.celluleCourante != null)
		{
			//on test si celluleSuivantes pas null sinon bouge pas
			int suivantAleatoire = 1 + (int)(Math.random() * ((this.celluleCourante.suivants.size() - 1)));
			
			if(this.celluleCourante.suivants.get(suivantAleatoire) != null)
			{
				
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
		
		//on test si celluleSuivantes est libre
		//
	}
	*/
	// CONSTRUCTEUR
	
	
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
