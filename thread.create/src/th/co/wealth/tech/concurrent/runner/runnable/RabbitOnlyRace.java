package th.co.wealth.tech.concurrent.runner.runnable;

public class RabbitOnlyRace {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		System.out.println("Created new Rabbit.");
		Thread t = new Thread(rabbit);
		t.start();
		System.out.println("Let Rabbit run.");
	}

}
