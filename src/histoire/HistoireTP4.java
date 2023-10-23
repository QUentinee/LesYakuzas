package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.parler(marco.getArgent() + " sous! Je te remercie généreux donateur");
	}
}

