package personnages;

public class yakuza extends Humain {
	private String clan;
	protected int reputation;

	public yakuza(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
		this.reputation = 4;
	}
	public void Extorquer(Commercant com) {
		int arg = com.getArgent();
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		this.parler(com.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		gagnerArgent(arg);
		com.seFaireExtorquer();
		this.parler("J'ai piqu� " + arg + " sous de " + com.getNom() + " ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi! Hi!");
	}
	public int perdre() {
		this.reputation --;
		parler("J'ai perdu mon duel et mes " + this.getArgent() + " sous, snif... J'ai déshonoré le clan de " + this.clan);
		this.perdreArgent(this.getArgent());
		return this.getArgent();
	}
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation ++;
		parler("Ce ronin pensait battre " + this.getNom() + " du clan de " + this.getNom() + " ? Je l'ai dépouillé de ses " + gain + " sous.");		
	}
}
