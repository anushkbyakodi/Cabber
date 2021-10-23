package windows;

import java.util.ArrayList;
import java.util.List;

class Customer{
	String fullName;
	String userName;
	int custId;
	String email;
	String phone;
	String pwd;
	static int count = 0;
	int ride = 0;
	public List <RideLog> logList;
	double money;
	boolean status;
	
	
	/*--------------*/
	
	public Customer() {}
	Customer(String fullName,String userName,String email,String phone,String pwd){
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.custId = count;
		count+=1;
		logList = new ArrayList<RideLog>();
		money = 2000;
	}
	
	public String toString() {
		return "\n\nCust ID: "+custId +"  Name: "+ fullName+ "  UserName: "+ userName + "\nEmail: "+ email + "  Phone: "+ phone+ "  Balance: "+ money;
	}
	
	public void printDetails() {
		System.out.println("Cust ID: "+custId +"Name: "+ fullName+ " UserName"+ userName + "Email: "+ email + "Phone: "+ phone);
	}
	
	int getCId() {
		return custId;
	}
	String getUN() {
		return userName;
	}
	String getPS() {
		return pwd;
	}
	
	double getM() {
		return money;
	}
	
	void createRide(String s, String d, String vId, int cId, int dId, double fr, double dist,int uni) {
		System.out.println("Driver id Customer: "+dId);
		logList.add(new RideLog(s,d,vId,cId,dId,fr,dist,ride,uni));
		money-=fr;
		ride+=1;
		status = true;
	}
	
	void rideStatus(int i) {
		RideLog last = logList.get(logList.size() - 1);
		if(i==1) {
			last.cStatus("Ride Complete");
		}
		else {
			last.cStatus("Ride Cancelled");
			money += last.fare;
		}
		status = false;
	}
	
	void addM(double m) {
		money+=m;
	}
	
	int current() {
		RideLog last = logList.get(logList.size() - 1);
		String msg = last.status;
		
		if(msg == "Waiting For Ride") {
			return 0;
		}
		else if(msg == "Ride Cancelled") {
			return -1;
		}
		else {
			return 1;
		}	
	}
	
	String currentS() {
		RideLog last = logList.get(logList.size() - 1);
		return last.toString();
	}
	
	RideLog currentLog() {
		RideLog last = logList.get(logList.size() - 1);
		return last;
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
	
	void displayAll() {
		for(RideLog l: logList ) {
			System.out.println(l);
		}
	}
}
