package GamesPackage;


public class UsersOfStore {
	private String ID;
	private String name;
	private String email;
	private Boolean login;
	
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
	public Boolean getLogin() {
		return login;
	}
	public void setLogin(Boolean login) {
		this.login = login;
	}
	
	public Boolean login() {
			
			for (int i = 0; i < Store.Users.size(); i++)
			{
				if (getName().equalsIgnoreCase(Store.Users.get(i).getName())
						&& getEmail().equalsIgnoreCase(Store.Users.get(i).getEmail())
						&& getID().equalsIgnoreCase(Store.Users.get(i).getID())
	
						) {
					Store.Users.get(i).setLogin(true);
					return true;
				}
			}
			return false;
		}
	public boolean logout(String username) {
			
			for (int i = 0; i < Store.Users.size(); i++)	
			{
				if (username.equalsIgnoreCase(Store.Users.get(i).getName())
						&& Store.Users.get(i).getLogin().equals(Boolean.FALSE)) 
				 {
						Store.Users.get(i).setLogin(false);
						return true;
					}			
			}
			return false;
		}	

	



}
