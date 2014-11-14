package projet.sources;


public class Voie 
{

	//LinkedList<Cellule> voie = new LinkedList<Cellule>();
	private Cellule voie[];
	private String nomVoie = "";

	
	// CONSTRUCTEURS
	public Voie(String nomVoie, int taille) 
	{
		this.nomVoie = "V" + nomVoie;
		this.setVoie(new Cellule[taille]); 
		
		
		for(int i = 0;i<taille;i++)
		{
			this.voie[i] = new Cellule(this.nomVoie + "C"+i);	
		}
		
	}

	
	// toString
	
	public String toString()
	{
		String chaineRetour = "[\n";
		chaineRetour+= "Voie : " + this.getNomVoie() + "\n";
		
		for(int i = 0;i<this.voie.length;i++)
		{
			chaineRetour += "-> " + this.voie[i].getNomCellule() + " = " + this.voie[i].isOccupe() + "\n";
		}
		
		chaineRetour += "]\n";
		return chaineRetour;
	}
	
	
	
	//MUTATEURS
	public String getNomVoie() {
		return nomVoie;
	}


	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}


	public Cellule[] getVoie()
	{
		return voie;
	}


	public void setVoie(Cellule voie[])
	{
		this.voie = voie;
	}
	





}
