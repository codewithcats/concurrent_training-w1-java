package th.co.wealth.tech.concurrent.runner.runnable;

public class TurtleVSRabbitRace {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		Rabbit rabbit = new Rabbit();
		Thread turtleThread = new Thread(turtle);
		Thread rabbitThread = new Thread(rabbit);
		System.out.println("START!");
		turtleThread.start();
		rabbitThread.start();
	}
}
