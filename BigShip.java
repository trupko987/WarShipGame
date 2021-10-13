package homework;

public class BigShip extends BattleShip {

	public BigShip() {
		super(500, 0, 100);	
	}

	@Override
	public String toString() {
		return String.format("BigShip [health = %d, damage = %d]", health, damage);
	}
}
