import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot value = new Robot();
	public static void main(String[] args) {
		
		
		value.setSpeed(10);
		value.moveTo(50, 500);
		value.move(90); 
		value.penDown();
	
        drawHouses();    
        
        value.setPenWidth(5);
        value.setPenColor(000,102, 000); //(Second building)
        value.move(20);
        value.setPenColor(000,255,017);
        value.turn(-90);
        value.move(90);
        value.turn(45);
        value.move(25);

	}
	public static void drawHouses() {
		
		value.move(100);  //(First building)
		value.turn(90);
        value.move(20);
        value.turn(90);
        value.move(100);
        value.turn(-90);    //(end of building#1)
	
	}
}
