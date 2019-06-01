import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public static void main(String[] args) {
		
		Robot value = new Robot();
		value. setSpeed(10);
		value.moveTo(50, 500);
		value.move(90);
		value.penDown();
		value.move(100);
		value.turn(90);
        value.move(20);
        value.turn(90);
        value.move(100);
        value.turn(-90);
        value.setPenWidth(5);
        value.setPenColor(000,102, 000);
        value.move(20);
        value.setPenColor(000,255,017);

	}
	
}
