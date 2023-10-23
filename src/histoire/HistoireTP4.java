package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		yakuza yaku = new yakuza("Yaku Le Noir","whisky",30,"Warsong");
		yaku.direBonjour();
		yaku.Extorquer(marco);
	}
}

