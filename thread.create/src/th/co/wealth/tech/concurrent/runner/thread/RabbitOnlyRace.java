package th.co.wealth.tech.concurrent.runner.thread;

public class RabbitOnlyRace {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		System.out.println("Created new Rabbit.");
		rabbit.start();
		System.out.println("Let Rabbit run.");
	}

}
