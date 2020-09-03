package edu.albany.model;

	public class Ship {

		public String shipName;
		public String shipYear;

		   // constructor for name and year
		   public Ship(String ship, String year)
		   {
		       this.shipName = ship;
		       this.shipYear = year;
		   }
		   
		   public Ship() {
			   shipName = "";
			   shipYear = "";
		   }

		   // get methods
		   public String getShipName()
		   {
		       return shipName;
		   }
		   
		   public void setShipName(String shipName) {
			   this.shipName = shipName;
		   }

		   public String getYear()
		   {
		       return shipYear;
		   }
		   
		   public void setYear(String shipYear) {
			   this.shipYear = shipYear;
		   }

		   // Override toString method
		   public String toString()
		   {
		       System.out.println("Ship Name : " + this.shipName + "\nBuilt Year : " + this.shipYear);
		       return this.shipName + this.shipYear;
		   }

	
	}

