package eggtimer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("Timer running!.");
	}
	
}

class Alert implements Runnable {
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg Cooked");
	}
	
}

public class TimerUtil {
	public static void runEggTimer() {
		var timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 60000L);
		var executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Alert(), 10, 1L, TimeUnit.MINUTES);


		executor.schedule(() -> {
            timer.cancel();
            executor.shutdown();
            System.exit(0);
        }, 10, TimeUnit.MINUTES);
	}
}
