package org.sj;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class MouseMover {
	public static final int FIVE_SECONDS = 10000;
	
	public static void main(String... args) throws Exception{
		Robot robot = new Robot();
		while(true){
			final Point location = MouseInfo.getPointerInfo().getLocation();
			final int x = (int) (location.getX() + 2);
			final int y = (int) location.getY();
			robot.mouseMove(x, y);
			Thread.sleep(FIVE_SECONDS);
		}
	}

}
