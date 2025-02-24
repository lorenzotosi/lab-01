package pcd.lab01.ex01;

import org.fusesource.jansi.Ansi;

public class MessageThread extends Thread {

	private final int x0;
	private final int y0;
	private final Screen screen;
	private final String message;
	private final Ansi.Color color1;
	private final int sleepTime;

	public MessageThread(String myName, int x0, int y0, Screen screen, String word,
						 Ansi.Color color1, int sleepTime) {
		super(myName);
		this.x0 = x0;
		this.y0 = y0;
		this.screen = screen;
		this.message = word;
		this.color1 = color1;
		this.sleepTime = sleepTime;
	}
	
	public void run(){
		for (int i = 1; i < 30; i++) {
			screen.writeStringAt(y0+i, x0, color1, message);
			try {
				Thread.sleep(sleepTime);
			} catch (Exception ex) {}
			screen.writeStringAt(y0+i, x0, Ansi.Color.BLACK, message);
		}
		screen.writeStringAt(y0+30, x0, color1, message);
	}

}
