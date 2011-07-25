package th.co.wealth.tech.concurrent.runner.runnable;

import java.util.LinkedList;
import java.util.List;

public class RaceRef {
	
	private List<Thread> racers = new LinkedList<Thread>();

	public boolean addRacerThread(Thread racerThread) {
		return racers.add(racerThread);
	}
	
	public void notifyFinished() {
		for(Thread t: racers) {
			if(t.isAlive())
				t.interrupt();
		}
	}

}
