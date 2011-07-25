package th.co.wealth.tech.concurrent.runner.thread;

import java.util.Random;

public class Turtle extends Thread {
	private int goal = 100;
	private int current = 0;
	private int maxStep = 10;
	private int maxSleep = 1000;
	
	@Override
	public void run() {
		while(current < goal) {
			Random r = new Random();
			int nextStep = r.nextInt(maxStep) + 1;
			current += nextStep;
			System.out.println("Turtle: I moved " + nextStep + " steps forward. Now I am at " + current);
			try {
				int sleepTime = r.nextInt(maxSleep);
				System.out.println("Turtle: I will take a rest for " + sleepTime + " millisecond. zzZZZ");
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				System.out.println("Turtle: I was interrupted!");
			}
		}
		System.out.println("Turtle: Yes!! I get a goal!");
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
}
