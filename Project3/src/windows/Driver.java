package windows;

import java.util.ArrayList;
import java.util.List;

class Driver{
	public String fullName;
	String userName;
	String email;
	String phone;
	public Vehicle vh;
	String pwd;
	int driverId;
	boolean status;
	static int dCount = 0;
	int ride = 0;
	double money;
	List <RideLog> logList;
	
	public Driver() {}
	Driver(String fullName,	String userName,String email,String phone,String vehicleId,int vehicleType,String pwd){
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.driverId = dCount;
		status = false;
		dCount+=1;
		logList = new ArrayList<RideLog>();
		money = 0;
		vh = VehicleFactory.createV(vehicleType, vehicleId);
	}
	
	public String toString() {
		String vType;
		
		if(vh.getType()==1)
			vType = "Mini";
		else if(vh.getType()==1)
			vType = "SUV";
		else
			vType = "Sedan";
					
		return "\n\nDriver ID: "+driverId +" Name: "+ fullName+ " UserName"+ userName + "\nEmail: "+ email + " Phone: "+ phone + "\nVehicle details: "+ vh ;
	}
	
	String getVhId() {
		return vh.getVId();
	}
	
	int getDId() {
		return driverId;
	}
	
	public int getType() {
		return vh.getType();
	}
	
	double getCost() {
		return vh.getCost();
	}
	
	String getName() {
		return fullName;
	}
	
	void setStatus(boolean st) {
		status = st;
	}
	
	void createRide(String s, String d, String vId, int cId, int dId, double fr, double dist,int uni) {
		System.out.println("Driver id Driver: "+dId);
		logList.add(new RideLog(s,d,vId,cId,dId,fr,dist,ride,uni));
		money+=fr;
		status = true;
	}
	
	public void printDetails() {
		System.out.println("Driver ID: "+driverId +"Name: "+ fullName+ " UserName"+ userName + "Email: "+ email + "Phone: "+ phone);
	}
	
	String getUN() {
		return userName;
	}
	
	String getPS() {
		return pwd;
	}
	
	void rideStatus(int i) {
		RideLog last = logList.get(logList.size() - 1);
		if(i==1) {
			last.cStatus("Ride Complete");
		}
		else {
			last.cStatus("Ride Cancelled");
			money -= last.fare;
		}
		status = false;
	}
	
	int rideFinder(int id) {
		int i =0;
		for(RideLog r: logList) {
			if(r.getId()==id) {
				return i;
			}
			i+=1;
		}
		return -1;
	}
}