package th.co.wealth.tech.concurrent.runner.thread;

public class TurtleVSRabbitRace {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		Rabbit rabbit = new Rabbit();
		System.out.println("START!");
		turtle.start();
		rabbit.start();
	}

}
