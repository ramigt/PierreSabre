package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoisson() + ".");

	}

	public void boire() {
		System.out.println("Mmmm, un bon verre de " + getNom() + " GLOUPS !");

	}

	public void acheter(String bien, int prix) {
		System.out.println(
				" J'ai " + getArgent() + " en poche. Je vais pouvoir m'offrir une" + bien + " à " + prix + ".");

	}

	public void gagnerArgent(int gain) {

	}

	public void perdreArgent(int perte) {

	}

	public void parler(String texte) {
		System.out.println(texte);

	}

}
