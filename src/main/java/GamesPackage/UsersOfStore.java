package GamesPackage;

import java.util.ArrayList;


public class UsersOfStore {
	private String ID;
	private String name;
	private String email;
	private Boolean login;
	public static ArrayList<UsersOfStore> clients =new ArrayList<UsersOfStore>() ;
	public  ArrayList<MyGame> borroweditems2 =new ArrayList<MyGame>() ;
	public int fine=0;
	public int reg=0;
	public boolean late=false;
	
	public UsersOfStore() {
		super();
	    this.name="";
	    this.ID="";
		this.email ="";
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		this.ID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Boolean login() {
			
			for (int i = 0; i < Store.Users.size(); i++)
			{
			}
			return false;
		}
	


}
