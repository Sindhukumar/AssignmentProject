
import java.util.Scanner;
public class GettingAndStoring {

	public void store() {
		Scanner keyboard = new Scanner(System.in); 
		
		String firstInitial = keyboard.next(); 
		String lastName = keyboard.next(); 
		String houseNumber = keyboard.next(); 
		String streetName = keyboard.next(); 
		String streetType = keyboard.next(); 
		String city = keyboard.next(); 
		
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
		keyboard.close();

	}

}
