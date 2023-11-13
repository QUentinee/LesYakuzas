package personnages;

public class Humain {
	
	private static final int CONNAISSANCES_MAX = 3;
	
	// 
	
	private String nom;
	private String boisson_fav;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[CONNAISSANCES_MAX];
	
	
	public Humain(String nom, String boisson_fav, int argent) {
		 this.nom = nom;
		 this.boisson_fav = boisson_fav;
		 this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + "et j'aime boire du " + this.boisson_fav);
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson_fav + " ! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	public void perdreArgent(int perte) {
		this.argent += perte;
	}
	public void acheter(String bien, int prix) {
		if(argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + "sous");
			argent -= prix;
		}
		else {
			parler("Je n'ai plus que " + this.argent + "sous en poche. Je ne peux même pas m'offrir un " + bien);
		}
	}
	public void faireConnaissanceAvec(Humain autrehumain) {
		direBonjour();
		repondre(autrehumain);
		this.memoriser(autrehumain);
		autrehumain.memoriser(this);
	}
	private void memoriser(Humain humain) {
		if(this.nbConnaissance == CONNAISSANCES_MAX) {
			for(int i = 0; i < CONNAISSANCES_MAX-1; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[CONNAISSANCES_MAX-1] = humain;
		}
		else {
			this.memoire[this.nbConnaissance] = humain;
			this.nbConnaissance++;
		}
	}
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	public void listerConnaissance() {
		String liste = "";
		for(int i = 0; i < this.nbConnaissance; i++) {
			liste += ", " + this.memoire[i].getNom();
		}
		this.parler("Je connais beaucoup de monde dont : " + liste);
	}
	
}

