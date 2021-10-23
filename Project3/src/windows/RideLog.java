package windows;
import java.time.LocalTime;
import java.time.LocalDate;

public class RideLog {
	String source;
	String destn;
	LocalTime tmObj;
	LocalDate dtObj;
	String vehicleId;
	int custId;
	int driverId;
	String status;
	double fare;
	double distance;
	int rideId;
	int uniId;
	
	RideLog(){}
	RideLog(String s, String d, String vId, int cId, int dId, double fr, double dist, int rId, int uId){
		source = s;
		destn = d;
		tmObj =  LocalTime.now();
		dtObj =  LocalDate.now();
		vehicleId = vId;
		custId = cId;
		vehicleId = vId;
		driverId = dId;
		status = "Waiting For Ride";
		fare = fr;
		distance = dist;
		rideId = rId;
		uniId = uId;
	}
	
	public String toString() {
		return "Ride ID: "+ rideId+"\nSource: " + source + "\nDestination" + destn +  "\nCustomerId: "+custId+ "\nDriverId: "+ driverId +"\nDate: "+dtObj+  "\nTime: "+ tmObj+"\nFare: "+ fare+"\nStatus: "+status;
	}
	
	void cStatus(String s) {
		status = s;
	}
	
	int getId() {
		return rideId;
	}
}
