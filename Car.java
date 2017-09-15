
public class Car {

	private String plateNr;
	private int currentSpeed;
	private static final int MAX_SPEED = 240;
	
	
	
	
	
	Car(String inputPlateNr){
		plateNr = inputPlateNr;
	}
	
	public String getPlateNr(){
		return plateNr;
	
	}
	
	public boolean setSpeed(int speed){
		if (speed < 0 || speed > MAX_SPEED){
			return false;
		}
		else {
			currentSpeed = speed;
			return true;
		}
	}
	
	public int getSpeed(){
		return currentSpeed;
	}
	
	
	
	
}
