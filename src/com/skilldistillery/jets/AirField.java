package com.skilldistillery.jets;

public class AirField {

	Jet[] jets;

	public AirField() {
		super();
		this.jets = populateJets();
	}

	public Jet[] populateJets() {
		Jet jetsStarter[] = new Jet[100];
		jetsStarter[0] = new Bomber("B-52", 400.00, 13000, 100000000);
		jetsStarter[1] = new CargoPlane("Airbus A400", 780.00, 9300, 120000000);
		jetsStarter[2] = new FighterJet("F35", 600.00, 12000, 105000000);
		jetsStarter[3] = new Recon("Sneaky-1", 800.00, 14000, 100000000);
		jetsStarter[4] = new FighterJet("Fighting Falcon", 200.00, 19000, 500000000);

		return jetsStarter;
	}

	public void addAJet(Jet jet) {

		for (int i = 0; i < this.jets.length; i++) {
			if (this.jets[i] == null) {
				jets[i] = jet;
				System.out.println("A new Jet has been added: " + jets[i].getModel());
				break;
			}
		}

	}

	public void printAllJets() {

		for (int i = 0; i < this.jets.length; i++) {
			if (this.jets[i] != null) {
				System.out.println("Model: " + this.jets[i].getModel() + " Speed in MPH: " + this.jets[i].getSpeed()
						+ " Range: " + this.jets[i].getRange() + " Price: $" + this.jets[i].getPrice());
			}

		}

	}

	public void flyAllJets(AirField air) {

		for (int i = 0; i < this.jets.length; i++) {
			if (this.jets[i] != null) {
				jets[i].fly();
				;
			}
		}
	}

	public void viewFastestJet(AirField air) {
		int placeOfJet = 0; // Use this to keep track of fastest jet
		double max = 0;
		String name = null;
		for (int i = 0; i < this.jets.length; i++) {

			if (this.jets[i] != null) {
				double speed = this.jets[i].getSpeed();
				if (speed > max) {

					max = speed;
					name = this.jets[i].getModel();
					

				}
			}
		}
		System.out.println(name);
	}
	
	public void viewLongestRangeJet(AirField air) {
		int placeOfJet = 0; // Use this to keep track of fastest jet
		double max = 0;
		String name = null;
		for (int i = 0; i < this.jets.length; i++) {

			if (this.jets[i] != null) {
				double speed = this.jets[i].getRange();
				if (speed > max) {

					max = speed;
					name = this.jets[i].getModel();
					

				}
			}
		}
		System.out.println(name);
	}
	
	public void loadCargoCarrier(AirField air) {
		System.out.println(this.jets);
	}

}
