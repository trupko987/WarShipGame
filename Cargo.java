package homework;

public abstract class Cargo extends Ship {
	
	protected int capacity;
	
	public Cargo(int health, int speed, int capacity) {
		super(health, speed);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
