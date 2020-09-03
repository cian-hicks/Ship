package edu.albany.model;
import edu.albany.cargo.CargoShip;
import edu.albany.cruise.CruiseShip;

public class ShipDriver extends Ship{

	public static void main(String[] args) {
		Ship[] shipsArray;
		shipsArray = new Ship[3];
		
		Ship ship = new Ship("Ship", "1958");
		CruiseShip cruiseShip = new CruiseShip(4500, "Cruise Ship");
		CargoShip cargoShip = new CargoShip(500, "Cargo Ship");		
		
		shipsArray[0] = ship;
		shipsArray[1] = cruiseShip;
		shipsArray[2] = cargoShip;
	
	for(int i =0; i<3;i++) {
		shipsArray[i].toString();
	}
	}
}

