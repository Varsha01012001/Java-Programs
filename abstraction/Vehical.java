package abstraction;

public abstract class Vehical {
	public Vehical() {
		System.out.println("constructore in abstract class:");
	}

	public void run() {
		System.out.println("running safely:.....");
	}

	public abstract void changeGear();
}
