package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	static AirField airField = new AirField();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AirField hanger = new AirField();
		
		do {
		displaymenu();
		}while(true);
		
	}

	
	
	public static void displaymenu() {
		CargoPlane cargo = new CargoPlane(null, 0, 0, 0);
		FighterJet fighter = new FighterJet(null, 0, 0, 0);
		
		
		System.out.println("Make a selection from the menu below: ");
		System.out.println(
				" 1) List Fleet \n 2) Fly all Jets \n 3) View Fastest Jets \n 4) View jet with longest range \n 5) Load all Cargo jets \n 6) Dogfight \n 7) Add a jet to Fleet \n 8) Quit");
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		if (selection == 1) {
			airField.printAllJets();
		} 
		else if (selection == 2) {
			airField.flyAllJets(airField);
		}
		else if (selection == 3) {
			airField.viewFastestJet(airField);
		}
		else if (selection == 4) {
			airField.viewLongestRangeJet(airField);
		}
		else if (selection == 5) {
			cargo.loadCargo();
		}
		else if (selection == 6) {
			fighter.fight();
		}
		else if (selection == 7) {

			System.out.println("It's time to add a new Jet to the Fleet!");
			System.out.println("Enter the model of the Jet: ");
			String model = input.next();
			System.out.println("Enter the speed of the Jet: ");
			double speed = input.nextDouble();
			System.out.println("Enter the range of the Jet: ");
			int range = input.nextInt();
			System.out.println("Enter the price of the Jet: ");
			long price = input.nextLong();
			JetsImpl addAJet = new JetsImpl(model, speed, range, price);
			airField.addAJet(addAJet);
		}
		else if (selection == 8) {
			System.out.println("Goodbye");
			
			System.exit(0);
		}
		
	}

}
