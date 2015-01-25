package projet.sources;

public class Route 
{
	public String nomRoute = "";
	public Voie voieUne;
	public Voie voieDeux;
	
	public Route(String nouvNomRoute, String nouvNomVoie1, String nouvNomVoie2, int tailleRoute)
	{
		this.nomRoute = "R" + nouvNomRoute;
		this.voieUne = new Voie(nouvNomVoie1, tailleRoute);
		this.voieDeux = new Voie(nouvNomVoie2, tailleRoute);
	}
	
	
	public String toString()
	{
		String chaineRetour = "[\n";
		chaineRetour+= "Route : " + this.nomRoute + "\n";
		chaineRetour+= this.voieUne.toString();
		chaineRetour+= "\n";
		chaineRetour+= this.voieDeux.toString();
		chaineRetour += "]\n";
		return chaineRetour;
	}
}
