import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter the ID"); // �Է�â ����
		String brightness = JOptionPane.showInputDialog("Enter the Brightness"); 
		
		Elevator myElevator = new Elevator(id); // instance ����
		myElevator.callForUp(1);
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " Mood Lamp");
		moodLamp.setBright(Double.parseDouble(brightness));
		moodLamp.on();
	}

}
