package homework;

public class SmallShip extends BattleShip {
	
	public SmallShip() {
		super(300, 0, 50);	
	}

	@Override
	public String toString() {
		return String.format("SmallShip [health = %d, damage = %d]", health, damage);
	}
}
