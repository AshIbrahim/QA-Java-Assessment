import java.util.*;
import java.text.*;
import java.util.Calendar;


public class TicketMachine {
	 
	
	private static final String currentDate = null;

	private static final DateFormat sdf = null;

	public static void main (String[] args) {
		{
		
	
	// Create the Date
	Date currentDate = new Date ();
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	
	// Day of the week and Wednesday argument
	
	Calendar c = Calendar.getInstance();
	c.setTime(currentDate);
	{
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if  ((dayOfWeek >= 4)==true) {
			price = (int) - 2;
		
		
	}
		
		
	// Create the different type of tickets.
	
	private String type;
	
    type = "OAP";
    type = "Student";
    type = "Standard";
    type = "Child";
	
		
	// The price of a cinema ticket.
	private static int price;
	
	price.type("Oap")=6;
	price.type("Student")=6;
	price.type("Standard")=8;
	price.type("Child")=4;
	
	
	// The total amount of tickets Purchased.
	
	private int quantity;
	
	quantity.type ("Oap") = 1;
	quantity.type("Student")=1;
	quantity.type("Standard")=1;
    quantity.type("Child")=1;	
	
	
	// The total price of the tickets
    	private static int total;
	
	total.price.quantity.type("Oap");
	total.price.quantity.type("Student");
	total.price.quantity.type("Standard");
	total.price.quantity.type("Child");
	
	
	// Ticket Machine generated to to issue cinema tickets of the given price, the price must be greater than Zero and there are no checks to ensure this.
	
	public TicketMachine (int ticketCost)
	{
		price = ticketCost;
		quantity = 0;
		total = 0;
		
	}
		
		
		// return the price of a cinema ticket
		
		public int getPrice()
		{
			return price;
			}
		
		// Printed Ticket
	
		
		{
	
		System.out.println ("#######################################################");
		System.out.println ("Ibrahim's Cinema");
		System.out.println ("#######################################################");
		System.out.println("Current Date: " + sdf.format(currentDate));
		Object dayOfWeek;
		System.out.println(dayOfWeek);
		System.out.println(("Enter Type of Ticket Oap/Student/Standard/Child:" +type));
		System.out.println("Enter Quantity" + quantity);
		System.out.println(total);
		System.out.println(type + quantity + total);
		System.out.println(price);
		
		}

		
		
		
	}
				
	
		
		
	