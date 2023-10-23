package personnages;

public class yakuza extends Humain {
	private String clan;
	private int reputation;

	public yakuza(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	public void Extorquer(Commercant com) {
		int arg = com.getArgent();
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(com.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(arg);
		com.seFaireExtorquer();
		this.parler("J'ai piqué " + arg + " sous de " + com.getNom() + " ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
