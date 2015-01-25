package projet.tests;

import projet.sources.Carrefour;
import projet.sources.Cellule;
import projet.sources.Voie;
import projet.sources.Voiture;


public class Main 
{

	public static void main(String[] args) 
	{
		
		
		Carrefour carrefour1 = new Carrefour("1");
		System.out.println(carrefour1);
/*
		Cellule cell1 = new Cellule("cellule1");
		Cellule cell2 = new Cellule("Bruno 2");
		cell2.setOccupe(true);
		cell1.suivants.add(cell2);
		cell1.suivants.add(cell2);
		System.out.println(cell1);
		System.out.println(cell2);
		//int nombreAleatoire = 1 + (int)(Math.random() * ((voie1.getVoie().length - 1) + 1));
		//System.out.println(nombreAleatoire);

		ArrayList listeExemple = new ArrayList();
		listeExemple.add("A");
		listeExemple.add("B");
		listeExemple.add("C");
		listeExemple.add("D");
		listeExemple.add("E");
		listeExemple.add("F");
		listeExemple.add("G");
		listeExemple.add("H");
		listeExemple.add("I");
		listeExemple.add("J");
		listeExemple.add("K");
		listeExemple.add("L");		
		System.out.println("Initial collection: "+listeExemple);
		Collections.shuffle(listeExemple);
		System.out.println("Final   collection: "+listeExemple);

		Voie voie1 = new Voie("A", 7);
		Voie voie2 = new Voie("B", 4);
		Voie voie3 = new Voie("C", 5);
		Cellule lastCell = voie1.getVoie()[voie1.getVoie().length -1];

		System.out.println(voie1);
		System.out.println(voie2);
		System.out.println(voie3);
		
		lastCell.suivants.add(voie2.getVoie()[0]);
		lastCell.suivants.add(voie3.getVoie()[0]);
		System.out.println(lastCell);
		Voiture voiture1 = new Voiture("TwingoBruno",voie1);
		for(int i=0; i<10; i++)
		{
			voiture1.seDeplace();
			System.out.println(voie1);
			System.out.println(voie2);
			System.out.println(voie3);
		}
		

		System.out.println(voie2);
		
		Voiture voiture1 = new Voiture("VoitureTest1",voie2);
		System.out.println(voie2);
		voiture1.seDeplace();
		System.out.println(voie2);
*/
	}
}
