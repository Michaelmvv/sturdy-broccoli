
public class Car {
	private boolean isRunning;

	public void stop() {
		this.isRunning = false;
		System.out.println("Stoped!");
	}

	public void goForward(int i) {
		System.out.println("Moved forward " + i);
	}

	public void start() {
		this.isRunning = true;

		System.out.println("Car has started");
	}
}
