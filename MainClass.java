package homework;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {

		BattleShip[] nizBrodova = new BattleShip[3];
		
		nizBrodova[0] = new SmallShip();
		nizBrodova[1] = new BigShip();
		nizBrodova[2] = new CommandShip();
		
		int brojNapada = 0;
		boolean mogucNapad = true;
		
		while (mogucNapad) {
			Random rn = new Random();
			int napadIx = rn.nextInt(3);
			int odbranaIx = rn.nextInt(3);
			
			if (napadIx == odbranaIx) {
				continue;
			}
			if (nizBrodova[napadIx].getHealth() <= 0 || nizBrodova[odbranaIx].getHealth() <= 0) {
				continue;
			}
			brojNapada++;
			System.out.println("Napad broj: " + brojNapada);
			
			nizBrodova[napadIx].attack(nizBrodova[odbranaIx]);
			
			System.out.println("Napada brod: " + nizBrodova[napadIx]);
			System.out.println("Napadnuti brod: " + nizBrodova[odbranaIx]);
			System.out.println();
					
			int brojac = 0;
			for (int i = 0; i < 3; i++) {
				if (nizBrodova[i].getHealth() > 0) {
					brojac++;
				}
			}
			
			mogucNapad = brojac > 1;
		}
		
		for (int i = 0; i < 3; i++) {
			if (nizBrodova[i].getHealth() > 0) {
				System.out.println("Pobjednik je brod: " + nizBrodova[i]);
				break;
			}
		}
	}
}
