package th.co.wealth.tech.concurrent.runner.thread;

public class TurtleOnlyRace {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		System.out.println("Created new Turtle.");
		turtle.start();
		System.out.println("Let Turtle run.");
	}

}
