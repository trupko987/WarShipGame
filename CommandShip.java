package homework;

public class CommandShip extends BattleShip {

	private final int shield = 20;

	public CommandShip() {
		super(1000, 0, 150);
	}

	@Override
	public int getDamage(int damage) {

		this.health = this.health - damage + shield;

		if (this.health <= 0 ) {
			System.out.println("Brod je unisten!");
		}
		return health;	
	}

	@Override
	public String toString() {
		return String.format("CommandShip [health = %d, damage = %d, shield = %d]", health, damage, shield);
	}
	
}
