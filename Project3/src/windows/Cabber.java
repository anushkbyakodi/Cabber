package windows;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;


abstract class Cabber {
	int companyId;
	String companyName;
	
	public String tostring() {
		return "Company Name: "+companyName+  "Company Id" + companyId;
	}
}

final class CException extends Throwable{
	int err;
	String error;
	
	CException(){}
	CException(int err, String error){
		this.err = err;
		this.error = error;
	}

}

class RideBookerApp extends Cabber{
	String versionNo;
	public List <Driver> driveList;
	List <Customer> custList;
	List <RideLog> logList;
	HashSet userNames;
	HashSet vehicleIds;
	static int ride = 0;
	private static RideBookerApp instance = new RideBookerApp();
	
	
	private RideBookerApp(){
		companyId = 1;
		companyName = "Cabber";
		versionNo = "0.1";
		driveList = new ArrayList<Driver>();
		custList = new ArrayList<Customer>();
		logList = new ArrayList<RideLog>();
		userNames = new HashSet<String>();
		vehicleIds = new HashSet<String>();
	}
	
	public String tostring(){
		return "Company ID: " + companyId + "\nCompany name: "+ companyName+ "\nVersion Num: "+ versionNo;
	}
	
	   
	public static RideBookerApp getInstance(){
	      return instance;
	}
	
	boolean custRegister(String fullName,String userName,String email,String phone,String pwd) {
		
		if(userNames.contains(userName)) {
			System.out.println("Error User Exists\n");
			return false;
		}
		
		custList.add(new Customer(fullName, userName, email, phone, pwd));
		userNames.add(userName);
		return true;
		
	}
	
	boolean driveRegister(String fullName,	String userName,String email,String phone,String vehicleId,int vehicleType,String pwd) {
		
		if(userNames.contains(userName) || vehicleIds.contains(vehicleId)) {
			System.out.println("Error User Exists\n");
			return false;
		}
		
		driveList.add(new Driver(fullName, userName, email, phone,vehicleId,vehicleType, pwd));
		userNames.add(userName);
		vehicleIds.add(vehicleId);
		
		return true;
		
	}
	
	Driver lastDriver() {
		Driver last = driveList.get(driveList.size() - 1);
		return last;
	}
	
	Customer lastCust() {
		Customer last = custList.get(custList.size() - 1);
		return last;
	}
	
	int freeDrv(int type) {
		int i = 0;
		for(Driver drv: driveList) {
			if(drv.status==false && drv.getType() == type) {
				return i;
			}
			i=i+1;
		}
		return -1;
	}
	
	int findDrv(int id) {
		int i = 0;
		for(Driver drv: driveList) {
			if(drv.driverId==id) {
				return i;
			}
			i=i+1;
		}
		return -1;
	}
	
	void createRide(String s, String d, String vId, int cId, int dId, double fr, double dist, int rId) {
		logList.add(new RideLog(s,d,vId,cId,dId,fr,dist,rId, rId));
	}
	
	boolean confirmRide(Customer c,Driver drv,  String s, String d, double fare, double dist) {
		
			String VId = drv.getVhId();
			int dId = drv.getDId();
			int cId = c.getCId();
			System.out.println("Driver id instance:"+dId);

			drv.createRide(s,d,VId,cId,dId,fare,dist,ride);
			c.createRide(s, d, VId, cId, dId, fare, dist,ride);
			this.createRide(s, d, VId, cId, dId, fare, dist, ride);
			ride+=1;

		return false;
	}
	
	void rideStatus(int i, int uid, Customer c, Driver d) {
		RideLog r = logList.get(uid);
		if(i==1) {
			r.cStatus("Ride Complete");
		}
		else {
			r.cStatus("Ride Cancelled");
		}
		
		c.rideStatus(i);
		d.rideStatus(i);
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