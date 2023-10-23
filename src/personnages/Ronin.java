package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
	}
	private void donner(Commercant beneficiaire) {
		float don = (float) ((float)this.getArgent()) * 0.1;
	}
}
