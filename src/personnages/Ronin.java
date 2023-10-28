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
}
