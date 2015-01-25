package projet.sources;

public class Carrefour 
{
	public String nomCarrefour = null;
	public Cellule nordOuest = null;
	public Cellule nordEst = null;
	public Cellule sudOuest = null;
	public Cellule sudEst = null;
	
	
	
	public Carrefour(String nom)
	{
		this.nomCarrefour = "[+]" +  nom;
		this.nordOuest = new Cellule("NO");
		this.nordEst = new Cellule("NE");
		this.sudOuest = new Cellule("SO");
		this.sudEst = new Cellule("SE");
		
		this.nordOuest.suivants.add(sudOuest);
		this.nordEst.suivants.add(nordOuest);
		this.sudOuest.suivants.add(sudEst);
		this.sudEst.suivants.add(nordEst);
	
	}
	
	/**
	 * Connecte une route à un carrefour
	 * */
	public void connexion(Route route, String direction)
	{
		if(direction=="NORD")
		{
			route.voieUne.lastCell().suivants.add(nordOuest);
			this.nordEst.suivants.add(route.voieDeux.getVoie()[0]);
		}
		else if(direction=="SUD")
		{
			route.voieUne.lastCell().suivants.add(sudEst);
			this.sudOuest.suivants.add(route.voieDeux.getVoie()[0]);			
		}
		else if(direction=="EST")
		{
			route.voieUne.lastCell().suivants.add(nordEst);
			this.sudEst.suivants.add(route.voieDeux.getVoie()[0]);			
		}
		else if(direction=="OUEST")
		{
			route.voieUne.lastCell().suivants.add(sudOuest);
			this.nordOuest.suivants.add(route.voieDeux.getVoie()[0]);			
		}
		else
		{
			System.out.println("ERREUR : Aucune direction !");
		}
	}
	
	
	
	public String toString()
	{
		String chaineRetour = "[\n";
		chaineRetour+= "Carrefour : " + this.nomCarrefour + "\n";
		chaineRetour += "-> " + this.nordOuest.getNomCellule() + " = " + this.nordOuest.isOccupe() + "\n";
		chaineRetour += "-> " + this.nordEst.getNomCellule() + " = " + this.nordEst.isOccupe() + "\n";
		chaineRetour += "-> " + this.sudOuest.getNomCellule() + " = " + this.sudOuest.isOccupe() + "\n";
		chaineRetour += "-> " + this.sudEst.getNomCellule() + " = " + this.sudEst.isOccupe() + "\n";
		chaineRetour += "]\n";
		return chaineRetour;
	}
	
}
