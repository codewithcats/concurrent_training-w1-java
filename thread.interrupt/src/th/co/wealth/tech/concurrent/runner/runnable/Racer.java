package th.co.wealth.tech.concurrent.runner.runnable;

import java.util.Random;

public class Racer implements Runnable {
	private RaceRef ref;
	private String name;
	private int goal = 100;
	private int current = 0;
	private int maxStep = 10;
	private int maxSleep = 1000;
	
	public Racer(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(current < goal) {
			Random r = new Random();
			int nextStep = r.nextInt(maxStep) + 1;
			current += nextStep;
			System.out.println(name + ": I moved " + nextStep + " steps forward. Now I am at " + current);
			try {
				int sleepTime = r.nextInt(maxSleep);
				System.out.println(name + ": I will take a rest for " + sleepTime + " millisecond. zzZZZ");
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				System.out.println(name + ": Oh...I give up.");
				return;
			}
		}
		System.out.println(name + ": Yes!! I get a goal!");
		ref.notifyFinished();
	}
	
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getMaxStep() {
		return maxStep;
	}
	public void setMaxStep(int maxStep) {
		this.maxStep = maxStep;
	}
	public int getMaxSleep() {
		return maxSleep;
	}
	public void setMaxSleep(int maxSleep) {
		this.maxSleep = maxSleep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RaceRef getRef() {
		return ref;
	}
	public void setRef(RaceRef ref) {
		this.ref = ref;
	}
}
