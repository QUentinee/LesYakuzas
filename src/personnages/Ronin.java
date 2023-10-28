package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	public void donner(Commercant beneficiaire) {
		int don = (int) ((float) (this.getArgent()) * 0.1);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
	public void provoquer(yakuza adversaire) {
		int force = 2 * (this.honneur);
		if(force >= adversaire.reputation) {
			this.gagnerArgent(adversaire.getArgent());
			this.honneur ++;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa");
			adversaire.perdre();
		}
		else {
			this.honneur --;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(getArgent());
		}
	}
}
