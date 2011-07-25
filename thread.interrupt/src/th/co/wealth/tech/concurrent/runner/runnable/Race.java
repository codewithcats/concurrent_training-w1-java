package th.co.wealth.tech.concurrent.runner.runnable;

public class Race {

	public static void main(String[] args) throws InterruptedException {
		Racer turtle1 = new Racer("Turtle 1");
		Racer turtle2 = new Racer("Turtle 2");
		Racer turtle3 = new Racer("Turtle 3");
		Racer turtle4 = new Racer("Turtle 4");
		Racer rabbit = new Racer("Rabbit 1");
		rabbit.setMaxSleep(2000);
		rabbit.setMaxStep(20);
		
		RaceRef ref = new RaceRef();
		turtle1.setRef(ref);
		turtle2.setRef(ref);
		turtle3.setRef(ref);
		turtle4.setRef(ref);
		rabbit.setRef(ref);
		
		Thread turtle1Thread = new Thread(turtle1);
		Thread turtle2Thread = new Thread(turtle2);
		Thread turtle3Thread = new Thread(turtle3);
		Thread turtle4Thread = new Thread(turtle4);
		Thread rabbitThread = new Thread(rabbit);
		
		ref.addRacerThread(rabbitThread);
		ref.addRacerThread(turtle1Thread);
		ref.addRacerThread(turtle2Thread);
		ref.addRacerThread(turtle3Thread);
		ref.addRacerThread(turtle4Thread);
		
		System.out.println("START!");
		turtle1Thread.start();
		turtle2Thread.start();
		turtle3Thread.start();
		turtle4Thread.start();
		rabbitThread.start();
		
		turtle1Thread.join();
		turtle2Thread.join();
		turtle3Thread.join();
		turtle4Thread.join();
		
		System.out.println("Race ended...");
	}

}
