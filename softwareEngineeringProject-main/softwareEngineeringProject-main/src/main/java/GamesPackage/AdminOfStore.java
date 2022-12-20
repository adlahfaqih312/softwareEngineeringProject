package GamesPackage;


public class AdminOfStore {
	private String username;
	private String pasword;
	private Boolean login;
	//AdminOfStore admin =new AdminOfStore ();
	public AdminOfStore() {
		super();
	    this.pasword="";
	    this.username="";
		this.login = false;
		
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
	public Boolean getLogin() {
		return login;
	}
	public void setLogin(Boolean login) {
		this.login = login;
	}
	
	public Boolean login() {
		
		for (int i = 0; i <Store.admins.size() ; i++)
	
		{
			if (getUsername().equalsIgnoreCase(Store.admins.get(i).getUsername())
					&& getPasword().equalsIgnoreCase(Store.admins.get(i).getPasword())) {
				Store.admins.get(i).setLogin(true);
			//	System.out.println(Store.admins.size());
				return true;
			}
		
		}
		return false;
	}
	
	public boolean logout(String username) {
		
		for (int i = 0; i < Store.admins.size(); i++)
	
		{
			if (username.equalsIgnoreCase(Store.admins.get(i).getUsername())&& Store.admins.get(i).getLogin().equals(Boolean.FALSE)) 
			 {
					Store.admins.get(i).setLogin(false);
					return true;
				}
	
			
		}
		return false;
	
	}

}
