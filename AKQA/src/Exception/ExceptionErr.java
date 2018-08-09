package Exception;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ExceptionErr {
	
	public  void LocationErr() {
			try {
				Robot robot;
				Thread.sleep(3000);
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
		        robot.keyPress(KeyEvent.VK_TAB);
		        robot.keyRelease(KeyEvent.VK_TAB);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
			    e.printStackTrace();
		}
	}

}