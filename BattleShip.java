package homework;

public abstract class BattleShip extends Ship {
	
	public int damage;
	
	public BattleShip(int health, int speed, int damage) {
		super(health, speed);
		this.damage = damage;
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void attack(Ship ship) {
		
		ship.getDamage(this.damage);	
	}

}
