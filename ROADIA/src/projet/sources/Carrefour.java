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
		
		this.nordOuest.suivants.add(nordEst);
		this.nordEst.suivants.add(sudOuest);
		this.sudOuest.suivants.add(sudEst);
		this.sudEst.suivants.add(nordOuest);
	
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
