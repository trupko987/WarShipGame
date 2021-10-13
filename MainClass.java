package homework;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {

		//Ideja je da napravim niz brodova (napravio sam samo tri, da bude skraceno, ali moglo je biti koliko god) gdje svako svakog napada
		//kao bacaju kockicu i sad onda nasumicno napadaju i na kraju ko ostane taj je pobjednik
		//klasu cargo i njene cerke klase nisam ni koristio jer se po zadatku nije nista ni trazilo osim pravljenja
		//bilo je mucenja, plus dosta posla ovih dana, jedva stizem da uradim
		
		BattleShip[] nizBrodova = new BattleShip[3];
		
		nizBrodova[0] = new SmallShip();
		nizBrodova[1] = new BigShip();
		nizBrodova[2] = new CommandShip();
		
		int brojNapada = 0;
		boolean mogucNapad = true;
		
		while (mogucNapad) {
			Random rn = new Random(); //htio sam da improvizujem kockicu, pa sam trazio pomoc prijatelja koji mi je objasnio ovaj nacin
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
			
			mogucNapad = brojac > 1; //skracena verzija kondicionala (koristio google)
		}
		
		for (int i = 0; i < 3; i++) {
			if (nizBrodova[i].getHealth() > 0) {
				System.out.println("Pobjednik je brod: " + nizBrodova[i]);
				break;
			}
		}
	}
}
