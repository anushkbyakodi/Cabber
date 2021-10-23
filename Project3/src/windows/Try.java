package windows;
import java.time.LocalTime; // import the LocalDate class
import java.util.HashSet;
public class Try {

	public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    if(cars.contains("BMW")) {
	    	System.out.println("hi");
	    }
		
	}

}
