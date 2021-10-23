package Assesment;
import java.util.*;

import javax.swing.JOptionPane;

import java.time.LocalTime; 

class RideLog {
	String source;
	String destn;
	LocalTime tmObj;
	String vehicleId;
	int custId;
	int driverId;
	String status;
	double fare;
	double distance;
	int rideId;
	static int rideNum = 0;
	
	RideLog(){}
	RideLog(String s, String d, String vId, int cId, int dId, double fr, double dist){
		source = s;
		destn = d;
		tmObj =  LocalTime.now();
		vehicleId = vId;
		custId = cId;
		vehicleId = vId;
		status = "Waiting For Ride";
		fare = fr;
		distance = dist;
		rideId = rideNum;
		rideNum+=1;
		this.toString();
		
	}
	
	public String toString() {
		return "Ride ID: "+ rideId+"\nSource: " + source + "\nDestination: " + destn +  "\nCustomerId: "+custId+ "\nDriverId: "+ driverId +  "\nTime: "+ tmObj+"\nFare: "+ fare;
	}
	
	int getId() {
		return rideId;
	}
}



class Customer{
	String fullName;
	String userName;
	int custId;
	String email;
	String phone;
	String pwd;
	static int count = 0;
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
		money = 1000;
	}
	
	public String toString() {
		return "\nCust ID: "+custId +" Name: "+ fullName+ " UserName"+ userName + "\nEmail: "+ email + " Phone: "+ phone;
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
	
	void createRide(String s, String d, String vId, int cId, int dId, double fr, double dist) {
		logList.add(new RideLog(s,d,vId,cId,dId,fr,dist));
		status = true;
	}
	
	int rideFinder(int id) {
		for(RideLog r: logList) {
			if(r.getId()==id) {
				return id;
			}
		}
		return -1;
	}
	
	void displayAll() {
		for(RideLog l: logList ) {
			System.out.println(l);
		}
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
	
	public String toString() {
		return "Error num: "+err+"\t"+error;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		String str = "anush";
		boolean result1=str.matches("[a-zA-Z]*$");
		
		System.out.println(result1);

	}

}
