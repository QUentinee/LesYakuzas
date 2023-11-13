package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
		this.seigneur = seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
}
