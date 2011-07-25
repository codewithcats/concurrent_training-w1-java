package th.co.wealth.tech.concurrent.runner.runnable;

public class TurtleOnlyRace {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		System.out.println("Created new Turtle.");
		Thread t = new Thread(turtle);
		t.start();
		System.out.println("Let Turtle run.");
	}

}
