package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "Kombucha", 54);

		humain.direBonjour();
		humain.acheter("boisson", 12);
		humain.boire();
		humain.parler(" J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		humain.parler("Je n'ai plus que 40 sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");

	}

}
