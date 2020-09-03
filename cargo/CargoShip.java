package edu.albany.cargo;
import edu.albany.model.Ship;

public class CargoShip extends Ship  {

	public int cargoCapacity;
	
	public CargoShip(int cc, String name) {
		this.cargoCapacity = cc;
		this.shipName = name;
	}
	
	public CargoShip() {
		this.cargoCapacity = 0;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	public String toString() {
	 System.out.println("\nShip Name: " + this.shipName + " \nCargo Capacity: "+ this.cargoCapacity);
	 return this.shipName + this.cargoCapacity;
		    }

	}
	


