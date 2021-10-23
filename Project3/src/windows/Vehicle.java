package windows;


interface Vehicle{
	void displayDetails();
	void distanceTravelled();
	String getVId();
	public double getCost();
	int getType();
	}


abstract class VehicleAb implements Vehicle{
	public String vehicleId;
	int vehicleType;
	double costPerKm;
	int numSeat;
	double distance;
	static int num=0;
	
	VehicleAb(){
		this.vehicleId = "hello";
		this.vehicleType = 1;
		this.costPerKm = 100;
		this.numSeat = 0;
		this.distance  = 0;
		num+=1;
	}
	
	VehicleAb(String Id, int type, double cost, int seat){
		this.vehicleId = Id;
		this.vehicleType = type;
		this.costPerKm = cost;
		this.numSeat = seat;
		this.distance  = 0;
		num+=1;
	}
	
	static int totalVehicles() {
		return num;
	}
	
	public void displayDetails() {
		System.out.println("VehicleId:" + vehicleId+"\nCost per kilometer: "+ costPerKm + "\nNumber Of Seats: "+ numSeat);
	}
	
	public void distanceTravelled() {
		System.out.println("Distance Travelled is: "+ distance);
	}
	
	public String toString() {
		return "\nVehicleId: " + vehicleId+ " Vehicle Type: " + vehicleType+" Cost per kilometer: "+ costPerKm + " Number Of Seats: "+ numSeat;
	}
	
	
	public String getVId(){
		return vehicleId;
	}
	
	public double getCost() {
		return costPerKm;
	}
	
	public int getType() {
		return vehicleType;
	}
}

class Mini extends VehicleAb{
	Mini(){
		super();
	}
	
	Mini(String Id, int type, double cost, int seat){
		super(Id, type, cost, seat);
	}
	
	
	public void displayDetails() {
		System.out.println("Vehicle Type: Mini\n" );
		super.displayDetails();
	}
	
}

class SUV extends VehicleAb{
	SUV(){
		super();
	}
	
	SUV(String Id, int type, double cost, int seat){
		super(Id, type, cost, seat);
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Type: SUV\n" );
		super.displayDetails();
	}
}

class Sedan extends VehicleAb{
	Sedan(){
		super();
	}
	
	Sedan(String Id, int type, double cost, int seat){
		super(Id, type, cost, seat);
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Type: Sedan\n" );
		super.displayDetails();
	}
}

class VehicleFactory{
	static public VehicleAb createV(int type,String Id) {
		if(type == 1) {
			return new Mini(Id, 1, 10.0, 4);
		}
		else if(type == 2) {
			return new SUV(Id, 2, 15.0, 6);
		}
		else{
			return new Sedan(Id, 3, 20.0, 5);
		}
	}
}
