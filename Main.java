

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner InputReader = new Scanner(System.in);
		
		
		Car[] myCars ={
			
			new Car("HGR-987"),
			new Car("EFX-395"),
			new Car("ACW-900")};
		
		
		int sum = 0;
		
		for(int i=0; i < myCars.length; i++){
		myCars[i].getPlateNr();
		System.out.println("Enter the speed of car " + myCars[i].getPlateNr());
		int speed = InputReader.nextInt();
		myCars[i].setSpeed(speed);
		sum = sum + myCars[i].getSpeed();
		}
	
		InputReader.close();
		int average = sum / myCars.length;
		
		System.out.println("The average speed of cars is " + average + "Km/h" );
			 	  
	
				
	
	}
}
