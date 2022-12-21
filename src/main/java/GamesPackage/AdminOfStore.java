package games_package;


public class AdminOfStore {
	private String username;
	private String pasword;
	
	public AdminOfStore() {
		super();
	    this.pasword="";
	    this.username="";
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
	public Boolean login() {
		
		return false;
	}
	
	public boolean logout(String username) {
		
	
		return false;
	
	}

}
