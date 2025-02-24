package pcd.lab01.ex01;

import org.fusesource.jansi.Ansi;

/**
 * 
 * Simple program showing basic features 
 * of J-ANSI lib.
 *
 * To be run from a command line.
 *
 * java -cp target/pcd-lab-01-1.0-SNAPSHOT.jar pcd.lab01.ex01.TestScreen
 * 
 */
public class TestScreen {

	public static void main(String[] args) {

		Screen screen = Screen.getInstance();
		screen.clear();
		
		/*var x0 = 1;
		var y0 = 10;
		
		for (int i = 1; i < 80; i++) {					
			screen.writeStringAt(y0, x0 + i, Color.RED, "Hello");
			try {
				Thread.sleep(100);
			} catch (Exception ex) {}
			screen.writeStringAt(y0, x0 + i, Color.BLACK, "Hello");
		}*/

		MessageThread start = new MessageThread("uno", 0, 10, screen, "this", Ansi.Color.BLUE, 500);
		MessageThread is = new MessageThread("due", 6, 10, screen, "is", Ansi.Color.WHITE, 200);
		MessageThread a = new MessageThread("tre", 9, 10, screen, "a", Ansi.Color.CYAN, 100);
		MessageThread falling = new MessageThread("quattro", 11, 10, screen, "falling", Ansi.Color.BLUE,1000);
		MessageThread sentence = new MessageThread("cinque", 19, 10, screen, "sentence", Ansi.Color.WHITE, 300);

		start.start();
		is.start();
		a.start();
		falling.start();
		sentence.start();
	}

}
