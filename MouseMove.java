import java.awt.*;
import java.util.*;

public class MouseMove {
	public MouseMove() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					int xCoord = 500;
				    int yCoord = 500;
				    Robot robot = new Robot();
				    robot.mouseMove(xCoord, yCoord);
				} catch (AWTException e) {
				}
				System.out.println("Bloop");
			  }
		}, 2*60*1000, 2*60*1000);
	}

	public static void main(String[] args) {
		MouseMove app = new MouseMove();
	}

}
