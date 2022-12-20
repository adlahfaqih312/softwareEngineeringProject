package GamesPackage;

import java.util.Calendar;


public class DateServer {
	
	public  Calendar datedserver;
 
	
	public DateServer() {
		
		datedserver=getDate();
	}
	
	public Calendar getDate() {
		
        return Calendar.getInstance();
        
	}
}