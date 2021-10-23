package windows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		RideBookerApp instance = RideBookerApp.getInstance();
		
	    try {
	        File myObj = new File("D:\\JavaProjects\\Project3\\Customer.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          String[] splited = data.split("\\s+");
	          String nm = splited[0];
	          String un = splited[1];
	          String em = splited[2];
	          String ph = splited[3];
	          String pwd = splited[4];
	          boolean out = instance.custRegister(nm,un,em,ph,pwd);
	 
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	    try {
	        File myObj = new File("D:\\JavaProjects\\Project3\\Driver.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          String[] splited = data.split("\\s+");
	          String nm = splited[0];
	          String un = splited[1];
	          String em = splited[2];
	          String ph = splited[3];
	          String vid = splited[4];
	          String typ = splited[5];
	          int type =Integer.parseInt(typ);
	          String pwd = splited[6];
	          boolean out = instance.driveRegister(nm,un,em,ph,vid,type,pwd);
	 
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		
		
		
		try {
			Frame1 frame = new Frame1(instance);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();

	}

}}
