package edu.albany.cruise;
import edu.albany.model.Ship;

public class CruiseShip extends Ship {

	   public int maxPassengers =0;

	   public CruiseShip(int maxPassengers, String name) {
	       this.maxPassengers = maxPassengers;
	   	   this.shipName = name;
	   }

	   public CruiseShip(int passengers) {
		   this.maxPassengers = passengers;
	   }
	   
	   public int getMaxPassengers()
	   {
	       return maxPassengers;
	   }
	   
	   public void setMaxPassengers(int maxPassengers) {
		   this.maxPassengers = maxPassengers;
	   }

	   public String toString()
	   {
	       System.out.println("\nShip Name : " + this.shipName + "\nMaximum Number of passengers : " +
	       this.maxPassengers);
	       return this.shipName + this.maxPassengers;
	   }
}