package games_package;

import java.util.ArrayList;
import java.util.List;


public class UsersOfStore {
	private String id;
	private String name;
	private String email;
	protected static final List<UsersOfStore> clients =new ArrayList<>() ;
	private static final  List<MyGame> borroweditems2 =new ArrayList<>() ;
	public static final int FINE=0;
	public static final int REG=0;
	public static final boolean LATE=false;
	
	public UsersOfStore() {
		super();
	    this.name="";
	    this.id="";
		this.email ="";
	}
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Boolean login() {
			return false;
		}

	public static List<UsersOfStore> getClients() {
		return clients;
	}

	public static List<MyGame> getBorroweditems2() {
		return borroweditems2;
	}
	


}
