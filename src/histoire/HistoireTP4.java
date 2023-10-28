package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Humain;
import personnages.yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 54);
		yakuza yaku = new yakuza("Yaku Le Noir", "thé", 54, "Warsong");
		roro.provoquer(yaku);		
	}
}

