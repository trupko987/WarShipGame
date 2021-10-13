package homework;

public abstract class Ship {
	
	protected int health;
	protected int speed;

	public Ship(int health, int speed) {
		this.health = health;
		this.speed = speed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//metoda za primanje napada
	public int getDamage(int damage) {
		this.health = this.health - damage;
		
		if (this.health <= 0 ) {
			System.out.println("Brod je unisten!");
		}
		
		return health;
	}
}
